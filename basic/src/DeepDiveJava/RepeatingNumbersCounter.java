package DeepDiveJava;

public class RepeatingNumbersCounter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3};
        int count;
        
        System.out.println("Repeating numbers and their counts:");
        for (int i = 0; i < array.length; i++) {
            count = 1;
            if (array[i] != -1) { // -1 indicates that the element is already counted
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        // Mark the repeated element as counted to avoid recounting
                        array[j] = -1;
                    }
                }
                // Print the repeated number and its count
                if (count > 1) {
                    System.out.println(array[i] + " - " + count);
                }
            }
        }
    }
}

