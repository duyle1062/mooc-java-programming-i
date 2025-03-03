
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(fileName))) {

            while (reader.hasNextLine()) {
                String name = reader.nextLine();
                Integer cookingTime = Integer.valueOf(reader.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                
                while (reader.hasNextLine()) {
                    String ingredient = reader.nextLine();
                    
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    
                    ingredients.add(ingredient);
                }
//                System.out.println(name);
//                System.out.println(cookingTime);
//                for (int i = 0; i < ingredients.size(); i++) {
//                    System.out.println(ingredients.get(i));
//                }
                
                recipes.add(new Recipe(ingredients, name, cookingTime));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        UserInterface ui = new UserInterface(recipes, scanner);
        ui.start();
    }

}
