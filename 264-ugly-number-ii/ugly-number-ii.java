class Solution {
    public int nthUglyNumber(int n) {
        // if(n==1)
        // return 1;

       // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
       // pq.add(1);
        // int a=0;
        // for(int i=1;i<=1690;i++){

        //     if(a==n)
        //     break;

        //     if(i%2==0 || i%3==0 || i%5==0){
        //         pq.add(i);
        //         a++;
        //     }
            
        // }
        // for (int i = 0; i < n -1; i++) {
        //     pq.poll();
        // }

        // for(int i=1;i<n;i++){
        //     int a=Math.min(i*2,Math.min(i*3,i*5));
        //     pq.add(a);
        // }
        // return pq.peek();
         PriorityQueue<Long> pq = new PriorityQueue<>();
  pq.add(1l);
  for (int i = 0; i < n - 1; ++i) {
    long val = pq.remove();
    while (pq.size() > 0 && pq.peek() == val) pq.remove(); // remove duplicates
    pq.add(val * 2);
    pq.add(val * 3);
    pq.add(val * 5);
  }
  // return (int) pq.remove();   // 
  return pq.remove().intValue();
    }
}