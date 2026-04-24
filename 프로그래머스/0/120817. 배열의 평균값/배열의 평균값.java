class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        
        // 합 구함
        for (int num : numbers) {
            sum += num;
        }
        
        // 평균
        answer = (double) sum / numbers.length;
      
    return answer;
    }
}