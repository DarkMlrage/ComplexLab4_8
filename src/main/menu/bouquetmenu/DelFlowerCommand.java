package main.menu.bouquetmenu;

import main.bouquets.Bouquet;
import main.menu.Command;

import java.util.List;

public class DelFlowerCommand implements Command {
    private final Bouquet bouquet;

    public DelFlowerCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public String getKey(){
        return "del_flower";
    }
    @Override
    public String getParams(){
        return " 'index'";
    }
    @Override
    public void execute(List<String> params) {
        bouquet.getFlowers().remove(Integer.parseInt(params.get(0))-1);
        System.out.println("Flower deleted from bouquet");
    }
}
