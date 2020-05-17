import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
	      int num=in.nextInt();
	      int num1=num;
	      int count=1;
	      int a = 0;
	      int sum=0;
	      while(count>0)
	      {
	        if (num1/10 == 0)
	        {
	        	a=num1%10;
	        	sum=sum+(a*a*a);
	            count=0;
	        }
	        else{
	        	a= num1%10;
	            sum=sum+(a*a*a);
	            num1=num1/10;
	            }
	      }
	      if (sum == num)
	      {
	          System.out.println("Armstrong Number");
	      }
	      else
	      {
	          System.out.println("Not a Armstrong Number");
	      }
	}
}