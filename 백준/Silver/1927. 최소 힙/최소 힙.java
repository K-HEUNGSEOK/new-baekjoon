import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        while (n -- > 0){
            int num = sc.nextInt();
            if (num == 0){
                if (queue.isEmpty()){
                    sb.append(0).append("\n");
                }else{
                    int poll = queue.poll();
                    sb.append(poll).append("\n");
                }
            }else{
                queue.offer(num);
            }
        }
        System.out.println(sb);
    }
}