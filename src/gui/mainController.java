package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import main.bouquets.Bouquet;
import main.order.Order;

import java.io.IOException;
import java.util.Objects;

public class mainController {
    protected Order order = new Order();
    public void addBouquet(ActionEvent e) throws IOException {
        Bouquet obj = new Bouquet();
        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bouquetMenu.fxml")))));

        order.addBouquet(obj);
    }
}
