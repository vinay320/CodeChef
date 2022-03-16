import java.util.Scanner;

public class Code10 {
    static char[] read_students(char[] A, int n)
    {   Scanner s=new Scanner(System.in);
        String s1= s.nextLine();
        A=s1.toCharArray();
        return A;
    }
    static void print_students(char[] A, int n)
    {
        for (int i = 0; i <n ; i++) {
            System.out.print(A[i]+" ");
        }
    }
    static char[] arrange_students(char[] A, int n)
    {   char[][] B=new char[100][100];
        for (int i = 0; i <n ; i++) {
            if(A[i]=='A' || A[i]=='N')
            {
                B[0][i]=A[i];
            }
            if(A[i]=='B' || A[i]=='O')
            {
                B[1][i]=A[i];
            }
            if(A[i]=='C' || A[i]=='P')
            {
                B[2][i]=A[i];
            }
            if(A[i]=='D' || A[i]=='Q')
            {
                B[3][i]=A[i];
            }
            if(A[i]=='E' || A[i]=='R')
            {
                B[4][i]=A[i];
            }
            if(A[i]=='F' || A[i]=='S')
            {
                B[5][i]=A[i];
            }
            if(A[i]=='G' || A[i]=='T')
            {
                B[6][i]=A[i];
            }
            if(A[i]=='H' || A[i]=='U')
            {
                B[7][i]=A[i];
            }
            if(A[i]=='I' || A[i]=='V')
            {
                B[8][i]=A[i];
            }
            if(A[i]=='J' || A[i]=='W')
            {
                B[9][i]=A[i];
            }
            if(A[i]=='K' || A[i]=='X')
            {
                B[10][i]=A[i];
            }
            if(A[i]=='L' || A[i]=='Y')
            {
                B[11][i]=A[i];
            }
            if(A[i]=='M' || A[i]=='Z')
            {
                B[12][i]=A[i];
            }
        }
        String s2="";
        for (int i = 0; i <100 ; i++) {
            for (int j = 0; j <100 ; j++) {
                if(B[i][j]!='\0')
                {
                    s2=s2+B[i][j];
                }
                else
                {
                    continue;
                }
            }
        }
        return s2.toCharArray();
    }
    static  void list_students(char[] B, int n, int n1)
    {   int count=0;
        for (int i = 0; i <n ; i++) {
            if(n1==(B[i]-64) || n1==(B[i]-77))
            {
                System.out.println(400+i);
            }
            else
            {
                count++;
            }
        }
        if(count==B.length)
        {
            System.out.println("-1");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] A=new char[100];
        char[] B=new char[100];
        while(true){
            char ch = s.next().charAt(0);
            switch (ch)
            {
                case 'r':   int n=s.nextInt();
                            A=read_students(A,n);
                            break;
                case 'p': print_students(A,A.length);
                          break;
                case 'a':  B=arrange_students(A,A.length);
                            char nn=s.next().charAt(0);
                            if(nn=='p')
                            {
                                print_students(B,B.length);
                            }
                            break;
                case 'l':   int n1=s.nextInt();
                            list_students(B,B.length,n1);
                            break;
                case 't':  System.exit(0);
                default :
                    System.out.println("Wrong");
            }
        }
    }
}
