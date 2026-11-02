
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

class Binomial {
    static Map<Point, Integer> binoms = new HashMap<Point, Integer>();

    static int bincof(int n, int k) {
        if (k == n || k == 0) {
            return 1;
        }
        return bincof(n - 1, k) + bincof(n - 1, k - 1);
    }

    static int bincofmap(int n, int k) {
        Point p = new Point(n, k);
        if (binoms.get(p) == null) {
            binoms.put(p, bincof(p.x, p.y));
        }
        return binoms.get(p);
    }

    public static void main(String[] args) {
        System.out.println(binoms.get(new Point(4, 2)));
        System.out.println(bincofmap(4, 2));
        System.out.println(binoms.get(new Point(4, 2)));
    }

}