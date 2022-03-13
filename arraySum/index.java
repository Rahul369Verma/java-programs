import java.util.Arrays;
import java.util.Scanner;

public class index {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the required size of the array :: ");
    int size = input.nextInt();
    double myArray[] = new double[size];
    double sum = 0;
    System.out.println("Enter the elements of the array one by one ");

    for (int i = 0; i < size; i++) {
      myArray[i] = input.nextDouble();
      sum = sum + myArray[i];
    }
    System.out.println("Elements of the array are: " + Arrays.toString(myArray));
    System.out.println("Sum of the elements of the array ::" + sum);
    input.close();
  }
}
