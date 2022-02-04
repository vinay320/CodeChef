//Chef and the Hair Salon

import java.util.Scanner;
public class Code1 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        while(a>0)
        {
            int N=s.nextInt();
            int M=s.nextInt();

            System.out.println(N*M);
            a--;
        }
    }
}
