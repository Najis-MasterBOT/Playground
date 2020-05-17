import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n1=in.nextInt();
    int n2=(n1%10)*100;
    int n3=((n1%100)/10)*10;
    int n4=n1/100;
    int n5=n2+n3+n4;
    System.out.println(n5);
  }
}