package reverse;
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int suma=0;
        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            suma+=X;
        }

        System.out.println(suma);
    }
}