
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Recipe {
    private int cookingTime;
    private String name;
    private ArrayList<String> ingredients;
    
    public Recipe(ArrayList<String> ingredients, String name, int cookingTime) {
        this.cookingTime = cookingTime;
        this.name = name;
        this.ingredients = ingredients;
    }
    
    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
