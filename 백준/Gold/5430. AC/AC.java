import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n -- > 0){
            char[] command = sc.next().toCharArray();
            int size = sc.nextInt();
            String[] filter = sc.next().split(",");
            Deque<Integer> q = new ArrayDeque<>();
            boolean restart = false;


            for (String s : filter) {
               s =  s.replaceAll("[^0-9]", "");
               if (s.equals("")){
                   continue;
               }
               q.offer(Integer.parseInt(s));
            }




            //정상일때 처리 로직
            int cnt = 0;
            for (char c : command) {
                if (c == 'R'){
                    cnt ++;
                }else{
                    if (q.isEmpty()){
                        sb.append("error").append("\n");
                        restart = true;
                        break;
                    }
                    //짝수면 걍 앞에서 홀수면 뒤집은걸로 뒤에서 제거
                    if (cnt % 2 == 0){
                        q.pollFirst();
                    }else{
                        q.pollLast();
                    }
                }
            }

            if (restart){
                continue;
            }

            if (cnt % 2 == 0){
                sb.append("[");
                int len = q.size();
                for(int i = 0 ; i < len; i ++){
                    if (i < len-1){
                        sb.append(q.pollFirst()).append(",");
                    }else{
                        sb.append(q.pollFirst());
                    }
                }
                sb.append("]").append("\n");
            }else{
                sb.append("[");
                int len = q.size();
                for(int i = 0 ; i < len; i ++){
                    if (i < len-1){
                        sb.append(q.pollLast()).append(",");
                    }else{
                        sb.append(q.pollLast());
                    }
                }
                sb.append("]").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}