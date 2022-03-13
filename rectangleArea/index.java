import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    int width, height;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the width of the rectangle ::");
    width = input.nextInt();
    System.out.println("Enter the height of the rectangle ::");
    height = input.nextInt();
    double area = width * height;
    System.out.println("Area of the rectangle is ::" + area);
    input.close();
  }
}
