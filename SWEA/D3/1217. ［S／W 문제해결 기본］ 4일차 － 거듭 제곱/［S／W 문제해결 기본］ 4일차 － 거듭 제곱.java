import java.util.Scanner;
public class Solution {
    public static void main(String[] args)  {
      
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int z = 1; z <= T; z++) {
            int v =sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = pow(a,b);
            System.out.println("#" + z + " " + ans);
        }
    }
    static int pow(int a, int b){
        if (b == 0){
            return 1;
        }else{
            return a * pow(a,b-1);
        }
    }
}

