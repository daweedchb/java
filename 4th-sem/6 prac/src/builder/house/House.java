package builder.house;

import java.util.ArrayList;

public class House {
    ArrayList<Object> parts = new ArrayList();

    public void add(Object part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        return "House{" +
                "parts=" + parts +
                '}';
    }
}
