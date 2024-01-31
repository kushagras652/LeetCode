class Solution {
    public int[] dailyTemperatures(int[] temps) {
        //TLE
        // int[] answer=new int[temp.length];
        // answer[temp.length-1]=0;
        // int count=1;
        // int n=temp.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(temp[i]<temp[j]){
        //             answer[i]=count;
        //             break;
        //         }
        //         else{
        //             count++;
        //         }
        //     }
        //     count=1;
        // }
        // return answer;


         int[] results = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
    
        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return results;
    }
}