import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  static int[] arr;
  static int ans, f, g;
  static boolean flag;
  static boolean[] ch;

  public static void main(String[] args) throws IOException {
  
    Scanner sc = new Scanner(System.in);

    //1.입력받기
    f = sc.nextInt(); //총 층수
    int s = sc.nextInt(); //현재 위치
    g = sc.nextInt(); //목표 위치
    int u = sc.nextInt(); //위로
    int d = sc.nextInt() * -1; //아래로 가야하니 음수로 바꿔주어야 함
    arr = new int[]{u, d};
    ch = new boolean[f + 1]; //방문 체크
    flag = false;

    //2.주요로직 호출
    BFS(s);
    
    //3.정답 출력
    if(g == s){
      System.out.println(0);
      return;
    }
    if (flag) {
      System.out.println(ans);
    } else {
      System.out.println("use the stairs");
    }
  }

  static void BFS(int v) {
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(v);
    ch[v] = true;
    int level = 0;
    while (!queue.isEmpty()) {
      int len = queue.size();

      for (int i = 0; i < len; i++) {
        int currentNumber = queue.poll();

        for (int j = 0; j < 2; j++) {
          int nextNumber = currentNumber + arr[j];
          if (nextNumber == g) {
            flag = true;
            ans = level + 1;
            return;
          }
          if (isRange(nextNumber) && !ch[nextNumber]) {
            ch[nextNumber] = true;
            queue.offer(nextNumber);
          }
        }
      }
      level++;
    }
  }

  static boolean isRange(int x) {
    return 1 <= x && x <= f;
  }
}