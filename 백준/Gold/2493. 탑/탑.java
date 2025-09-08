import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
     
     //   Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Point[] arr = new Point[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= n ; i ++){
            arr[i] = new Point(Integer.parseInt(st.nextToken()), i);
        }


        Stack<Point> stack = new Stack<>();
        int[] ans = new int[n+1];
        for(int i = 1 ; i <= n ; i ++){
            while (!stack.isEmpty() && stack.peek().height < arr[i].height){
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i] = 0;
            }else{
                ans[i] = stack.peek().index;
            }
            stack.push(arr[i]);
        }

        //0 0 2 2 4 정답
        for(int i =1 ; i <= n ; i++){
            sb.append(ans[i] + " ");
        }
        System.out.println(sb.toString());
    }
    static class Point{
        int height, index;

        public Point(int height, int index) {
            this.height = height;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "height=" + height +
                    ", index=" + index +
                    '}';
        }
    }
}