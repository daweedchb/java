import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> function = (s) -> String.valueOf(new StringBuilder(s).reverse());
        String[] strArr = new String[]{"abc", "adc"};

        for (String str : strArr) {
            str = function.apply(str);
            System.out.println(str); //cba cda
        }
    }
}
