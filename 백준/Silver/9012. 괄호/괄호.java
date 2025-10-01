
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int z = 0 ; z < n; z ++){
            Stack<Character> stack = new Stack<>();
            String str = sc.next();
            boolean flag = true;
            for(int i = 0 ; i < str.length(); i ++){
                char temp = str.charAt(i);
                if(temp == '('){
                    stack.push(temp);
                }else if(temp == ')'){
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }

            if(!flag || !stack.isEmpty()){
                System.out.println("NO");
            }else System.out.println("YES");
        }
    }
}