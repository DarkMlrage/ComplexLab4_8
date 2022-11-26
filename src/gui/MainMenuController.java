package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.accessories.Accessory;
import main.bouquets.Bouquet;
import main.flowers.Flower;
import main.order.Order;
import main.utils.BouquetUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {
    static Order order = new Order();
    static Bouquet bouquet = new Bouquet();
    private Parent root;
    private Stage stage;
    private Scene scene;

    public void addBouquet(ActionEvent e) throws IOException {
        MainMenuController.bouquet = new Bouquet();
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bouquetMenu.fxml")));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void deleteBouquet(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("deleteBouquet.fxml")));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void showOrder(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("showOrder.fxml")));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void payOrder(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("payOrder.fxml")));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void cancelOrder(ActionEvent e) {
        MainMenuController.order = new Order();
    }
    public void exit(ActionEvent e) {
        System.exit(0);
    }
    public void backToMain(ActionEvent e) throws IOException {
        if(MainMenuController.bouquet != null){
            MainMenuController.order.addBouquet(MainMenuController.bouquet);
        }
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AppMainMenu.fxml")));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    //  ADD FLOWERS
    @FXML
    private ChoiceBox<String> flowerChoiceBox = new ChoiceBox<>();
    @FXML
    private TextField count = new TextField();
    private final String[] flowers = {"redrose", "whiterose", "yellowtulip", "blacktulip"};
    public void addFlowersButton(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("addFlowers.fxml")));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void addFlowers(ActionEvent e){
        BouquetUtils.addFlowersToBouquet(MainMenuController.bouquet, flowerChoiceBox.getValue(), Integer.parseInt(count.getText()));
    }
    public void backToBouquet(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bouquetMenu.fxml")));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //  ADD ACCESSORY
    @FXML
    private ChoiceBox<String> colorChoiceBox = new ChoiceBox<>();
    private final String[] colors= {"red", "white", "silver", "gold"};
    public void addAccessoryButton(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("addAccessory.fxml")));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void addBow(ActionEvent e){
        BouquetUtils.addAccessoryToBouquet(MainMenuController.bouquet, "bow", colorChoiceBox.getValue());
    }
    public void addStrip(ActionEvent e){
        BouquetUtils.addAccessoryToBouquet(MainMenuController.bouquet, "strip", colorChoiceBox.getValue());
    }
    public void addFoil(ActionEvent e){
        BouquetUtils.addAccessoryToBouquet(MainMenuController.bouquet, "foil", colorChoiceBox.getValue());
    }

    //  SHOW FLOWERS
    @FXML
    private ListView<Flower> flowerListView = new ListView<>();
    public void showFlowersButton(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("showFlowers.fxml")));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //  SHOW ACCESSORIES
    @FXML
    private ListView<Accessory> accessoriesListView = new ListView<>();
    public void showAccessoriesButton(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("showFlowers.fxml")));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }









    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        flowerChoiceBox.getItems().addAll(flowers);
        colorChoiceBox.getItems().addAll(colors);
        flowerListView.getItems().addAll(bouquet.getFlowers());
        accessoriesListView.getItems().addAll(bouquet.getAccessories());
    }
}
