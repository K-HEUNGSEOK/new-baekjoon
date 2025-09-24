import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {System.out.println(0); return;}
        System.out.print(DFS(n));
    }
    static int DFS(int v){
        if(v == 1 || v ==2) return 1;
        else {
            return DFS(v-2) + DFS(v-1);
        }
    }
}