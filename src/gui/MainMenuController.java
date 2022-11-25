package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
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
    private Parent root;
    private Stage stage;
    private Scene scene;

    public void addBouquet(ActionEvent e) throws IOException {
        this.bouquet = new Bouquet();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("bouquetMenu.fxml"));
        root = loader.load();
        BouquetMenuController bouquetMenuController = loader.getController();
        bouquetMenuController.T(bouquet);
        stage.setScene(scene);
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);

        stage.show();
    }
//    public void deleteBouquet(ActionEvent e) throws IOException {
//        //order.delBouquet(0);
//        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("deleteBouquet.fxml")));
//        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//    public void showOrder(ActionEvent e) throws IOException {
//        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("showOrder.fxml")));
//        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//    public void payOrder(ActionEvent e) throws IOException {
//        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("payOrder.fxml")));
//        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//    public void cancelOrder(ActionEvent e) {
//        this.order=new Order();
//    }
//    public void exit(ActionEvent e) {
//        System.exit(0);
//    }
//    public void backToMain(ActionEvent e) throws IOException {
//        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AppMainMenu.fxml")));
//        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//
//
//
//    @FXML
//    private ChoiceBox<String> flowerChoiceBox = new ChoiceBox<>();
//    @FXML
//    private TextField count = new TextField();
//    private final String[] flowers = {"redrose", "whiterose", "yellowtulip", "blacktulip"};
//    public void addFlowersButton(ActionEvent e) throws IOException {
//        root = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("addFlowers.fxml")));
//        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//    public void addFlowers(ActionEvent e){
//        BouquetUtils.addFlowersToBouquet(bouquet, flowerChoiceBox.getValue(), Integer.parseInt(count.getText()));
//    }
//    public void backToBouquet(ActionEvent e) throws IOException {
//        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bouquetMenu.fxml")));
//        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        flowerChoiceBox.getItems().addAll(flowers);
//    }
}
