package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import main.bouquets.Bouquet;
import main.utils.BouquetUtils;

import java.io.IOException;
import java.util.Objects;

public class BouquetMenuController {
    protected Bouquet bouquet;
    BouquetMenuController(Bouquet bouquet){
        this.bouquet=bouquet;
    }
    public void addFlowers(ActionEvent e) throws IOException {
        new AddFlowersController(bouquet);
        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("addFlowers.fxml")))));
    }

}
