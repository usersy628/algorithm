class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];

        int i = 0;
        while (n > 0) {
            answer[i] = (int)(n % 10); // 마지막 자리
            n /= 10;                  // 마지막 자리 제거
            i++;
        }

        return answer;
    }
}