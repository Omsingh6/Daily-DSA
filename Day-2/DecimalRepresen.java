import java.util.*;

public class DecimalRepresen {

    public static int[] decimalRepresentation(int n) {

        List<Integer> list = new ArrayList<>();
        int place = 1;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                list.add(digit * place);
            }

            place *= 10;
            n /= 10;
        }

        Collections.reverse(list);

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 573;

        int[] result = decimalRepresentation(n);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}