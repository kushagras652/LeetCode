class Solution {
    public int heightChecker(int[] heights) {
        boolean swapped;
        int[] expected=new int[heights.length];
        System.arraycopy(heights, 0,expected, 0,heights.length);
        for(int i=0;i<expected.length;i++){
            swapped=false;
            for(int j=0;j<expected.length-i-1;j++){
                if(expected[j]>expected[j+1]){
                    int temp=expected[j];
                   expected[j]=expected[j+1];
                    expected[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            break;
        }
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
        
    }
}