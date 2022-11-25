package gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import main.bouquets.Bouquet;

import java.io.IOException;
import java.util.Objects;

public class AddFlowersController {
    protected Bouquet bouquet;
    AddFlowersController(Bouquet bouquet){
        this.bouquet=bouquet;
    }
    public void showScene() throws IOException {
        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("addFlowers.fxml")))));
    }
}
