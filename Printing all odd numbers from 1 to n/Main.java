import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int nn=1; nn<=n;nn++){
        if (nn%2 != 0)
          System.out.println(nn);
      }
    }
}