
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T -- > 0){
            StringBuilder sb = new StringBuilder();
            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            char[] command = sc.next().toCharArray();

            for(int i = 0 ; i < command.length; i ++){
                char c = command[i];

                if(c == '<'){
                    if(!left.isEmpty()){
                        Character pop = left.pop();
                        right.push(pop);
                    }
                }else if(c == '>'){
                    if(!right.isEmpty()){
                        Character pop = right.pop();
                        left.push(pop);
                    }
                }else if(c == '-'){
                    if(!left.isEmpty()){
                        left.pop();
                    }
                }else{
                    left.push(c);
                }
            }
            //마지막 출력부분
            int len = left.size();
            for(int i = 0 ; i < len; i ++){
                right.push(left.pop());
            }

            int len2 = right.size();
            for(int i = 0 ; i < len2; i ++){
                sb.append(right.pop());
            }
            System.out.println(sb.toString());
        }
    }
}