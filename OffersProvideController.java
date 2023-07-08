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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author qukya
 */
public class OffersProvideController implements Initializable {

    @FXML
    private AnchorPane Pane;
    @FXML
    private ImageView ProvidePic;
    @FXML
    private Label hikee;
    @FXML
    private Label Trip;
    @FXML
    private VBox Vboxing;
    @FXML
    private Label Zipline;
    @FXML
    private Label OldTown;
    @FXML
    private Label Maraya;
    @FXML
    private VBox Vboxing1;
    @FXML
    private CheckBox CB1;
    @FXML
    private CheckBox CB2;
    @FXML
    private CheckBox CB3;
    @FXML
    private Label include;
    @FXML
    private ButtonBar ButtonBar;
    @FXML
    private Button ButtonExit;
    @FXML
    private Button ItineraryTrip;
    @FXML
    private Button ButtonNext;
    @FXML
    private Label Dprice;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ButtonExitAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void ItineraryTripAction(ActionEvent event) {
        //TO CONNECT ANOTHER WINDOW
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Itinerary Trip.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }

    }

    @FXML
    private void ButtonNextAction(ActionEvent event) {
        //TO CONNECT ANOTHER WINDOW
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InfosWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }

    }
    
}
