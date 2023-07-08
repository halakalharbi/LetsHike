/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuwindow;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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
public class InfosWindowController implements Initializable {

    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private ImageView IMAGESd;
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
    private VBox Vbox1;
    @FXML
    private TextField NameTxt;
    @FXML
    private TextField AgeTxt;
    @FXML
    private ComboBox<String> CityCombo;
    @FXML
    private TextField PNtxt;
    @FXML
    private TextField Emailtxt;
    @FXML
    private TextField Passwordtxt;
    @FXML
    private RadioButton Femalebutton;
    @FXML
    private ToggleGroup GenderGroup;
    @FXML
    private ButtonBar ButtonBar;
    @FXML
    private Button ExitButton;
    @FXML
    private Button NextButton;
    @FXML
    private Label LetsHike2;
    @FXML
    private Label Infos;
    @FXML
    private RadioButton Male;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
           CityCombo.getItems().addAll(
        
        "Abha","Ad-Dilam","Al Bukayriyah","Badr","Baljurashi","Bisha"
                ,"Bareq","Buraydah","Albaha","Dammam","Dahran","Dhurma",
                "Diriyah","Duba","Farrasan","Hofuf","Hafr Al-Batin","Jeddah",
                "Jizan","Jubail","Khafji","Khaybar","King Abdullah Economic City",
                "Khoba","Al Lith","Medina","Mecca","Najran","Qatif","Riadh","Taif",
                "Tabuk","Al-'Ula","Al Wajh","Zulfi"
        
        );
    }    

    @FXML
    private void CityComboAction(ActionEvent event) {
    }

    @FXML
    private void FemaleAction(ActionEvent event) {
    }

    @FXML
    private void ExitButtonAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void NextButtonAction(ActionEvent event) throws Exception {
        String gen;
        //Step 1: input validation
        inputValidation();

        //Step2: send the data to the third window
        try {
            //hide the current window
           ((Node)event.getSource()).getScene().getWindow().hide();
          
           //load third window
           FXMLLoader loader = new FXMLLoader(getClass().getResource("Confirmation.fxml"));
           Parent root = loader.load();
           
           //create obkect of the third window controller
           ConfirmationController controller3 = loader.getController();
           
           if(Male.isSelected())
               gen = "Male";
           else
               gen = "Female";
           
           controller3.setUserData(NameTxt.getText(),Passwordtxt.getText(), Emailtxt.getText(),
                   PNtxt.getText(),AgeTxt.getText(),gen,
                   CityCombo.getValue());
   
           //show the third window
           Stage stage = new Stage();
           stage.setScene(new Scene(root));
           stage.show();
   
       } catch (IOException e) {
           e.printStackTrace();
       }
    }


    @FXML
    private void MaleAction(ActionEvent event) {
    }
    
    private void inputValidation() throws Exception {

        //First: check that all fields are valid
        if (!validateName()) {
            //only letters
            JOptionPane.showMessageDialog(null, "Invalid Name !", "Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        if (!validateAge()) {
            //only numbers
            JOptionPane.showMessageDialog(null, "Invalid Age !", "Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        if (CityCombo.getValue() == null ||CityCombo.getValue().equals("")) {
            JOptionPane.showMessageDialog(null, "Select City!", "Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        if (!validateEmail()) {

            JOptionPane.showMessageDialog(null, "Invalid Email !", "Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        if (!validatePhoneNo()) {
            //only numbers
            JOptionPane.showMessageDialog(null, "Invalid Phone Number!", "Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        if (!validateAge()) {
            //only numbers
            JOptionPane.showMessageDialog(null, "Invalid Age !", "Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        
        
        if (!Male.isSelected() && !Femalebutton.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select a Gender!", "Error", JOptionPane.ERROR_MESSAGE);
            throw new Exception();
        }
        
    }

    private boolean validateName() {

        return NameTxt.getText().matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    

    private boolean validateEmail() {

        return Emailtxt.getText().matches("^(.+)@(.+)$");
    }

    private boolean validatePhoneNo() {

        return PNtxt.getText().matches("(05)[0-9]{8}");

    }

    private boolean validateAge() {

        return AgeTxt.getText().matches("\\d{1,3}");
    }
    private boolean validatePassword() {

        return Passwordtxt.getText().matches("\\d{8}");

    }
}

    
