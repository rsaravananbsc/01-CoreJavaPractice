package programmingclass;
import java.util.Scanner;
// Perfect Num's
public class PerfectNo {
	public boolean isPerfect(int number) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=scan.nextInt();
		int temp =0;
		for(int i=1;i<=number;i++) {
			if(number%i ==0) {
				temp += i;
			}
		}
if(temp == number) {
	System.out.println("It is a Perfect Number: ");
return true;
	}else {
		System.out.println("It is a Non Perfect Number: ");
		return false;
	}
}
	public static void main(String[] args) {
	PerfectNo ipn = new PerfectNo();
	System.out.println("Is perfect number: "+ipn.isPerfect(28));
	}
}