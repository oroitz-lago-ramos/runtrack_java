package com.example.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Créer les composants de l'interface utilisateur
        Label nameLabel = new Label("Nom :");
        TextField nameTextField = new TextField();
        Button submitButton = new Button("Envoyer");

        // Créer le FlowPane et y ajouter les composants
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(nameLabel, nameTextField, submitButton);

        // Créer la scène avec le FlowPane
        Scene scene = new Scene(flowPane, 300, 200);

        // Configurer la fenêtre principale
        primaryStage.setTitle("Exemple de FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
}