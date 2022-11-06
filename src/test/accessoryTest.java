package test;

import main.accessories.Color;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class accessoryTest {
    @Test
    public void getColorByNameTest(){
        Color expected =  Color.valueOf("RED");
        Color actual = Color.getColorByName("red");
        Assertions.assertEquals(expected, actual);
    }
}
