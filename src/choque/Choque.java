/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choque;

import java.nio.file.Path;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.util.Duration;
/**
 *
 * @author choqu_000
 */
public class Choque extends Application {
    
    @Override
    public void start(Stage primaryStage) {
          primaryStage.setTitle("Simple Animation");
        
        Group root = new Group();
        Scene escena = new Scene(root, 512, 512);
        
       
        
        Image carretera = new Image ("choque/img/road.png");
        ImageView carreteravista = new ImageView(carretera);

        Image persona = new Image("choque/img/persona.png");
        ImageView personaVista = new ImageView(persona);
        personaVista.setLayoutX(140);
        personaVista.setLayoutY(90);
        personaVista.setPreserveRatio(true);
        
        Image carro = new Image("choque/img/car.png");
        ImageView carrovista = new ImageView(carro);
        carrovista.setLayoutX(90);
        carrovista.setLayoutY(380);
                        
        TranslateTransition trtr = new TranslateTransition(Duration.millis(5000), carrovista);
        trtr.setByY(-180);
        
       
        trtr.setCycleCount(Timeline.INDEFINITE);       
        trtr.play();
        
        root.getChildren().addAll(carreteravista,carrovista, personaVista);
        primaryStage.setScene(escena);
        primaryStage.show();   
    }

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
