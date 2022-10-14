import java.util.Scanner;
public class Fraction {


    private static int numerator;
    private static int denominator;

    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;


    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

     public void gangamstaili(int n) {
        if (n == 0) {
            return;
        }
        this.numerator *= n;
        this.denominator *=n;

     }
    public static void main(String[] args) {

        System.out.print("Input first number: ");
        int num1 = numerator;

        System.out.print("Input second number: ");
        int num2 = denominator;


        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " +
                (num1 % num2));


}

     @Override
     public String toString(){
        return numerator + "/" + denominator;
     }
     public void printFraction(){
         System.out.println(this.numerator + "/" + this.denominator);
     }



    @Override
    public  boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction f2 = (Fraction) obj;


            if (numerator * f2.denominator == denominator * f2.numerator) {
                return true;


            }

            
        }

        return false;

    }


    public void gangamstaili() {
    }
}
/* დავალება - Research - Hashcode */