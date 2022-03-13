import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    double side;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Side of Square:");
    side = input.nextDouble();
    double area = side * side;
    System.out.println("Area of the square is ::" + area);
    input.close();
  }
}
