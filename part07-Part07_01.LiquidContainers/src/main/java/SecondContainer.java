/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class SecondContainer {
    private int containingAmount;
    
    public SecondContainer() {
        this.containingAmount = 0;
    }
    
    public void add(int amount) {
        if (amount <= 0) {
            return;
        } else if (this.containingAmount + amount >= 100) {
            this.containingAmount = 100;
        } else {
            this.containingAmount += amount;
        }
    }
    
    public void remove(int amount) {
        if (amount <= 0) {
            return;
        } else if (this.containingAmount - amount <= 0) {
            this.containingAmount = 0;
        } else {
            this.containingAmount -= amount;
        }
    }
    
    public String toString() {
        return "Second: " + this.containingAmount + "/100";
    }
}
