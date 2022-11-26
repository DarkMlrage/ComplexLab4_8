package main.utils;

import main.bouquets.Bouquet;
import main.order.Order;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderUtils {
    public static void showOrder(Order order) {
        System.out.println("Total Cost: " + order.getCost());
        System.out.println("Bouquets: ");
        List<Bouquet> bouquets = order.getBouquets();
        for (int i = 1; i <= bouquets.size(); i++) {
            System.out.println("Bouquet: " + bouquets.get(i-1).getName());
            System.out.println("Cost: " + bouquets.get(i-1).getCost());
        }
    }

    public static void saveCheck(Order order) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("check.txt");
            fw.write("Card Number: " + order.getCardNumber());
            fw.write("\nBouquets: ");
            for (int i = 1; i <= order.getBouquets().size(); i++) {
                fw.write("Bouquet: " + order.getBouquets().get(i-1).getName());

                fw.write("Cost: " + order.getBouquets().get(i-1).getCost());
            }
            fw.write("\nTotal Cost: " + order.getCost());
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void payOrder(Order order) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер картки: ");
        order.setCardNumber(scanner.nextLine());
    }

    public static void cancelOrder(Order order){
        order.setCost(0);
        order.setBouquets(new ArrayList<>());
    }

    public static void saveOrder(Order order){
        String filePath = "C:\\1D\\University Projects\\ComplexLab4_8\\OrdersDB.txt";
        StringBuilder text = new StringBuilder("\nCard Number: " + order.getCardNumber() + "\nBouquets: ");

        for (int i = 1; i <= order.getBouquets().size(); i++) {
            text.append("Bouquet: ").append(order.getBouquets().get(i-1).getName());
            text.append("\nCost: ").append(order.getBouquets().get(i-1).getCost()).append("\n");
        }

        try {
            Files.write(Paths.get(filePath), text.toString().getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
