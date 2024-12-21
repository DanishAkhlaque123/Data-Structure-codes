// class Solution {
//     ArrayList<Integer>[] graph;
//     int k, values[];
    
//     public void makeGraph(int n, int[][] edges){
//         for(int i=0;i<n;i++){
//             graph[i] = new ArrayList<>();
//         }
        
//         for(int[] edge : edges){
//             graph[edge[0]].add(edge[1]);
//             graph[edge[1]].add(edge[0]);
//         }
//     }
    
//     public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
//         this.graph = new ArrayList[n];
//         this.k = k;
//         this.values = values;
//         makeGraph(n, edges);
//         return f(0, -1)[1];
//     }
//     public int[] f(int currVal, int parent){
//         int sum = values[currVal], comps = 0;
//         for(int nbr : graph[currVal]){
//             if(nbr == parent){
//                 continue;
//             }
//             int[] v = f(nbr, currVal);
//             comps += v[1];
//             if(v[0]==0){
//                 sum+=v[2];
//             }
//         }
//         if(sum%k==0){
//             return new int[]{1, comps+1, 0};
//         }
//         return new int[]{0, comps, sum};
//     }
// }

class Solution {
    private int comp, k;
    private int[] values;
    private List<Integer>[] tree;

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        this.k = k;
        this.values = values;
        this.comp = 0;
        this.tree = new LinkedList[n];

        for(int i=0;i<n;i++) tree[i] = new LinkedList<>();
        for(int[] edge: edges){
            int u = edge[0], v = edge[1];
            tree[u].add(v);
            tree[v].add(u);
        }

        if(divide(0, 0)!=0) return -1; //For the case where sum(values) % k != 0
        return comp;
    }

    private int divide(int node, int parent){
        int res = values[node]%k;
        for(int next: tree[node]) 
            if(next!=parent)
                res = (res+divide(next, node))%k;

        if(res==0) comp++;
        return res;
    }
}