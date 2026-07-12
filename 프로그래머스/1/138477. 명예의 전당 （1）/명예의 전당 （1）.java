import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();
        
        for(int i = 0; i <score.length; i++) {
            hallOfFame.offer(score[i]);
            
            // 명예의 전당에는 상위 k개만 남긴다
            if(hallOfFame.size() > k) {
                hallOfFame.poll();
            }
            
            // 최소 힙의 맨 앞 = 현재 명예의 전당 최하위 점수
            answer[i] = hallOfFame.peek();
        }
        
        return answer;
    }
}