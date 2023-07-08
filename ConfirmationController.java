/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuwindow;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author qukya
 */
public class ConfirmationController implements Initializable {

    @FXML
    private AnchorPane Anchorrpanee;
    @FXML
    private ImageView picture;
    @FXML
    private Label label1;
    @FXML
    private Label label6;
    @FXML
    private VBox Vbox1;
    @FXML
    private TextField NameTxt;
    @FXML
    private TextField AgeTxt;
    @FXML
    private TextField CityCombotxt;
    @FXML
    private TextField PNtxt;
    @FXML
    private TextField Emailtxt;
    @FXML
    private TextField Passwordtxt;
    @FXML
    private TextField Gendertxt;
    @FXML
    private VBox Vbox;
    @FXML
    private Label Name;
    @FXML
    private Label Age;
    @FXML
    private Label City;
    @FXML
    private Label PhoneNo;
    @FXML
    private Label Email;
    @FXML
    private Label Password;
    @FXML
    private Label Gender;
    @FXML
    private ButtonBar ButtonBar;
    @FXML
    private Button BackButton;
    @FXML
    private Button NextButton;
    private Hiker hi;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InfosWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }

    @FXML
    private void NextButtonAction(ActionEvent event) {
        writeToFile(hi);
        
      try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TermsCo.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
    //get data from the second window
    public void setUserData(String n, String pass, String e,
            String mob, String age,String gen, String CB) {

        int urage = Integer.parseInt(age);
        hi = new Hiker(n,pass,e,mob,CB,gen,age);
        
        NameTxt.setText(n);
        Passwordtxt.setText(pass);
        Emailtxt.setText(e);
        PNtxt.setText(mob);
        AgeTxt.setText(age);
  
        Gendertxt.setText(gen);
        CityCombotxt.setText(CB);

    }

        private void writeToFile(Object o) {
         // Create the stream objects.
        ObjectOutputStream objectOutputFile = null;
        FileOutputStream outStream = null;
        try {
           
            outStream = new FileOutputStream("LetsHike.txt");
            objectOutputFile = new ObjectOutputStream(outStream);
            // Write the serialized objects to the file.
            objectOutputFile.writeObject(o);
            //show confirmation message
            JOptionPane.showMessageDialog(null, "Your Information has been added successfully!");
            objectOutputFile.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error wrting to file");
        } catch (IOException ex) {
            System.out.println("Error wrting to file");
        }
        }
    
}
