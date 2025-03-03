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

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void add() {
        System.out.print("To add: ");
        String toAddCommand = scanner.nextLine();
        this.list.add(toAddCommand);
    }
    
    public void print() {
        this.list.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(scanner.nextLine());
                
        this.list.remove(index);
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                add();
            } else if (command.equals("list")) {
                print();
            } else if (command.equals("remove")) {
                remove();
            }
        }
    }
}
