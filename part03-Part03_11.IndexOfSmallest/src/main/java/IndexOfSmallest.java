
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int value = Integer.valueOf(scanner.nextLine());

            if (value == 9999) {
                break;
            }

            list.add(value);

        }

        System.out.println("\n");
        int smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.print("Smallest number: " + smallest);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
