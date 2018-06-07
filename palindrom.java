import java.util.Scanner;
public class palindrom {
	public static void main(String[] args) {
		Scanner set = new Scanner(System.in);
		   int a = set.nextInt();
		   int k=check(a);
		   if(k==1)
			   System.out.println("The number is Palindrom "+a);
		   else
			   System.out.println("The number is not a Palindrom "+a);
	}
	public static int check(int a)
	{
		int rev=0;
		for(int i=a;i>0;i=i/10)
		{
			int k=i%10;
			rev=rev*10+k;
		}
		if(rev==a)
			return 1;
		else
			return 2;
	}

}
