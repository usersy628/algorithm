class Solution {
    public int solution(int n) {
        // 1. n을 3진법 문자열로 변환
        String ternary = Integer.toString(n, 3);

        // 2. 문자열 뒤집기
        String reversed = new StringBuilder(ternary)
                .reverse()
                .toString();

        // 3. 뒤집은 3진법 문자열을 10진수로 변환
        return Integer.parseInt(reversed, 3);
    }
}