import java.util.Arrays;
import java.util.Scanner;

public class index {
  private static void check(double[] arr, double toRemoveValue) {
    boolean test = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == toRemoveValue) {
        test = true;
      }
      if(test){
        if(i == (arr.length-1)){
          break;
        }
        arr[i] = arr[i + 1];
      }
    }
    if(test){
      double[] newArr = Arrays.copyOfRange(arr, 0, (arr.length-1));
      System.out.println("Array after Element " + toRemoveValue + " is removed:: " + Arrays.toString(newArr));
    }else{
      System.out.println("Element " + toRemoveValue + " is not present in the array");
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
    System.out.print("Enter the element you want to remove :: ");
    double toRemoveValue = input.nextDouble();
    check(myArray, toRemoveValue);
    // System.out.println("Elements of the array are: " + Arrays.toString(myArray));
    // System.out.println("Sum of the elements of the array :: " + df.format(sum /
    // size));
    input.close();
  }
}
