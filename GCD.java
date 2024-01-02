import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Print 1st number: ");
		int a=sc.nextInt();
		System.out.println("Print 2nd number: ");
		int b=sc.nextInt();
		int gcd=0;int i=1;
		while(i<=a&&i<=b) {
			if(a%i==0 && b%i==0)
				gcd=i;
			i++;
		}
		System.out.println(gcd);
	}

}