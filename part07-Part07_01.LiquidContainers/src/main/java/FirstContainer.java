/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class FirstContainer {
    private int containingAmount;
    
    public FirstContainer() {
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
    
    public int move(int amount) {
        int movingAmount = 0;
        
        if (amount <= 0) {
            movingAmount = 0;
        } else if (this.containingAmount - amount <= 0) {
            movingAmount = this.containingAmount;
            this.containingAmount = 0;
        } else {
            movingAmount = amount;
            this.containingAmount -= amount;
        }
        
        return movingAmount;
    }
    
    public String toString() {
        return "First: " + this.containingAmount + "/100";
    }
}
