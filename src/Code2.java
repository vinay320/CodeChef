//N Queens Puzzle Solved !

import java.util.Scanner;
public class Code2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        while(a>0)
        {   double N=s.nextInt();
            double sum=(Math.pow(N*0.143,N));
            if(sum-Math.floor(sum)<0.5)
            {
                System.out.println((int)Math.floor(sum));
            }
            else
            {
                System.out.println((int)(Math.floor(sum)+1));
            }
            a--;
        }
    }
}
