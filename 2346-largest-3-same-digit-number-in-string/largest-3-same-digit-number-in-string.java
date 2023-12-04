class Solution {
    public String largestGoodInteger(String num) {
        char[] arr=num.toCharArray();
        PriorityQueue<Character> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]==arr[i-1] && arr[i]==arr[i+1]){
               pq.add(arr[i]);
            }
        }
        if(pq.isEmpty())
        return "";
        char str=pq.poll();
        String stri=String.valueOf(str);
        return stri+stri+stri;
    }
}