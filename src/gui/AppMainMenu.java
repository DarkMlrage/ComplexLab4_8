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
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("FlowerAPP");
        initRootLayout();
    }
    public void initRootLayout(){
        try{
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AppMainMenu.fxml")));
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
