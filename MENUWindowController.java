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
public class MENUWindowController implements Initializable {

    @FXML
    private AnchorPane Apanel;
    @FXML
    private ImageView IMAGEdesert;
    @FXML
    private Label labelhike;
    @FXML
    private Button BookNow;
    @FXML
    private Button AboutUs;
    @FXML
    private Label LifeAdventure;
    @FXML
    private Label risk1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BookNowAction(ActionEvent event) {
        
//TO CONNECT ANOTHER WINDOW
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("OffersProvide.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }

        
    }

    @FXML
    private void AboutUsAction(ActionEvent event) {
        //TO CONNECT ANOTHER WINDOW
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("image1.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }

    }
    
}
