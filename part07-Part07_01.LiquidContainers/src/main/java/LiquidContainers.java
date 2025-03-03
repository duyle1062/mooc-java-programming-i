
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FirstContainer first = new FirstContainer();
        SecondContainer second = new SecondContainer();

        while (true) {
            System.out.println(first);
            System.out.println(second);
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                int movingAmount = first.move(amount);
                second.add(movingAmount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
