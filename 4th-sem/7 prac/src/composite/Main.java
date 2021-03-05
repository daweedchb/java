package composite;

public class Main {
    public static void main(String[] args) {
        Component root = new Composite("ROOT");
        Component branch1 = new Composite("BR1");
        Component branch2 = new Composite("BR2");
        Component leaf1 = new Composite("L1");
        Component leaf2 = new Composite("L2");

        root.add(branch1);
        root.add(branch2);
        branch1.add(leaf1);
        branch2.add(leaf2);
        root.operation();
    }
}
