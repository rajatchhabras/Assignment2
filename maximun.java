
public class maximun {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=80;
		int d=max(a,b,c);
		System.out.println("The maximum number is "+d);
	}
	public static int max(int a,int b,int c)
	{
		int x=(a>b)?(a>c?a:c):(b>c?b:c);
		return x;
	}
	}


