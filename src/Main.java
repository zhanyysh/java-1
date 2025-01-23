//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 0, 6, 7, 8, 20, 15};
        int max = 0;
        int sec_max = 0;
        int min = numbers[0];
        int sec_min = numbers[0];
        int sum = 0;
        int avg = 0;
        for (int number : numbers) {
            sum += number;
            avg = sum / numbers.length;
            if (number > max) {
                max = number;
            }
            if (number > sec_max & number < max) {
                sec_max = number;
            }
            if (number < min) {
                min = number;
            }
            if (number > min & number < sec_min) {
                sec_min = number;
            }
        }
        System.out.println(max);
        System.out.println(sec_max);
        System.out.println(min);
        System.out.println(sec_min);
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(palindrome("Anna"));
    }

    public static boolean palindrome(String a) {
        a = a.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = a.length() - 1;

        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
