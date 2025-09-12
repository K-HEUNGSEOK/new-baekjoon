#include <iostream> // C++ 표준 입출력을 위한 헤더
#include <vector>   // 동적 배열인 벡터를 사용하기 위한 헤더
#include <cmath>    // 수학 함수(abs)를 사용하기 위한 헤더
#include <climits>  // 정수형의 최댓값(INT_MAX)을 사용하기 위한 헤더
#include <cstdio>   // C 스타일 표준 입출력 함수(freopen)를 사용하기 위한 헤더

int main() {
    // Java의 System.setIn... 과 동일하게, "src/input.txt" 파일로부터 입력을 받도록 설정합니다.

    // C++에서 입출력 속도를 높이기 위한 코드입니다. 코딩 테스트에서는 필수!
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    int T;
    std::cin >> T; // 테스트 케이스의 개수를 입력받습니다.

    for (int l = 1; l <= T; ++l) {
        int n;
        std::cin >> n; // 각 테스트 케이스의 숫자 개수를 입력받습니다.

        // Java의 int[] arr = new int[n]; 과 유사합니다.
        // C++에서는 크기가 동적으로 변할 수 있는 std::vector를 사용하는 것이 더 편리하고 안전합니다.
        std::vector<int> arr(n);
        for (int i = 0; i < n; ++i) {
            int temp;
            std::cin >> temp;
            arr[i] = std::abs(temp); // Java의 Math.abs() 와 같습니다.
        }

        // Java의 Integer.MAX_VALUE 와 같습니다. 정수형이 가질 수 있는 가장 큰 값으로 초기화합니다.
        int ans = INT_MAX;
        int count = 0;

        // 기존 Java 코드에서는 최솟값을 찾고, 다시 반복문을 돌려 개수를 셌습니다.
        // 아래 코드는 한 번의 반복문으로 최솟값과 그 개수를 동시에 찾는 효율적인 방법입니다.
        for (int i = 0; i < n; ++i) {
            if (arr[i] < ans) { // 더 작은 값을 만나면
                ans = arr[i];   // 최솟값을 갱신하고
                count = 1;      // 개수를 1로 초기화합니다.
            } else if (arr[i] == ans) { // 현재 최솟값과 같은 값을 만나면
                count++; // 개수만 1 증가시킵니다.
            }
        }
        
        // 결과를 출력합니다.
        std::cout << "#" << l << " " << ans << " " << count << "\n";
    }

    return 0; // 프로그램이 정상적으로 종료되었음을 의미합니다.
}