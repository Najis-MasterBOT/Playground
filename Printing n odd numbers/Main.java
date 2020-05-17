import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int nn=1;
      for(int count=1; count<=n;nn++){
        if (nn%2 != 0){
          System.out.println(nn);
          count=count+1;     
        }
      }
        
    }
}