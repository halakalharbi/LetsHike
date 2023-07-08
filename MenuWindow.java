/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuwindow;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author qukya
 */
public class MenuWindow extends Application {
    
    @Override
    public void start(Stage stage) {
        //START CODE
 try {
            // Load the FXML file.
            Parent parent = FXMLLoader.load(getClass().getResource("MENUWindow.fxml"));

            // Build the scene graph.
            Scene scene = new Scene(parent);

            // Display our window, using the scene graph.
            stage.setTitle("Let's Hike!");
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            System.out.println("FXML Loading Error");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
