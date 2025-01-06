import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // Set to store unique sums
        Set<Integer> sumSet = new HashSet<>();
        
        // Iterate through the array to calculate all possible sums of two different indices
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }
        
        // Convert the set to a list and sort it
        List<Integer> sumList = new ArrayList<>(sumSet);
        Collections.sort(sumList);
        
        // Convert the sorted list to an int array
        int[] answer = new int[sumList.size()];
        for (int i = 0; i < sumList.size(); i++) {
            answer[i] = sumList.get(i);
        }
        
        return answer;
    }
}
