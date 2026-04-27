import java.util.*;

public class Solution {
    public int solution(int n) {
    int answer = 0;

    while (n > 0) {
        answer += n % 10; // 마지막 숫자 꺼내서 더하기
        n /= 10;          // 마지막 숫자 없애기
    }

    return answer;
}
}