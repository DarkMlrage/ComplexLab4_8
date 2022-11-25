package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.bouquets.Bouquet;
import main.utils.BouquetUtils;

import java.io.IOException;
import java.util.Objects;

//public class BouquetMenuController {
//    protected Bouquet bouquet;
//
//    public BouquetMenuController(Bouquet bouquet){
//        this.bouquet=bouquet;
//    }
//    public void showScene() throws IOException {
//        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bouquetMenu.fxml")))));
//    }
//    public void addFlowers(ActionEvent e) throws IOException {
//        AddFlowersController addFlowersController = new AddFlowersController(bouquet);
//        addFlowersController.showScene();
//    }
//
//}
