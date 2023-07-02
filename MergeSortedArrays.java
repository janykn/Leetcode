//What I did

//1st Submission( I didn't check question properly, i could have used m,n in loops. they serve same purpose as l1,l2 in this code, for modified code, see 2nd submission)
//Time Complexity(Behind 70%) Space Complexity(Behind 49.9%)
class MergeSortedArrays {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int diff = java.lang.Math.abs(l1 - l2);
        for (int i = diff, j = 0; i < l1 && j < l2; i++, j++) {
            nums1[i] = nums2[j];
        }
        java.util.Arrays.sort(nums1);
        return nums1;
    }
}

//2nd Submission
//Time Complexity(Behind 70%) Space Complexity(Behind 10%)
class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int s =m+n;
        for (int i = m, j = 0; i < s && j < n; i++, j++) {
            nums1[i] = nums2[j];
        }
        java.util.Arrays.sort(nums1);
        return nums1;
    }
}

//Best Submission I found(0 ms, 

class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
	for (int i = m+n-1, a = m-1, b = n-1; b>=0; i--) {
		if (a >= 0 && A[a] > B[b]) A[i] = A[a--]; 
		else A[i] = B[b--];
	}}}

//What i could have done better(Best Submission i found
