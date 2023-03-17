class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int v=rooms.size();
        int[] vis=new int[v];
        
        helper(0,vis,rooms);
        for(int i=0;i<v;i++){
            if(vis[i]==0){
                return false;
            }
        }
        return true;
        
    }
    
    public void helper(int src, int[] vis, List<List<Integer>> rooms){
        vis[src]=1;
        for(int nbr:rooms.get(src)){
            if(vis[nbr]==0){
                helper(nbr, vis, rooms);
            }
        }
    }
    
}