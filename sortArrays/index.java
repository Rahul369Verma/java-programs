import java.util.Arrays;
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // System.out.print("Input the number of rows for pyramid: ");
    int[] my_array1 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
    char[] my_array2 = { 'z', 'y', 'x', 'w', 'v', 'u', 't',
        's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a' };
    System.out.println("Original numeric array : " + Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

    System.out.println("Original string array : " + Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    input.close();
  }
}
