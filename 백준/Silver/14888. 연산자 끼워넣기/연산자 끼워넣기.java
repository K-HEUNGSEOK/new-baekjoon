
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    static int n, min, max;
    static int[] arr;
    static char[] param;
    static boolean[] ch;
    static ArrayList<Character> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        //1. 처음 입력받기
        n = sc.nextInt();
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < 4; i ++){
            fill(sc.nextInt(), i);
        }
        param = new char[list.size()];
        ch = new boolean[list.size()];
        combination(0);
        System.out.println(max);
        System.out.println(min);
    }


    //1. 이렇게 하면 지금 조합을 만들었다.
    //2. 그럼 이제 이 조합을 통해 같이 계산을 해봐야겠지?
    static int getInt(char c, int current , int next){
        switch(c){
            case '+':
               return current += next;
            case '/':
                return current /= next;
            case 'x':
                return current * next;
            case '-':
                return current -= next;
        }
        return -1;
    }
    static void combination(int v){
        if(v == list.size()){
            //조합이 다 만들어졌음
            int total = arr[0];
            for(int i = 0 ; i < param.length; i ++){
                total = getInt(param[i], total, arr[i + 1]);
            }
            max = Math.max(max, total);
            min = Math.min(min,total);
        }else{
            for(int i = 0 ; i < list.size(); i ++){
                if(!ch[i]){
                    ch[i] = true;
                param[v] = list.get(i);
                combination(v + 1);
                ch[i] = false;
                }
            }
        }
    }

    static void fill(int num, int index){
        char temp = ' ';
        if(index == 0) temp = '+';
        else if(index == 1) temp ='-';
        else if(index == 2) temp ='x';
        else temp = '/';

        for(int i = 0 ; i < num ; i ++){
            list.add(temp);
        }
    }
}