class Solution {
    
    List<List<Integer>> al=new ArrayList<>();
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> al1=new ArrayList<>();
        al1.add(0);
        helper(al1,0,graph.length-1,graph);
        return al;
    }
    
    public void helper(List<Integer> al1,int src,int dest, int[][] graph)
    {
        if(src==dest)
        {
            al.add(new ArrayList<>(al1));
            return;
        }
        
        
        for(int next:graph[src])
        {
            al1.add(next);
            helper(al1,next,dest,graph);
            al1.remove(al1.size()-1);
        }
        
        
    }
    
}