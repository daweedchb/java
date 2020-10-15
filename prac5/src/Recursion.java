public class Recursion {
    public static void main(String[] args) {
        System.out.println(recursion3(10, 5));
        System.out.println(recursion4(0, 0, 3, 15));
        System.out.println(recursion5(1567));
        System.out.println(recursion6(13, 2));
        recursion7(56, 2);
        System.out.println(recursion8("noon"));
    }

    public static String recursion3(int A, int B) {
        if (A > B) {
            return A + " " + recursion3(A - 1, B);
        } else {
            if (A == B) {
                return Integer.toString(A);
            }
            return A + " " + recursion3(A + 1, B);
        }
    }

    public static int recursion4(int len, int sum, int k, int s) {
        if (len == k) if (sum == s) {
            return 1;
        } else {
            return 0;
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion4(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static int recursion5(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + recursion5(n / 10);
        }
    }

    public static boolean recursion6(int n, int i) {
        // i- доп. параметр рекурсии(делитель n). При вызове должен равняться двум.
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n / 2) {
            return recursion6(n, i + 1);
        } else {
            return true;
        }
    }

    public static void recursion7(int n, int k) {
        // k- доп. параметр. При вызове должен равняться двум.
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            recursion7(n / k, k);
        } else {
            recursion7(n, ++k);
        }
    }

    public static String recursion8(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return recursion8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
}