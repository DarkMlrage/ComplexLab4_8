package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.bouquets.Bouquet;
import main.menu.MainMenu;
import main.order.Order;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class mainController {
    protected Order order = new Order();
    public void addBouquet(ActionEvent e) throws IOException {
        Bouquet obj = new Bouquet();
        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bouquetMenu.fxml")))));

        order.addBouquet(obj);
    }
}
