import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prob6_birthdayChocolate {

    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int count=0;
        int sum=0;
        for (int i=0; i<n-m+1; i++) {
            sum=0;
            for (int j=0; j<m; j++) {
                sum+=s[i+j];
            }
            if (sum==d) count++;
            sum=0;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}

/*
Input:
55
3 5 4 1 2 5 3 4 3 2 1 1 2 4 2 3 4 5 3 1 2 5 4 5 4 1 1 5 3 1 4 5 2 3 2 5 2 5 2 2 1 5 3 2 5 1 2 4 3 1 5 1 3 3 5
18 6

Output:
10

*/
