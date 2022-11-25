package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.bouquets.Bouquet;
import main.order.Order;

import java.io.IOException;
import java.util.Objects;

public class MainMenuController {
    protected Order order = new Order();
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void addBouquet(ActionEvent e) throws IOException {
        Bouquet obj = new Bouquet();


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
        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("payOrder.fxml")))));
    }
    public void cancelOrder(ActionEvent e) {
        this.order=new Order();
    }
    public void exit(ActionEvent e) {
        System.exit(0);
    }
    public void back(ActionEvent e){
        AppMainMenu.initRootLayout();
    }
}
