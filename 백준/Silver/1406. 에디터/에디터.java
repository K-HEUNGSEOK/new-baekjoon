
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static Stack<Character> left;
    static Stack<Character> right;
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        left = new Stack<>();
        right = new Stack<>();

        for(int i = 0 ; i < str.length(); i++){
            left.push(str.charAt(i));
        }


        for(int i =0 ; i < n ; i ++){
            char c = sc.next().charAt(0);
            char s = '?';
            if(c =='P'){
                s = sc.next().charAt(0);
            }

            execute(c,s);
        }



        //출력 부분
        int len = left.size();
        for(int i = 0 ; i < len; i ++){
            char a = left.pop();
            right.push(a);
        }
        StringBuilder sb = new StringBuilder();
        int lenR = right.size();
        for(int i = 0 ; i < lenR; i ++){
            sb.append(right.pop());
        }
        System.out.println(sb.toString());
    }
    static void execute(char command, char s){
        switch(command){
            case 'P':
                left.push(s);
                break;
            case 'L':
                if(!left.isEmpty()){
                Character pop = left.pop();
                right.push(pop);
                }
                break;
            case 'D':
                if(!right.isEmpty()){
                    Character pop = right.pop();
                    left.push(pop);
                }
                break;
            case 'B':
                if(!left.isEmpty()){
                    left.pop();
                }
                break;
        }
    }
}