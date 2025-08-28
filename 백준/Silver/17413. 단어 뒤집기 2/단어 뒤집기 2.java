import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean isTag = false;

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length(); i ++){
            if (str.charAt(i) == '<'){
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                isTag = true;
                sb.append(str.charAt(i));
            }else if (str.charAt(i) == '>'){
                isTag = false;
                sb.append(str.charAt(i));
            }else if(isTag){
                sb.append(str.charAt(i));
            }
            else{
                if (str.charAt(i) == ' '){
                    while (!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(str.charAt(i));
                }else{
                    stack.push(str.charAt(i));
                }
            }

        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);

    }
}