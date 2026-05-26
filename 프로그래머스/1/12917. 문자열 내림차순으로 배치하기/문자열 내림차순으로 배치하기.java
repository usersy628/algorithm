import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr); // 오름차순 정렬
        
        StringBuilder sb = new StringBuilder(new String(arr));
        
        return sb.reverse().toString(); // 뒤집음
    }
}