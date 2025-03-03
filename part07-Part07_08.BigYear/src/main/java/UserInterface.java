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
    private ArrayList<Bird> birds;
    private Scanner scanner;
    
    public UserInterface(ArrayList<Bird> birds, Scanner scanner) {
        this.birds = birds;
        this.scanner = scanner;
    }
    
    public void add() {
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Name in Latin:");
        String latinName = scanner.nextLine();
        
        birds.add(new Bird(name, latinName));
    }
    
    public void observation() {
        System.out.println("Bird?");
        String name = scanner.nextLine();
        
        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equals(name)) {
                birds.get(i).addObservation();
                break;
            }
        }
    }
    
    public void all() {
        for (int i = 0; i < birds.size(); i++) {
            System.out.println(birds.get(i).toString());
        }
    }
    
    public void one() {
        System.out.println("Bird?");
        String name = scanner.nextLine();
        
        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equals(name)) {
                System.out.println(birds.get(i).toString());
                break;
            }
        }
    }
    
    public void start() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                add();
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("All")) {
                all();
            } else if (command.equals("One")) {
                one();
            } 
        }
    }
}
