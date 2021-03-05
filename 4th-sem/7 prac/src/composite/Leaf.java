package composite;

import java.awt.dnd.InvalidDnDOperationException;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
