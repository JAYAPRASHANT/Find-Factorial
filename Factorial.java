package Factorial;
import java.util.Scanner;
public class Factorial {

	 static int factorial(int num){
	        if (num==1){
	            return num;
	        }
	        return num*factorial(num-1);
	    }
	    public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			int num = sc.nextInt();
			System.out.println(factorial(num));
		}
	}