class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int elem:stones){
            pq.add(elem);
        }

        while(!pq.isEmpty()){

            if(pq.size()==1)
            return pq.poll();

            int x=pq.poll();
            int y=pq.poll();

            int z=x-y;
            if(z!=0){
                pq.add(z);
            }
        }

        return 0;
    }
}