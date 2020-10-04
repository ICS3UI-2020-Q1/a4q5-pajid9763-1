import java.util.Scanner;
/**
 * program that prints the hailstone sequence
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user for a positive integer
  System.out.println("Please enter a positive integer to see the hailstone sequence.");
  int n = input.nextInt();
  System.out.println("Hailstone sequence is the following:");

  // number has to be greater than 1 for while loop to perform
  while(n > 1){
    
    // if number is divisible by 2 
    if (n % 2 == 0)
      n /= 2;
    
    // if number is not divisible by 2
    else n = (n * 3) + 1;
    System.out.println(n);
  }



  }
}
