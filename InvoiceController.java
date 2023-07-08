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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author qukya
 */
public class InvoiceController implements Initializable {

    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private ImageView picture1;
    @FXML
    private Label Label1;
    @FXML
    private Label Label2;
    @FXML
    private Button Next;
    @FXML
    private Label Label3;
    @FXML
    private Label Label4;
    @FXML
    private Label Label5;
    @FXML
    private ImageView Visa;
    @FXML
    private ImageView MaterCard;
    @FXML
    private ImageView barcode;
    @FXML
    private ImageView paypal;
    @FXML
    private Label TXT;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void NextAction(ActionEvent event) {
        //TO CONNECT ANOTHER WINDOW
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("THANKU.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
    
}
