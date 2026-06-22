import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> sums = new TreeSet<>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sums.add(numbers[i] + numbers[j]);
                
             }
        }
        
        
        return sums.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}