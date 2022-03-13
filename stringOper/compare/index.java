import java.util.Scanner;

class index {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the String to find its length ::");
    String first = input.nextLine();
    System.out.print("The lenth of the string " + first + " is:: " + first.length());
    input.close();
  }
}