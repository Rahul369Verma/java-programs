import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {

    char operator = '+';
    boolean stop = false;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator

    // ask users to enter numbers

    System.out.println("Enter a number");
    number1 = input.nextDouble();

    System.out.println("Choose an operator: +, -, *, /");
    operator = input.next().charAt(0);

    while (operator != '=') {

      System.out.println("Enter other number");
      number2 = input.nextDouble();
      result = number1;

      switch (operator) {
        // performs addition between numbers
        case '+':
          result = number1 + number2;
          System.out.println(number1 + " + " + number2 + " = " + result);
          break;

        // performs subtraction between numbers
        case '-':
          result = number1 - number2;
          System.out.println(number1 + " - " + number2 + " = " + result);
          break;

        // performs multiplication between numbers
        case '*':
          result = number1 * number2;
          System.out.println(number1 + " * " + number2 + " = " + result);
          break;

        // performs division between numbers
        case '/':
          result = number1 / number2;
          System.out.println(number1 + " / " + number2 + " = " + result);
          break;

        default:
          stop = true;
          System.out.println("Invalid operator!");
          break;
      }
      if(stop){
        break;
      }
      if (operator != '=') {
        number1 = result;
        System.out.println("Choose the next operator: +, -, *, / or = for end");
        operator = input.next().charAt(0);
        // System.out.println("Previous result: " + result);
        // System.out.println("Enter a number");
        // number1 = input.nextDouble();
      }
      if(operator == '='){
        System.out.println("Your result is " + result);
      }
    }
    input.close();
  }
}