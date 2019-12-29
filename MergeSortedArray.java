class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int w = nums1.length - 1;
        int r1 = m - 1;
        int r2 = n - 1;

        while( r1 >= 0 && r2 >= 0 ) {
            if( nums1[r1] >= nums2[r2] ) {
                nums1[w] = nums1[r1];
                r1--;
            }
            else {
                nums1[w] = nums2[r2];
                r2--;
            }
            w--;
        }

        while( r2 >= 0 ) {
            nums1[w] = nums2[r2];
            r2--;
            w--;
        }

    }
}
