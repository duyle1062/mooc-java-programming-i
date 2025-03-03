/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Container {
    private int containingAmount;
    
    public Container() {
        this.containingAmount = 0;
    }
    
    public int contains() {
        return this.containingAmount;
    }
    
    public void add(int amount) {
        if (amount <= 0 ) {
            return;
        }
        
        this.containingAmount += amount;
        
        if (this.containingAmount >= 100) {
            this.containingAmount = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount <= 0) {
            return;
        }
        
        this.containingAmount -= amount;
        
        if (this.containingAmount <= 0) {
            this.containingAmount = 0;
        }
    }
    
    public String toString() {
        return this.containingAmount + "/100";
    }    
    
}
