class Solution {
       public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int a[]=new int[n+m];
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                a[k]=nums1[i];
                i++;
            }
            else
                
            {
                a[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {
            a[k]=nums1[i];
            i++;
            k++;
        }
          while(j<n)
        {
            a[k]=nums2[j];
            j++;
            k++;
        }
        
        for(int l=0;l<a.length;l++)
        {
            nums1[l]=a[l];
        }
        
    }

}