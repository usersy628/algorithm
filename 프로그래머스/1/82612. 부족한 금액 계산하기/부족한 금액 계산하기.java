class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = (long) price * count * (count + 1) /2;

        if (totalPrice > money) {
            return totalPrice - money;
        }
        
        return 0;
    }
}