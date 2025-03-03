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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    
    public int totalWeight() {
        int sum = 0;
        for (Suitcase suitcase : suitcases) {
            sum += suitcase.totalWeight();
        }
        return sum;        
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
