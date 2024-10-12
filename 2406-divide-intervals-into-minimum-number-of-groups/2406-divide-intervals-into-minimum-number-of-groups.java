class Solution {
public int minGroups(int[][] intervals) {
int n = intervals.length;
int[] st = new int[n];
int[] et = new int[n];

int i=0;
for(int[] val : intervals){
st[i]=val[0];
et[i]=val[1];
i++;
}

Arrays.sort(st);
Arrays.sort(et);

int ans=0;
int eti=0;
int max=0;
for(int val : st){
if(val<=et[eti]){
ans = Math.max(ans, max+1);
max++;
}
else{
eti++;
}
}
return ans;

}
}