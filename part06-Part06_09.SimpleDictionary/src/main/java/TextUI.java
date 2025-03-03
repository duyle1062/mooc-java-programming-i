/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: ");
        String translation = scanner.nextLine();
                
        this.dictionary.add(word, translation);
    }
    
    public void search() {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();
                
        String translation = this.dictionary.translate(word);
                
        if (translation != null) {
            System.out.print("Translation: " + this.dictionary.translate(word));
        } else {
            System.out.println("Word " + word + " was not found");
        }
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals("add")) {
                add();
            } else if (command.equals("search")) {
                search();
            } else {            
                System.out.println("Unknown command");
            }
        }                
    }
}
