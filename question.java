import java.util.Scanner;

public class question {

	public static void main(String[] args) {
		Scanner set = new Scanner(System.in);
		   int a = set.nextInt();
		   if(a%4==0&&a%100!=0||a%400==0)
		   {
			   System.out.println("this is leap year :"+a);
		   }
		   else
			   System.out.println("this is not a leap year :"+a);
			   
		   

	}

}
