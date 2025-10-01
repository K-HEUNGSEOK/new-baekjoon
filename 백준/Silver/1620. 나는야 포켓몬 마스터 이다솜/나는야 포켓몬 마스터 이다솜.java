
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        for(int i = 1; i <= n ; i ++){
            String name = sc.next();
            map1.put(name, i);
            map2.put(i,name);
        }
        for(int i = 0; i < m ; i ++){
            String str = sc.next();
            if(Character.isDigit(str.charAt(0))){
                int num = Integer.parseInt(str);

                //이제 숫자를 입력했을 때 이름이 나오는걸 o(1) 로 줄여야한다.
                System.out.println(map2.get(num));
            }else{
                //숫자를 출력하는건 o(1)로 줄였다.
                System.out.println(map1.get(str));
            }
        }
    }
}