import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr=new int[3][2];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        int c=0;
        while ( c<n) {
                int a=arr[c][0];
                int count=0;
                for (int j = 0; j <=a; j++)
                {
                    for (int k = 0; k <=a; k++)
                    {
                        int x= 3*k - j;
                        if(x==arr[c][1] && (k+j+(a-k+j)==a))
                        {   count++;
                            System.out.println("Yes");
                            System.out.println(k+" "+j+" "+(a-(k+j)));
                            break;
                        }
                    }
               if(j==a)
            {
                if (count==0)
                {
                    System.out.println("no");
                    break;
                }
            }
            }
            c++;
        }

    }
}
