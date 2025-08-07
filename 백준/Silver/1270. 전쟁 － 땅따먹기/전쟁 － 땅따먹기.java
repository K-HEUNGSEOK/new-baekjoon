import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(java.lang.String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N -- > 0){
            int T = sc.nextInt(); //땅 크기
            int middle = T / 2; //과반 크기
            List<Long> list = new ArrayList<>(); // 과반 넘는애들이 몇명이나 있나 보는 것
            HashMap<Long, Integer> map = new HashMap<>();
            for(int i = 0; i < T; i ++){
                Long n = sc.nextLong(); //사람 번호
                map.put(n, map.getOrDefault(n , 0) + 1); //중복되면 추가로 넣어줌
            }
            for (Long key : map.keySet()) {
                if (map.get(key) > middle){
                    list.add(key);
                }
            }
            if (list.isEmpty() || list.size() >= 2){
                System.out.println("SYJKGW");
            }else{
                System.out.println(list.get(0));
            }
        }
    }
}