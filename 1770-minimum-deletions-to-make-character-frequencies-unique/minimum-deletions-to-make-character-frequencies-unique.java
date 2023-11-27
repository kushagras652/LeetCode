class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        int count = 0;

        for(int i = 0; i < s.length(); i++)
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        
        for(int x : hm.values()){
            if(hs.contains(x)){
                int i = x;

                while(hs.contains(i)){
                    i--;
                    count++;
                }

                if(i != 0)
                    hs.add(i);
            }
            else
                hs.add(x);
        }

        return count;
    }
}