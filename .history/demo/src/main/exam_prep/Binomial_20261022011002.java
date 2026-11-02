package exam_prep;

import java.util.HashMap;
import java.util.Map;
import java.awt.Point;

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
        return binoms.
    }

    public static void main(String[] args) {
        System.out.println(bincof(4, 2));
    }

}