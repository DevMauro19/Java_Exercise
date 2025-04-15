package FastedMode.ejercicio2;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int suma=0;
        for (int i = 0; i < N; i++) {
            int E = in.nextInt();
        suma+=E%M;
        }
        System.out.println(suma);
    }
}