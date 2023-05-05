class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //주어진 두 배열을 합치고 오름차 순으로 정렬해라..?
        for(int i=0;i<n;i++){
            nums1[i+m]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}