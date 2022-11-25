package gui;

import javafx.event.ActionEvent;
import main.bouquets.Bouquet;
import main.utils.BouquetUtils;

public class BouquetMenuController {
    protected Bouquet bouquet;
    BouquetMenuController(Bouquet bouquet){
        this.bouquet=bouquet;
    }
    public void addFlowers(ActionEvent e){
        //BouquetUtils.addFlowersToBouquet();
    }

}
