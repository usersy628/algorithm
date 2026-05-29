class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGcd(n, m);
        int lmc = n * m / gcd;
        
        return new int[]{gcd, lmc};
    }
    
    private int getGcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        return a;
    }
}