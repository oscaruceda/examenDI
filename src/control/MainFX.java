package control;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;



/*
 * @author Oscar
 * @version 3.0 
 * 
 * 
 */
public class MainFX extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
          FXMLLoader loader =new FXMLLoader(getClass().getResource("../vista/Login.fxml"));
            AnchorPane pane=loader.load();
            Scene scene=new Scene(pane);
            scene.getStylesheets().addAll(getClass().getResource("styles.css").toExternalForm());
            Font.loadFont(getClass().getResourceAsStream("../vista.assets.fonts/PoiretOne-Regular.ttf"), 20);
            primaryStage.setTitle("EXAMEN DESARROLLO DE INTERFACES");
            primaryStage.setScene(scene);
            primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
