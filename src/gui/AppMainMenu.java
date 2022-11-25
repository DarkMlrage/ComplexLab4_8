package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AppMainMenu extends Application {
    protected static Stage primaryStage;
    @Override
    public void start(Stage primaryStage) {
        AppMainMenu.primaryStage = primaryStage;
        AppMainMenu.primaryStage.setTitle("FlowerAPP");
        initRootLayout();
    }
    public static void initRootLayout(){
        try{
            Parent root = FXMLLoader.load(Objects.requireNonNull(AppMainMenu.class.getResource("AppMainMenu.fxml")));
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch (IOException e){
            e.printStackTrace();
        }

    }
    public static Stage getPrimaryStage() {
        return primaryStage;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
