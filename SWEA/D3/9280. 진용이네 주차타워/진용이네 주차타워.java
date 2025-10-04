import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 1; z <= T; z++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int ans = 0;
            int[] score = new int[n]; //주차장 점수
            int[] car = new int[m]; // 차무게
            int[] ch = new int[n]; //방문자 확인
            for(int i = 0 ; i < score.length; i ++){
                score[i] = sc.nextInt();
            }
            for(int i = 0 ; i < m ; i ++){
                car[i] = sc.nextInt();
            }

            Queue<Integer> queue = new LinkedList<>();

            //여기서 부터 시작
            for(int i = 0; i < m * 2; i ++){
                int index = sc.nextInt(); //
                if(index < 0) {
                    int temp = Math.abs(index);
                    for(int j = 0; j < n ; j ++){
                        if(ch[j] == temp) {
                            ch[j] = 0 ;
                            if(!queue.isEmpty()){
                                int poll = queue.poll(); //비어있던애
                                ans += car[poll-1] * score[j];
                                ch[j] = poll;
                            }

                            break;
                        }
                    }
                }else{
                    boolean flag = false;
                    for(int j = 0 ; j < n ; j ++){
                        if(ch[j] == 0){
                            ans += car[index-1] * score[j];
                            ch[j] = index;
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        queue.offer(index);
                    }
                }
                // 2 1 3 8
            //    System.out.println("index = " + index +" i = " + i + " ans = " + ans + " ch = " + Arrays.toString(ch));

            }

            System.out.println("#" + z + " " + ans);

        }
    }
}


