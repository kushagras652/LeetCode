class Solution {
    public String customSortString(String order, String s) {

       HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
        }

        StringBuilder st = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            char currentChar = order.charAt(i);
            if (charCount.containsKey(currentChar)) {
                int count = charCount.get(currentChar);

                for (int j = 0; j < count; j++) {
                    st.append(currentChar);
                }
                charCount.remove(currentChar);
            }
        }

        for (char remaining : charCount.keySet()) {
            int count = charCount.get(remaining);
            for (int i = 0; i < count; i++) {
                st.append(remaining);
            }
        }

        return st.toString();
    }
}