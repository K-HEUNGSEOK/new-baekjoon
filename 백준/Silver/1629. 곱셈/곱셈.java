import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        System.out.println(DFS(a,b,c));
    }
    static long DFS(long a , long b , long c){
        //k가 무너지면 k +1 도 무너진다.
        if (b == 1) return a % c;
        long val = DFS(a, b /2 ,c);
        val = val * val % c;
        if (b % 2 == 0) return val;
        else{
            return val * a % c;
        }
    }
}