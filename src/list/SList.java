package list;

import java.util.ArrayList;

public class SList {
	public static <A> ArrayList<A> create(A... as) {
        ArrayList<A> x = new ArrayList<A>();
        for (A a: as) {
            x.add(a);
        }
        return x;
    }
}
