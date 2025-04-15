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
        String str = in.nextLine();
        if(str.length()>=2){
        String sub=str.substring(0,2);
        for(int i=0;i<3;i++)
        System.out.print(sub);
        }else{
            for(int i=0;i<3;i++)
            System.out.print(str);
        }
    
    }

}