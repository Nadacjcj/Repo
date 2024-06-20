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

    public static void main(String[] args) {}

}
