
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        Stack<Character> stack = new Stack<>();
        int result = 0;
        int multi = 1;
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            if (temp == '(' || temp == '[') {
                if (temp == '(') {
                    multi *= 2;
                    stack.push(temp);
                }
                if (temp == '[') {
                    multi *= 3;
                    stack.push(temp);
                }
            } else {
                if(temp == ']'){
                    if(stack.isEmpty() || stack.peek() !='['){
                        System.out.println(0);
                        return ;
                    }
                    if(arr[i-1] == '['){
                        result += multi;
                    }
                    multi /= 3;
                    stack.pop();
                }

                if(temp == ')'){
                    if(stack.isEmpty() || stack.peek() !='('){
                        System.out.println(0);
                        return ;
                    }
                    if(arr[i-1] == '('){
                        result += multi;
                    }
                    multi /= 2;
                    stack.pop();
                }
            }
        }
        
        if(!stack.isEmpty()){
            System.out.println(0);
            return;
        }
        System.out.println(result);
    }
}