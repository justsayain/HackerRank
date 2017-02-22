import java.util.*;

// Day 12: Inheritance
// Calculate Students' grades.

class Person {
   protected String firstName;
   protected String lastName;
   protected int idNumber;
	
	// Constructor
   Person(String firstName, String lastName, int identification){
      this.firstName = firstName;
      this.lastName = lastName;
      this.idNumber = identification;
   }
	
	// Print person data
   public void printPerson(){
      System.out.println(
         	"Name: " + lastName + ", " + firstName 
         + 	"\nID: " + idNumber); 
   }
	 
}
class Student extends Person{
   private int[] testScores;
    //constructor
   Student(String firstName, String lastName, int idNumber, int []testScores){
      super(firstName, lastName, idNumber);
      this.testScores = testScores;
   }
   public char calculate(){
      int sum = 0;
      for(int i = 0; i < testScores.length; i++){
         sum += testScores[i];
      }
      sum /= (testScores.length);
      return toChar(sum);
   }
   public char toChar(int num){
      return    num < 40 ? 'T':
                num < 55 ? 'D':
                num < 70 ? 'P':
                num < 80 ? 'A':
                num < 90 ? 'E':
                'O';
   }
   
}
class Day12 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String firstName = scan.next();
      String lastName = scan.next();
      int id = scan.nextInt();
      int numScores = scan.nextInt();
      int[] testScores = new int[numScores];
      for(int i = 0; i < numScores; i++){
         testScores[i] = scan.nextInt();
      }
      scan.close();
   	
      Student s = new Student(firstName, lastName, id, testScores);
      s.printPerson();
      System.out.println("Grade: " + s.calculate());
   }
}