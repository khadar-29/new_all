package java1;

public class breaks{
    public class BreakInForLoop {
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};
            int target = 30;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == target) {
                    System.out.println("Found the target: " + target);
                    break;
                }
            }
        }
    }
}