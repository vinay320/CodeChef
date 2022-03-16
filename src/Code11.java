// count smaller digit on the right side
import java.util.Scanner;

public class Code11 {
    static int[] Count(int[] ar)
    {   int[] ar1=new int[ar.length];
        for(int i=0;i<ar.length-1;i++)
        {   int c=0;
            for (int j = 0; j <ar.length ; j++) {
                if(i<=j){
                if(ar[i]>ar[j])
                      {
                        c++;
                      }
                    }
                    }
            ar1[i]=c;
        }
        return ar1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]=s.nextInt();
        }
        int[] count=Count(ar);
        for (int i:count ) {
            System.out.println(i);
        }
    }
}
