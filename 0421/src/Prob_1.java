import java.util.Scanner;

public class Prob_1 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int a,b;
			int sum=0 ;
			
			a=sc.nextInt();
			b=sc.nextInt();
			
			for(int i=a;i<=b;i++){
				sum+=i;
			}
			
			
			
			
			
			
			

		System.out.println(a + "부터 " + b + "까지의 합은 " + sum);
		}
}