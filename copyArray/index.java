import java.util.Scanner;

public class index {
  public static void main(String args[]) {
    System.out.print("Enter 2D array size(rows and columns) : ");
    Scanner input = new Scanner(System.in);
    int rows = input.nextInt();
    int columns = input.nextInt();

    System.out.println("Enter array elements : ");

    int twoD[][] = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      System.out.println("Enter the " + (i+1) + " row of array elements : ");
      for (int j = 0; j < columns; j++) {
        twoD[i][j] = input.nextInt();
      }
    }
    System.out.print("\nData you entered : \n");
    for (int[] x : twoD) {
      for (int y : x) {
        System.out.print(y + "        ");
      }
      System.out.println();
    }
    System.out.print("\nEnter the row and column of the element you want to change : \n");
    int row = input.nextInt();
    int column = input.nextInt();
    System.out.print("\nEnter the value of the element you want to change : \n");
    int newElement = input.nextInt();
    twoD[row-1][column-1] = newElement;
    System.out.print("\nNew Data : \n");
    for (int[] x : twoD) {
      for (int y : x) {
        System.out.print(y + "        ");
      }
      System.out.println();
    }
    input.close();
  }
}
