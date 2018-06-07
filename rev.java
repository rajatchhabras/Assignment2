import java.util.Scanner;
public class rev {
	public static void main(String[] args) {
		Scanner set = new Scanner(System.in);
		   int a = set.nextInt();
		   int k=reverse(a);
		 
			   System.out.println("The Reverse Of the Number is  "+k);
		  
	}
	public static int reverse(int a)
	{
		int rev=0;
		for(int i=a;i>0;i=i/10)
		{
			int k=i%10;
			rev=rev*10+k;
		}
		return rev;
	}
}



