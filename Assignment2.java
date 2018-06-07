import java.util.Scanner;
public class Assignment2 {
   
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   int a = scanner.nextInt();
	   int b = scanner.nextInt();
     
      int c=Add(a, b);
      System.out.println("The required sum is "+c);
   }
   public static int Add(int a,int b)
   {
	   int k;
	   k=a+b;
	   return k;
   }
}
