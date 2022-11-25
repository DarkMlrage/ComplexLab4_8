package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import main.bouquets.Bouquet;
import main.order.Order;
import main.utils.BouquetUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {
    protected Order order = new Order();
    protected Bouquet bouquet;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void addBouquet(ActionEvent e) throws IOException {
        this.bouquet = new Bouquet();
        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bouquetMenu.fxml")))));
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
    public void backToMain(ActionEvent e){
        AppMainMenu.initRootLayout();
    }


    @FXML
    private ChoiceBox<String> flowerChoiceBox;
    private String[] flowers = {"redrose", "whiterose", "yellowtulip", "blacktulip"};
    public void addFlowersButton(ActionEvent e) throws IOException {
        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("addFlowers.fxml")))));
    }
    public void addFlowers(ActionEvent e){
        BouquetUtils.addFlowersToBouquet(bouquet, flowerChoiceBox.getValue(), );
    }
    public void backToBouquet(ActionEvent e) throws IOException {
        AppMainMenu.getPrimaryStage().setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bouquetMenu.fxml")))));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        flowerChoiceBox.getItems().addAll(flowers);
    }
}
