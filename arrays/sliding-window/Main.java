// import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(s[0]);
        int sum = Integer.parseInt(s[1]);
        System.out.println("Entered " + n + " " + sum);
        s = br.readLine().trim().split(" ");
        System.out.println("Length " + s.length);
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        ArrayList<Integer> out = Solution.subarraySum(a, n, sum);
        for (int i = 0; i < out.size(); i++) {
            System.out.print(out.get(i));
            System.out.print(" ");
        }
    }
}

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int start = 0;
        int end = 0;
        int add = arr[0];
        System.out.println("Inputs " + n + " " + s);
        ArrayList<Integer> out = new ArrayList<Integer>();
        while (start <= end && end <= n -1 ) {
            if (add < s) {
                end = end + 1;
                if (end < n) {
                    add = add + arr[end];
                }
            } else if (add > s) {
                add = add - arr[start];
                start = start + 1;
            }
            if (add == s) {
                out.add(start + 1);
                out.add(end + 1);
                return out;
            }
        }
        out.add(-1);
        return out;
    }
}