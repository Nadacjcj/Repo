import java.util.Arrays;
public class Search {
    public static void linearSearchCheckIfFound(int[] array, int target) {
        for (int j : array) {
            if (j == target) {
                System.out.println("Value " + target + " was found ");
                return;
            }
        }
        System.out.println("Value " + target + " was not found ");
    }
    public static int linearSearchReturnIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {}

}
