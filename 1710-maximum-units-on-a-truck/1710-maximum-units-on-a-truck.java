class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(int[] a,int[] b)->{
            return b[1]-a[1];
        });
        int size=0;
        int n=boxTypes.length;
        int n1=0;
        for(int i=0;i<n;i++)
        {
            if(truckSize-boxTypes[i][0]>=0)
            {
                size+=(boxTypes[i][1]*boxTypes[i][0]);
                truckSize-=boxTypes[i][0];
                n1++;
            }
            else
            {
                break;
            }
        }
        if(n1<n)
        size+=(truckSize*boxTypes[n1][1]);
        return size;
    }
}