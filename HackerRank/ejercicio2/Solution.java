package HackerRank.ejercicio2;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum=A.length()+B.length();
        System.out.println(sum);
        int result = A.compareTo(B);
        
        String result1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String result2 = B.substring(0, 1).toUpperCase() + B.substring(1);


        
        if(result<0){
            System.out.println("No");
            System.out.println(result1 + " " + result2);
        }else{
            System.out.println("Yes");
            System.out.println(result2+ " " +result1);
        }
        
        
    }
}

