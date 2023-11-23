class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int[] z=Arrays.copyOfRange(nums,l[i],r[i]+1);
            list.add(check(z));
        }
        return list;
    }
    private boolean check(int[] arr){
        Arrays.sort(arr);
        int a=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=a){
                return false;
            }
        }
        return true;
    }
}