package week1.q1828;

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for(int i = 0;i<queries.length;i++){
            for(int j = 0;j<points.length;j++){
                if(distance(points[j],queries[i])){
                    ans[i]++;
                }
            }
        }
        return ans;
    }

    private boolean distance(int[] point, int[] query) {
        return Math.pow(point[0]-query[0],2)+Math.pow(point[1]-query[1],2)<=Math.pow(query[2],2);
    }
}