package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

        public void display() {
            ArrayList<Product> inventory = getInventory();
            Scanner scanner = new Scanner(System.in);
            System.out.println("We carry the following inventory: ");
            for (int i = 0; i < inventory.size(); i++) {
                Product p = inventory.get(i);
                System.out.printf("id: %d %s - Price: $%.2f",
                        p.getId(), p.getName(), p.getPrice());
            }
        }
        public ArrayList<Product> getInventory() {
            ArrayList<Product> inventory = new ArrayList<Product>();
            inventory.add(new Product(7483872, "Vash", 14.99F));
            return inventory;
        }
    }

