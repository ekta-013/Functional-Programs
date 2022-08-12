package FunctionalPrograms;
import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X : ");
        int x = sc.nextInt();
        System.out.println("Enter the value of Y : ");
        int y = sc.nextInt();

        double result = Math.sqrt((x*x)+(y*y));
        System.out.println("EuclideanDistance : "+result);

	}

}
