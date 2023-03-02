import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int r[]) {
        int x = r.length - 1;
        for (int i = 0; i < r.length / 2; i++) {
            int temp = r[i];
            r[i] = s[x];
            r[x] = temp;
            x--;


        }
    }


}