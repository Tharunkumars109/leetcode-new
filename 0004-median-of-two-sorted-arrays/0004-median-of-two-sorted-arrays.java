class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int t=nums1.length + nums2.length;
        int f=0;
        int fin[]=new int[t];
        for(int i=0;i<nums1.length;i++)
        {
            fin[i]=nums1[i];
            f++;
        }
        int i=0;
        for(int j=nums2.length-1;j>=0;j--)
        {
            fin[f]=nums2[j];
            f++;
        }
        Arrays.sort(fin);
        if(t%2==0)
        {
            float a=fin[t/2] + fin[t/2 - 1];
            return a/2;
        }
else
{
    return fin[t/2];
}
    }
}