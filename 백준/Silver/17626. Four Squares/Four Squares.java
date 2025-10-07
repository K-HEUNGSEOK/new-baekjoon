
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i <= Math.sqrt(n); i ++){
            if(Math.pow(i,2) == n){
                System.out.println(1);
                return;
            }
        }

        for(int i = 1; i <= Math.sqrt(n); i ++) {
            double num = Math.pow(i, 2);
            double temp = n - num;

            if (Math.sqrt(temp) == (int) Math.sqrt(temp)) {
                System.out.println(2);
                return;
            }
        }
        for(int i = 1; i * i <= n ; i ++){
            for(int j = 1; j * j <= n - (i*i); j ++){
                int temp = n - ((i * i) + (j * j));

                if(temp > 0){
                    if(Math.sqrt(temp) == (int) Math.sqrt(temp)){
                        System.out.println(3);
                        return;
                    }
                }
            }
        }

        System.out.println(4);


    }
}