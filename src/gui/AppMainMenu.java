package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.menu.MainMenu;

import java.io.IOException;
import java.util.Objects;

public class AppMainMenu extends Application {
    private Stage primaryStage;
    private MainMenu mainMenu = new MainMenu();
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("FlowerAPP");
        initRootLayout();
    }
    public void initRootLayout(){
        try{
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainMenu.fxml")));
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch (IOException e){
            e.printStackTrace();
        }

    }
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
