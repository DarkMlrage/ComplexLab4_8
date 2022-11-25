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

public class BouquetMenuController {
    public void T (Bouquet bouquet){
        BouquetUtils.addFlowersToBouquet(bouquet, "redrose", 2);
    }




}
