import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    int width, height;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the width of the Triangle:");
    width = input.nextInt();
    System.out.println("Enter the height of the Triangle:");
    height = input.nextInt();
    double area = (width * height) / 2;
    System.out.println("Area of the triangle is ::" + area);
    
    input.close();
  }
}
