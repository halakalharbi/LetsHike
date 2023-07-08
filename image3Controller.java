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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author qukya
 */
public class image3Controller implements Initializable {

    @FXML
    private Button NEXT;

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private Button back;

    @FXML
    private ImageView image3;

    @FXML
    void NEXTAction(ActionEvent event) {
        
//TO CONNECT ANOTHER WINDOW
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("image4.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }


    }

    @FXML
    void backAction(ActionEvent event) {
        
//TO CONNECT ANOTHER WINDOW
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("image2.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }


    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

}
