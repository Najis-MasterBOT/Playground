import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int mul=1;
      for(int count= 1; count<=n; count++)
      {
        mul=mul*count;
      }
      System.out.print(mul);
	}
}