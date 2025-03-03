/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }
    
    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        for (Item item : items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
    
    public String toString() {
        int numberOfItems = this.items.size();
        if (numberOfItems == 0) {
            return "no items (0 kg)";
        } else if (numberOfItems == 1) {
            return numberOfItems + " item (" + totalWeight() + " kg)";
        } 
        
        return numberOfItems + " items (" + totalWeight() + " kg)";
    }
}
