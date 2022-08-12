package FunctionalPrograms;
import java.util.Scanner;

public class Quadratic {

	public static void quadraticEquation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("the equation is a*x*x + b*x + c");
        System.out.println("enter value of a");
        double a = sc.nextDouble();
        System.out.println("enter value of b");
        double b = sc.nextDouble();
        System.out.println("enter value of c");
        double c = sc.nextDouble();

        double d = b*b - 4*a*c;
        if(d > 0){
            double r1 = (-b + Math.pow(d, 0.5))/(2*a);
            double r2 = (-b - Math.pow(d, 0.5))/(2*1);
            System.out.println("the roots are" + r1+" "+r2);

        }
        else if(d == 0){
            double r1 = -b/(2*a);
            System.out.println("the roots are" + r1 );
        }
        else{
            System.out.println("the roots are not real");
        }
    }

    public static void main(String[] args) {
        quadraticEquation();

	}

}
