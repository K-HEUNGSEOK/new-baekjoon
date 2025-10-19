import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

  static int ans, cnt;
  static boolean[][] visited;
  static char[] arr;

  public static void main(String[] args) throws FileNotFoundException {
  
    Scanner sc = new Scanner(System.in);
    //1. 재귀 완전탐색으로 가장 큰 수를 찾는다
    //2. 백트래킹으로 다시 되돌려놔야 한다
    //3. 방문 체크를 해서 가지치기를 하자
    int T = sc.nextInt();
    for (int z = 1; z <= T; z++) {
      String str = sc.next();
      ans = 0;
      cnt = sc.nextInt();
      arr = new char[str.length()];
      for (int i = 0; i < str.length(); i++) {
        arr[i] = str.charAt(i);
      }
      visited = new boolean[cnt + 1][1000000]; //최대 숫자가 99만임
      DFS(0, Integer.parseInt(str));
      System.out.println("#" + z + " " + ans);
    }

  }

  static void DFS(int v, int total) {
    if (visited[v][total]) {
      return;
    }
    visited[v][total] = true;
    if (v == cnt) {
      ans = Math.max(ans, total);
      return;
    } else {
      for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
          swap(i, j); //스왑하기
          DFS(v + 1, Integer.parseInt(new String(arr)));
          swap(i, j); //다시 풀어주기
        }
      }
    }
  }

  static void swap(int i, int j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
