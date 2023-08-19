class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        //SHOWING TLE
      //  int[] arr1 = new int[nums1.length];
        // int[] arr2 = new int[nums2.length];
        // int count = 0;

        // for (int i = 0; i < nums1.length; i++) {
        //     arr1[i] = nums1[i] * nums1[i];
        // }

        // for (int i = 0; i < nums2.length; i++) {
        //     arr2[i] = nums2[i] * nums2[i];
        // }

        // count += findTripletsCount(nums1, arr2);
        // count += findTripletsCount(nums2, arr1);

        // return count;
        int n1=nums1.length;
        int n2=nums2.length;
        HashMap<Long,Integer> hp1=new HashMap<>();
        HashMap<Long,Integer> hp2=new HashMap<>();
        for(int i=0;i<n1;i++){
            long a=(long)nums1[i]*(long)nums1[i];
            if(hp1.containsKey(a))
            hp1.put(a,hp1.get(a)+1);
            else
            hp1.put(a,1);
        }
         for(int i=0;i<n2;i++){
            long a=(long)nums2[i]*(long)nums2[i];
            if(hp2.containsKey(a))
            hp2.put(a,hp2.get(a)+1);
            else
            hp2.put(a,1);
        }
        int ans=0;
        for(int i=0;i<n1;i++){
            for(int j=i+1;j<n1;j++){
                long a=(long)nums1[i]*(long)nums1[j];
                if(hp2.containsKey(a)){
                    ans=ans+hp2.get(a);
                }
            }
        }

         for(int i=0;i<n2;i++){
            for(int j=i+1;j<n2;j++){
                long a=(long)nums2[i]*(long)nums2[j];
                if(hp1.containsKey(a)){
                    ans=ans+hp1.get(a);
                }
            }
        }
        return ans;
    }

    // private int findTripletsCount(int[] nums1, int[] arr2) {
    //     int count = 0;
    //     for (int j = 0; j < nums1.length - 1; j++) {
    //         for (int k = j + 1; k < nums1.length; k++) {
    //             long target = (long)nums1[j] * nums1[k];
    //             for (int i = 0; i < arr2.length; i++) {
    //                 if (arr2[i] == target) {
    //                     count++;
    //                 }
    //             }
    //         }
    //     }
    //     return count;
    // }
}
