
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        ArrayList<Integer> pointListAll = new ArrayList<>();
        ArrayList<Integer> pointListPassing = new ArrayList<>();
        int[] grades = new int[6];
        int sumAll = 0;
        int sumPassing = 0;
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            Integer input = scanner.nextInt();
            
            if (input == -1) {
                break;
            }
            
            if (input >= 0 && input <= 100) {
                pointListAll.add(input);
                sumAll += input;
                gradeDistribution(grades, input);
                if (input >= 50) {
                    pointListPassing.add(input);
                    sumPassing += input;
                }
            }
        }
        
        System.out.println("Point average (all): " +  1.0*sumAll/pointListAll.size());
        if (pointListPassing.isEmpty()) {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        } else {
            System.out.println("Point average (passing): " + 1.0*sumPassing/pointListPassing.size());
            System.out.println("Pass percentage: " + 1.0*pointListPassing.size()/pointListAll.size()*100);
        }
        System.out.println("Grade distribution: ");
        for (int i = 5; i >=0; i--) {
            System.out.print(i + ":");
            printStar(grades[i]);
        }
    }
    
    public static void gradeDistribution(int[] arr, int point) {
        if (point < 50) {
            arr[0]++;
        } else if (point < 60) {
            arr[1]++;
        } else if (point < 70) {
            arr[2]++;
        } else if (point < 80) {
            arr[3]++;
        } else if (point < 90) {
            arr[4]++;
        } else {
            arr[5]++;
        }
    }
    
    public static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
