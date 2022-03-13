import java.util.Scanner;

class index {
  public static int stringCompare(String str1, String str2) {

    int l1 = str1.length();
    int l2 = str2.length();
    int minimum = Math.min(l1, l2);

    for (int i = 0; i < minimum; i++) {
      int str1_ch = (int) str1.charAt(i);
      int str2_ch = (int) str2.charAt(i);

      if (str1_ch != str2_ch) {
        return str1_ch - str2_ch;
      }
    }
    if (l1 != l2) {
      return l1 - l2;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first String ::");
    String first = input.nextLine();
    System.out.println("Enter the second String ::");
    String second = input.nextLine();
    int res = stringCompare(first, second);
    if (res == 0) {
      System.out.println("Both the strings are equal");
    } else {
      System.out.println("Both the strings are unequal");
    }
    input.close();
  }
}