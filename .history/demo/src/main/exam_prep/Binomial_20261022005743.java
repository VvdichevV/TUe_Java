package exam_prep;

public class Binomial {

    public static void main(String[] args) {
        System.out.println(bincof(2, 0));
    }

    public static int bincof(int n, int k) {
        if (k == n || k == 0) {
            return 1;
        }
        return bincof(n - 1, k) + bincof(n - 1, k - 1);
    }
}