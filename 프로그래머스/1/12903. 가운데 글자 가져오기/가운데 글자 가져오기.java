class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int middle = length / 2;
        // 짝수면 가운데 2글자, 아니면 홀수일 때 가운데 1글자 반환
        if (length % 2 == 1) {
            return s.substring(middle, middle+1);
            // 가운데 2글자
        } else {
            return s.substring (middle - 1, middle + 1);
        }
    }
}