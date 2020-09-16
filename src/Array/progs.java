package Array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class progs {
    public static void main(String[] args) {

    }
}
// to find repeating number in array only series 10 20 30 80 10 100 99
class Duplicate_Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max_count=1 , cur_count=1 ;
        int res[] =new int[]{a[0]};
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]){
                cur_count++;
            }
            else {
                if (cur_count > max_count) {
                    max_count = cur_count;
                    res[i] = a[i - 1];
                }
            }
            if(cur_count>max_count){
                max_count=cur_count;
                res[i]=a[n-1];
            }

        }
        for(int i=0;i<res.length;i++)
            System.out.println("These numbers are repeating ="+ res[i]);



    }
}
class Solutionbgfgb {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String a = A.substring(0, 1), b = B.substring(0, 1);
        a = a.toUpperCase();
        b = b.toUpperCase();
        System.out.println((A.length() + B.length()));
        /* Enter your code here. Print output to STDOUT. */
        if (A.contentEquals(B)) System.out.println("Yes");
        else {
            System.out.println("No");
        }
        System.out.println(a + A.substring(1, A.length()) + " " + b + B.substring(1, B.length()));
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}
class Solution12 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int i=1;
        while(i!=0){
        
        }



    }
}
