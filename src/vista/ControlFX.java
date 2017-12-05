package vista;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import control.MainFX;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX implements Initializable {

    @FXML
    JFXButton action;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
    @FXML
    public void GetStarted () {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainFX.class.getResource("../vista/FreeSolo.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("FreeSolo");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

}