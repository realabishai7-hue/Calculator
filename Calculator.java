
import java.util.*;

class Calsi {
    public int  add (int a , int b) {
        return a + b ;
    }
    public int  sub (int a , int b) {
        return a - b ;
    }
    public int  mul (int a , int b) {
        return a * b ;
    }
    public double  div (int a , int b) {
        return a / b ;
    }
    public int remainder(int a , int b) {
        return a % b ;
    }
}

public class Calculator {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Calsi c = new Calsi();
        System.out.println("      ****** Calculator ******\n");
        System.out.println("1 >> ADDITION\n2 >> SUBTRACTION\n3 >> MULTIPLICATION\n4 >> DIVISION\n5 >> MODULOUS");
        System.out.print("Choose option : ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.print("Enter a value : ");
                int a1 = sc.nextInt();
                System.out.print("Enter b value : ");
                int b1 = sc.nextInt();
                System.out.println(a1 + " + " + b1 + " = " + c.add(a1, b1));
                break;
            case 2 :
                System.out.print("Enter a value : ");
                int a2 = sc.nextInt();
                System.out.print("Enter b value : ");
                int b2 = sc.nextInt();
                System.out.println(a2 + " - " + b2 + " = " + c.sub(a2, b2));
                break;
            case 3 :
                System.out.print("Enter a value : ");
                int a3 = sc.nextInt();
                System.out.print("Enter b value : ");
                int b3 = sc.nextInt();
                System.out.println(a3 + " X " + b3 + " = " + c.mul(a3, b3));
                break;
            case 4 :
                System.out.print("Enter a value : ");
                int a4 = sc.nextInt();
                System.out.print("Enter b value : ");
                int b4 = sc.nextInt();
                System.out.println(a4 + " / " + b4 + " = " + c.div(a4, b4));
                break;
            case 5 :
                System.out.print("Enter a value : ");
                int a5 = sc.nextInt();
                System.out.print("Enter b value : ");
                int b5 = sc.nextInt();
                System.out.println(a5 + " % " + b5+ " = " + c.remainder(a5, b5));
                break;
            default:
                System.out.println("Enter Valid Input");
                break;
        }
        sc.close();
    }    
}