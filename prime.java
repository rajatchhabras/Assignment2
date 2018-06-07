import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner set = new Scanner(System.in);
		   int a = set.nextInt();
		   int k=Prime(a);
		   if(k==1)
			   System.out.println("The number Is a Prime Number "+a);
		   else
			   System.out.println("The number Is not a Prime Number "+a);
			   }
	public static int Prime(int s)
	{
		int flag=0;
		if(s==2)
			return 1;
	  for(int i=2;i<s;i++)
	  {
		  if(s%i==0)
		  {
			  flag=1;
			  break;
		  }
		  
	  }
	  if(flag==0)
		  return 1;
	  else
		  return 2;
	}

}
