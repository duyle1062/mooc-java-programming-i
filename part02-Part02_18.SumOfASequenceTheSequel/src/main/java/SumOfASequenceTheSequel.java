
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        int i = first - 1;
        int sum = 0;
        while (i < last) {
            i++;
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
