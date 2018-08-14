package destiny.crystal.ast;

import java.util.Iterator;

/**
 * Created by zhangtianlong on 18/8/15.
 */
public abstract class ASTree implements Iterable<ASTree> {
    public abstract ASTree child(int i);
    public abstract int numChildren();
    public abstract Iterator<ASTree> children();
    public abstract String location();

    public Iterator<ASTree> iterator() {
        return children();
    }
}
