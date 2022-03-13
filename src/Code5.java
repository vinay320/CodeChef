/*
There is a hidden word S and a guess word T, both of length 5.

Chef defines a string M to determine the correctness of the guess word. For the ith index:

If the guess at the ith index is correct, the ith character of M is G.
If the guess at the ith index is wrong, the ith character of M is B.
Given the hidden word S and guess T, determine string M.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of two lines of input.
First line contains the string S - the hidden word.
Second line contains the string T - the guess word.
Output Format
For each test case, print the value of string M.

You may print each character of the string in uppercase or lowercase (for example, the strings BgBgB, BGBGB, bgbGB and bgbgb will all be treated as identical).

Constraints
1≤T≤1000
|S|=|T|=5
S,T contain uppercase english alphabets only.
Sample Input 1
3
ABCDE
EDCBA
ROUND
RINGS
START
STUNT
Sample Output 1
BBGBB
GBBBB
GGBBG
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] arr= new String[n*2];
        for (int i = 0; i <n*2 ; i++)
        {   String x=s.next();
            arr[i]=x.toUpperCase();
        }
        List<String> obj=new ArrayList<String>();

        for (int i=0;i<n*2;i=i+2)
        {   String aa="";
            for (int j = 0; j<arr[i].length() ; j++)
            {
                if (arr[i].charAt(j)==arr[i+1].charAt(j))
                {
                    aa=aa+"G";
                }
                else if(arr[i].charAt(j)!=arr[i+1].charAt(j))
                {
                    aa=aa+"B";
                }
            }
            obj.add(aa);
        }

        for (int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
    }
}
