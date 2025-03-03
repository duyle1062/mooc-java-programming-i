
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
            count++;
        }

        System.out.println("");
       
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Average: " + 1.0*sum/count);
        
    }
}
