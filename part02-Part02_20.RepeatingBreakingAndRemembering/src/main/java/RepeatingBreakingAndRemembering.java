
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;
        int count = 0;
        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            sum += n;
            count++;
            if (n % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            } 
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + 1.0*sum/count);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
        
    }
}
