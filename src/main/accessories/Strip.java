package main.accessories;

import main.accessories.Accessory;
import main.accessories.Color;

public class Strip extends Accessory {
    public Strip(Color color) {
        super(color, 5);
    }

    @Override
    public String toString() {
        return "\n'Strip'\n" + super.toString();
    }
}
