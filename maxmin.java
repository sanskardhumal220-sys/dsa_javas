public class Main {
    public static void main(String[] args) {

        int[] a = {3, 5, 6, 7, 2, 11, 8, 9, 10};

        int min = 9;
        int max = a[0];
        int max2 = a[1];

        // Find maximum and second maximum
        for (int i : a) {

            if (i > max) {
                max2 = max;
                max = i;
            }
            else if (i > max2 && i < max) {
                max2 = i;
            }
        }

        System.out.println(max);
        System.out.println(max2);

        // Find minimum
        for (int i : a) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println(min);
    }
}