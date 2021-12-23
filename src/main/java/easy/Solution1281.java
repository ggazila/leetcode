package easy;

/*
1281. Subtract the Product and Sum of Digits of an Integer
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/
 */
class Solution1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int multiply = 1;
        
        while(n > 0) {
            int temp = n % 10;
            sum += temp;
            multiply *= temp;
            n = n / 10;
        }
        return multiply - sum;
    }
}