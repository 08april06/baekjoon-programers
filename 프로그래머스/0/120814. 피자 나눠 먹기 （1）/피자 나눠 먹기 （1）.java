class Solution {
    public int solution(int n) {
        int answer = 0;
        if (1>=7) {
            return 1;
        } else if (n % 7 == 0) {
            answer = n/7;
        } else {
            answer = n/7 + 1;
        }
        return answer;
    }
}