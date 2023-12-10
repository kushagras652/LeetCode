class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<variables.length;i++){
            
            int a=variables[i][0];
            int b=variables[i][1];
            int c=variables[i][2];
            int m=variables[i][3];
            
            int result1 = 1;
            for (int j = 0; j < b; j++) {
                result1 = (result1 * a) % 10;
            }
            int result2=1;
            for(int j=0;j<c;j++){
                result2=(result1*result2)%m;
            }
            
            if(result2==target)
                list.add(i);
        }
        return list;
    }
}