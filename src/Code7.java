/*
Akash has his maths test tomorrow. He secretly found out one of the questions from the test. As the test is online, he wants to write a code that solves the question. However, he is not good at coding and thus, wants Chef to help him with that.

Chef is given a function F(X) such that the condition:

F(X)=F(2⋅X)
holds true for all X, where X is a positive integer.
For a given positive integer N, find the maximum number of distinct elements in the array [F(1),F(2),F(3),…,F(N)].

Input Format
First line will contain T - the number of test cases. Then the test cases follow.
Each test case contains a single line of input, one integer N.
Output Format
For each test case, output in a single line, the maximum number of distinct elements in the array [F(1),F(2),F(3),…,F(N)].

Constraints
1≤T≤1000
1≤N≤109
Subtasks
Subtask 1 (30 points): 1≤N≤1000
Subtask 2 (70 points): Original Constraints.
Sample Input 1
2
2
5
Sample Output 1
1
3
*/
import java.util.Scanner;

public class Code7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++)
        {
            arr[i]=s.nextInt();
        }
        int c=0;
        for (int i = 0; i <n ; i++){

            if(arr[i]%2==0)
            {
                System.out.println(arr[i]/2);
            }
            else
            {
                System.out.println((arr[i]/2)+1);
            }

        }
    }
}
