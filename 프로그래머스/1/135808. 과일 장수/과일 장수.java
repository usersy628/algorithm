import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
            
        int answer = 0;
        int count = 0;
        
        for (int i = score.length - 1; i >= 0; i--) {
            count++;
            
            if(count == m) {
                answer += score[i] * m;
                count = 0;
            }
        }
        
        return answer;
    }
}