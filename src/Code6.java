/*
Akash loves going to school, but not on weekends.

A week consists of 7 days (Monday to Sunday). Akash takes a leave every Saturday.

If a month consists of N days and the first-day of the month is Monday, find the number of days Akash would take a leave in the whole month.

Input Format
First line will contain T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, one integer N - the number of days in the month.
Output Format
For each test case, output in a single line, the number of days Akash would take a leave in the whole month.

Constraints
1≤T≤100
1≤N≤109
Subtasks
Subtask 1 (30 points) : 1≤N≤100
Subtask 2 (70 points) : Original Constraints
Sample Input 1
4
5
6
8
22
Sample Output 1
0
1
1
3
*/
import java.util.Scanner;

public class Code6 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++)
        {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            int count=0;
            int x= arr[i];
            if(x<=7 && x>5)
            {
                System.out.println("1");
            }
            else if(x>7)
            {
                while (x>5)
                {
                    x=x-7;
                    count++;
                }
                System.out.println(count);
            }
            else
            {
                System.out.println("0");
            }
        }
    }
}
