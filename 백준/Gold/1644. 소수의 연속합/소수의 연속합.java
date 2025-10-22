import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
    //1. 입력받기
    int n = sc.nextInt();
    boolean[] ch = new boolean[n + 1];
    List<Integer> list = new ArrayList<>();

    //2. 소수 list에 넣기 에라토스테네스의 체 활용
    for (int i = 2; i <= n; i++) {
      if (!ch[i]) {
        list.add(i);
        for (int j = i * 2; j <= n; j += i) {

          if (!ch[j]) {
            ch[j] = true;
          }
        }
      }
    }
    int ans = 0;
    int lt = 0;
    int rt = 0;
    int total = 0;

    while (rt < list.size()) {
      total += list.get(rt);
      rt++;
      while (total >= n) {
        if (total == n) {
          ans++;
          break;
        }
        total -= list.get(lt);
        lt++;
      }
    }
    System.out.println(ans);
  }
}