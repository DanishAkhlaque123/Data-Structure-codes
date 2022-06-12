class Solution {
    public int maximumUniqueSubarray(int[] nums) {
    HashSet map=new HashSet<>();
int sum=0,max=0,i=0,j=0;
while(i<nums.length){
if(!map.contains(nums[i])){
map.add(nums[i]);
sum+=nums[i];
max=Math.max(max,sum);
i++;
}
else{
map.remove(nums[j]);
sum-=nums[j];
max=Math.max(max,sum);
j++;
}
}
return max;
        
    }
}