
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Deque<Integer> q = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
  
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T -- > 0 ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0 ;
            if(command.equals("push")){
                num = Integer.parseInt(st.nextToken());
            }

            execute(command, num);
        }
        System.out.println(sb.toString());
    }
    static void execute(String c, int n){
        switch(c){
            case "push":
                q.offer(n);
                break;
            case "front":
                if(!q.isEmpty()){
                    sb.append(q.peekFirst()).append("\n");
                    break;
                }else{
                    sb.append(-1).append("\n");
                    break;
                }
            case "back":
                if(!q.isEmpty()){
                    sb.append(q.peekLast()).append("\n");
                    break;
                }else{
                    sb.append(-1).append("\n");
                    break;
                }
            case "empty":
                if(q.isEmpty()){
                    sb.append(1).append("\n");
                    break;
                }else{
                    sb.append(0).append("\n");
                    break;
                }
            case "size":
                sb.append(q.size()).append("\n");
                break;
            case "pop":
                if(q.isEmpty()){
                    sb.append(-1).append("\n");
                    break;
                }else{
                    sb.append(q.pop()).append("\n");
                    break;
                }
        }
    }
}