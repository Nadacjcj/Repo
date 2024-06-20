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

    public static void binarySearchCheckIfFound(int[] array, int target) {
        if(array == null || array.length == 0) {
            System.out.println("Cant search in an array of length zero");
            return;
        }

        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;
        boolean flag = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                flag = true;
                break;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!flag) {
            System.out.println("Value " + target + " was not found using binary search");
        } else {
            System.out.println("Value " + target + " was found using binary search");
        }
    }
    public static void main(String[] args) {}

}
