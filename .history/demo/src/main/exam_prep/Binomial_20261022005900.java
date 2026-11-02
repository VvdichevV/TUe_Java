package exam_prep;

public class Binomial {

    public static void main(String[] args) {
        System.out.println(bincof(4, 2));
    }

    public static int bincof(int n, int k) {
        System.out.println("test");
        if (k == n || k == 0) {
            return 1;
        }
        return bincof(n - 1, k) + bincof(n - 1, k - 1);
    }
}