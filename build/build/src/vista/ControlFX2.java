package vista;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class ControlFX2 implements Initializable  {
	@FXML
    JFXButton action;
	  @Override
	    public void initialize(URL location, ResourceBundle resources) {

	    }
	  public void cerrar() {
		  System.exit(0);
	  }
}
