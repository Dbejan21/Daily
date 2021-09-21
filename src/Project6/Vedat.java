package Project6;

public class Vedat {

    public static int maxNum(int[] arrays) {
        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++)
                if (max < arrays[i] && i != j) {
                    max = arrays[i];
                }
        }
        return max;
    }

    public static int sumOfOdds(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static boolean threeAmigos(int[] array) {
        boolean status = false;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) {
                status = true;
                break;
            }
            if (array[i] % 2 == 1 && array[i + 1] % 2 == 1 && array[i + 2] % 2 == 1) {
                status = true;
                break;
            }
        }
        return status;
    }

    public static boolean make100With2(int[] nums) {
        boolean status = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == 100) {
                    status = true;
                    break;
                }
            }
        }
        return status;
    }

    public static String[] switchPairs(String[] list) {
        String temp;
        for (int i = 0; i < list.length; i += 2) {
            temp = list[i];
            list[i] = list[i + 1];
            list[i + 1] = temp;
        }
        return null;
    }

    public static void main(String[] args) {
        String[] array = {"four", "score", "and", "seven", "years", "ago"};
        System.out.println(switchPairs(array));
    }
}
