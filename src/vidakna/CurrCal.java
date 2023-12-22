package vidakna;

import java.util.Scanner;

class CurrCal {
  public static void main(String[] args) {

    char operator;
    Double number1, result;
	
    Scanner input = new Scanner(System.in);		// create an object of Scanner class
    System.out.println("Choose an currency: Dollar=D/d, Euro=E/e, Sterling Pound=S/s, or YEn=Y/y");		// ask users to enter operator
    operator = input.next().charAt(0);

   
    System.out.println("Enter Value that you want to convert: ");		// ask users to enter numbers
    number1 = input.nextDouble();

    Double number2 = 180.20;
	Double number3 = 240.93;
	Double number4 = 279.51;
	Double number5 = 1.81;

    switch (operator) {

      case 'D':									// Dollar to Rs.
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + "Rs." + result);
        break;

      case 'd':									// Dollar to Rs.
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + "Rs." + result);
        break;  

      case 'E':									// Euro to Rs.
        result = number1 * number3;
        System.out.println(number1 + " * " + number3 + " = " + "Rs." + result);
        break;

      case 'e':									// Euro to Rs.
        result = number1 * number3;
        System.out.println(number1 + " * " + number3 + " = " + "Rs." + result);
        break;
      
      case 'S':									// Sterling Pound to Rs.
        result = number1 * number4;
        System.out.println(number1 + " * " + number4 + " = " + "Rs." + result);
        break;

      case 's':									// Sterling Pound to Rs.
        result = number1 * number4;
        System.out.println(number1 + " * " + number4 + " = " + "Rs." + result);
        break;
      
      case 'Y':									// Yen to Rs..
        result = number1 * number5;
        System.out.println(number1 + " * " + number5 + " = " + "Rs." + result);
        break;

      case 'y':									// Yen to Rs..
        result = number1 * number5;
        System.out.println(number1 + " * " + number5 + " = " + "Rs." + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}