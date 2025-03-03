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
import java.util.Scanner;

public class UserInterface {

    private ArrayList<Recipe> recipes;
    private Scanner scanner;

    public UserInterface(ArrayList<Recipe> recipes, Scanner scanner) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n");

        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("list")) {
                list();
            } else if (command.equals("find name")) {
                findName();
            } else if (command.equals("find cooking time")) {
                findCookingTime();
            } else if (command.equals("find ingredient")) {
                findIngredient();
            } else {
                break;
            }
        }
    }

    public void list() {
        System.out.println("\nRecipes:");
        for (int i = 0; i < recipes.size(); i++) {
            System.out.println(recipes.get(i).toString());
        }
        System.out.println("");
    }

    public void findName() {
        System.out.println("Searched word: ");
        String nameSearched = scanner.nextLine();

        System.out.println("\nRecipes:");
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getName().contains(nameSearched)) {
                System.out.println(recipes.get(i).toString());
            }
        }
        
        System.out.println("");
    }

    public void findCookingTime() {
        System.out.println("Max cooking time: ");
        Integer timeSearched = Integer.valueOf(scanner.nextLine());

        System.out.println("\nRecipes:");
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getCookingTime() <= timeSearched) {
                System.out.println(recipes.get(i).toString());
            }
        }
        
        System.out.println("");
    }

    public void findIngredient() {
        System.out.println("Ingredient: ");
        String ingredientSearched = scanner.nextLine();

        System.out.println("\nRecipes:");
        for (int i = 0; i < recipes.size(); i++) {
            ArrayList<String> ingredients = this.recipes.get(i).getIngredients();
            for (int j = 0; j < ingredients.size(); j++) {
                if (ingredients.get(j).equals(ingredientSearched)) {
                    System.out.println(recipes.get(i).toString());
                    break;
                }
            }
        }
        
        System.out.println("");
    }
}
