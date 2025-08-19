import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.List;

public class Main {
    static int n;
    static char[] ch;
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        int ans = 0 ;
        ch = new char[n + 1 + n ];
        //I가 N + 1개 나와야하고 그 사이에 O 이 있어야되니까 N이 1이면 IOI 즉 3개
        //N이 2면 I 는 3개 나와야하고 그 사이에 IOIOI 두개 니까 O는 N개들어가네 ?

        //  I = N + 1 , O = N
        //슬라이딩 윈도우 n - 1까지 미리 만들고 해야되는데
        List<Character> list = new LinkedList<>();

        for(int i = 0 ; i < n*2 ; i ++){
            list.add(s.charAt(i));
        }

        for(int i = n*2; i < m; i ++){
            list.add(s.charAt(i));
            if (isCheck(list)){
                ans ++;
            }
            list.remove(0);
        }
        System.out.println(ans);
    }
    static boolean isCheck(List<Character> list){

        for(int i = 0 ; i < list.size(); i ++){
            ch[i] = list.get(i);
        }
        //처음과 끝이 i 가 아니면 거짓
        if (list.get(0) != 'I' || list.get(list.size()-1) != 'I') return false;

        for(int i = 0 ; i < ch.length; i ++){
            if (i % 2 == 0 && ch[i] != 'I') return false;
            if (i % 2 != 0 && ch[i] != 'O') return false;
        }
        return true;
    }

}