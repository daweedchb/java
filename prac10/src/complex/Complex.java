package complex;

public class Complex {
    int real;
    int imagine;

    public Complex(int real, int imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public int getReal() {
        return real;
    }

    public int getImagine() {
        return imagine;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imagine=" + imagine +
                '}';
    }
}
