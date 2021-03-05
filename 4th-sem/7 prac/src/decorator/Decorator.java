package decorator;

public abstract class Decorator extends Component {
    public Component component;

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
