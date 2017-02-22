import java.util.*;
public class Day2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tipP = mealCost*tipPercent/100;
        double taxP = mealCost*taxPercent/100;
        double meal = mealCost + tipP + taxP;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(meal);
      
        // Print your result
        System.out.print("The total meal cost is "+ totalCost + " dollars.");
    }
}