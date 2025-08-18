import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        //1. 0이 아니면 넣는다 음수여도
        //2. 0이면 출력한다.
        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (a,b) -> {
                    int absA = Math.abs(a);
                    int absB = Math.abs(b);
                    if (absA == absB) return a-b;
                    return absA-absB;
                }
        );
        int n = sc.nextInt();
        while (n -- > 0){
            int num = sc.nextInt();
            if (num == 0){
                if (queue.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(queue.poll());
                }
            }
            else{
                queue.offer(num);
            }
        }
    }
}