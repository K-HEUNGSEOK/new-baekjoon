
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static Deque<Integer> queue = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n -- > 0){
            String command = sc.next();
            int num = -1;
            if (command.equals("push")){
                num = sc.nextInt();
            }

            execute(command, num);
        }
    }
    static void execute(String s, int n){
        switch(s){
            case "push":
                queue.offer(n);
                break;
            case "pop":
                if(queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.poll());
                break;
            case "size":
                System.out.println(queue.size());
                break;
            case "empty":
                if(queue.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
                break;
            case "front":
                if(queue.isEmpty()) System.out.println(n);
                else System.out.println(queue.peek());
                break;
            case "back":
                if(queue.isEmpty()) System.out.println(n);
                else System.out.println(queue.peekLast());
                break;
        }
    }
}