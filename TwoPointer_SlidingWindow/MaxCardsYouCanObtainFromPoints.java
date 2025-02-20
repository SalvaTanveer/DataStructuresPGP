package TwoPointer_SlidingWindow;

public class MaxCardsYouCanObtainFromPoints {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0, right = 0, maxSum = 0;

        // sum of first k cards
        for (int i = 0; i < k; i++) {
            left += cardPoints[i];
        }
        maxSum = left;
        int rightIdx = cardPoints.length - 1;
        // checking all possibilites (skipping one from left, adding one from right)
        for (int i = k - 1; i >= 0; i--) {
            left -= cardPoints[i];
            right += cardPoints[rightIdx--];
            maxSum = Math.max(maxSum, left + right);
        }
        return maxSum;
    }
}
