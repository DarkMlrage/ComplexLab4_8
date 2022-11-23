package main;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import main.menu.MainMenu;
import org.apache.log4j.PropertyConfigurator;

import java.util.*;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
        primaryStage.setTitle("Help");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
//        PropertyConfigurator.configure("log4j.properties");
//
//        Scanner scanner = new Scanner(System.in);
//
//        MainMenu mainMenu = new MainMenu();
//        while (true) {
//            System.out.println("  __ Main Menu __");
//            System.out.println("Input your command: ");
//            List<String> command = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
//            mainMenu.execute(command);
//        }
    }
}
