import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
        int pages=0;
        if (p<=n/2) { // start from the beginning
            pages=p/2;
        }
        else { // start from the end
            pages=n/2-p/2;
        }
        return pages;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
