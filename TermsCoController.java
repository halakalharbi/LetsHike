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
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author qukya
 */
public class TermsCoController implements Initializable {

    @FXML
    private AnchorPane panel;
    @FXML
    private ImageView TermsPics;
    @FXML
    private Label LetsHike2;
    @FXML
    private Label TermsCo;
    @FXML
    private Label Cond;
    @FXML
    private RadioButton Agree;
    @FXML
    private ButtonBar BB;
    @FXML
    private Button Ex;
    @FXML
    private Button Payment;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AgreeAction(ActionEvent event) {
    }

    @FXML
    private void ExAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void PaymentAction(ActionEvent event) {
        //TO CONNECT ANOTHER WINDOW
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Invoice.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
    
}
