import java.util.Scanner;
import java.text.DecimalFormat;

class index {
  private static final DecimalFormat df = new DecimalFormat("0.00");
   
   public static void main(String[] args) {
      int radius;
      double area;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the radius of the circle ::");
      radius = input.nextInt();
      area = (radius * radius) * Math.PI;
      System.out.println("Area of the circle is ::" + df.format(area));
      input.close();
   }
}