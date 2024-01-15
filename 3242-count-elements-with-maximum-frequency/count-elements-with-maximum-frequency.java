class Solution {
    public int maxFrequencyElements(int[] nums) {
          if (nums == null || nums.length == 0) {
            return 0;
        }

        // Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(num));
        }

        // Count how many elements have the maximum frequency
        int totalFrequencies = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency == maxFrequency) {
                totalFrequencies += frequency;
            }
        }

        return totalFrequencies;
    }
    }
