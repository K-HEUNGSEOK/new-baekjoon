
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static Deque<Integer> q = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n -- > 0){
            String command = sc.next();
            int num = -1;
            if (command.equals("push_front") || command.equals("push_back")) num = sc.nextInt();

            execute(command, num);
        }
    }
    static void execute(String s, int num){
        switch(s){
            case "push_front":
                q.push(num);
                break;
            case "push_back":
                q.offer(num);
                break;
            case "pop_front":
                if(q.isEmpty()) System.out.println(num);
                else System.out.println(q.pop());
                break;
            case "pop_back":
                if(q.isEmpty()) System.out.println(num);
                else System.out.println(q.removeLast());
                break;
            case "size":
                System.out.println(q.size());
                break;
            case "empty":
                if(q.isEmpty()) System.out.println(1);
                else System.out.println(0);
                break;
            case "front":
                if(q.isEmpty()) System.out.println(num);
                else System.out.println(q.getFirst());
                break;
            case "back":
                if(q.isEmpty()) System.out.println(num);
                else System.out.println(q.getLast());
                break;

        }
    }
}