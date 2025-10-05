
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Stack<Integer> stack = new Stack<>();
     public static void main(String[] args) throws IOException {

         Scanner sc = new Scanner(System.in);
         //1 정수 x 를 스텍에 넣음
         //2 스텍에 정수가 있으면 맨위의 정수를 팝하고 출력함, 없으면 -1
         //3 스텍에 들어있는 정수 개수를 출력
         //4 스택이 비어있으면 1 아니면 0
         //5 스택에 정수가 있으면 peek 없으면 -1

         int t = sc.nextInt();
         while(t -- > 0){
             int n = sc.nextInt();
             int temp = 0;
             if(n == 1) temp = sc.nextInt();

             execute(n,temp);
         }
         System.out.println(sb.toString());

     }
     static void execute(int n , int temp){
         switch(n){
             case 1:
                 stack.push(temp);
                 break;
             case 2:
                 if(!stack.isEmpty()) sb.append(stack.pop()).append("\n");
                 else sb.append(-1).append("\n");
                 break;
             case 3:
                 sb.append(stack.size()).append("\n");
                 break;
             case 4:
                 if(stack.isEmpty()) sb.append(1).append("\n");
                 else sb.append(0).append("\n");
                 break;
             case 5:
                 if(stack.isEmpty()) sb.append(-1).append("\n");
                 else sb.append(stack.peek()).append("\n");
                 break;
         }
     }
}