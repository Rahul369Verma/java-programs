import java.util.Scanner;

public class index {
  private static void check(double[] arr, double toCheckValue) {
    boolean test = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == toCheckValue) {
        test = true;
        System.out.println("Element " + toCheckValue + " is present in the array at the index of: " + (i+1));
        break;
      }
    }
    if(!test){
      System.out.println("Element " + toCheckValue + " is not present in the array. ");
    }
  }

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the required size of the array :: ");
    int size = input.nextInt();
    double myArray[] = new double[size];
    System.out.println("Enter the elements of the array one by one ");

    for (int i = 0; i < size; i++) {
      myArray[i] = input.nextDouble();
    }
    System.out.print("Enter the element you want to search :: ");
    double toCheckValue = input.nextDouble();
    check(myArray, toCheckValue);
    // System.out.println("Elements of the array are: " + Arrays.toString(myArray));
    // System.out.println("Sum of the elements of the array :: " + df.format(sum /
    // size));
    input.close();
  }
}
