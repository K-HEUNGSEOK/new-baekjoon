import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int ans = 0;
        int cnt = 0;

        for (int i = 1; i < m - 1; i++) {
            // "IOI" 패턴 발견
            if (s.charAt(i - 1) == 'I' && s.charAt(i) == 'O' && s.charAt(i + 1) == 'I') {
                cnt++;
                // N개 이상 모였으면 정답 증가
                if (cnt >= n) {
                    ans++;
                }
                // "IOI"는 겹칠 수 있으므로 i를 한 칸만 증가
                i++;
            } else {
                cnt = 0; // 끊기면 초기화
            }
        }

        System.out.println(ans);
    }
}
