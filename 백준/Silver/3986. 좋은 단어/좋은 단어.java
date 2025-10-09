
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int cnt = 0;
        while(T -- > 0 ){
            char[] arr = sc.next().toCharArray();
            Stack<Character> stack = new Stack<>();
            for (char c : arr) {
                if(stack.isEmpty()){
                    stack.push(c);
                }else{
                    if(stack.peek() == c){
                        stack.pop();
                    }else{
                        stack.push(c);
                    }
                }
            }
            if(stack.isEmpty()){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}