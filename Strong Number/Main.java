import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num=n;
      int ind=0;
      int sum = 0;
      while(n>0)
      {
        ind = n%10;
        int fac = 1;
        for(int count = 1; count<=ind; count++)
        {
          fac = fac*count;
        }
        sum=sum+fac;
        n = n/10;
      }
      if (sum==num)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}
