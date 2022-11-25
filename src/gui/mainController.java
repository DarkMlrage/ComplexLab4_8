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
    public void deleteBouquet(ActionEvent e) throws IOException {
        //order.delBouquet(0);
        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("deleteBouquet.fxml")))));

    }
    public void showOrder(ActionEvent e) throws IOException {
        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("showOrder.fxml")))));
    }
    public void payOrder(ActionEvent e) throws IOException {
        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("showOrder.fxml")))));
    }
    public void cancelOrder(ActionEvent e) throws IOException {
        this.order=new Order();
    }
    public void exit(ActionEvent e) throws IOException {
        System.exit(0);
    }
}
