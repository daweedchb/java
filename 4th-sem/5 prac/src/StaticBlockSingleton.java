public class StaticBlockSingleton {
    private static StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {
    }

    //exception handling within static block
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured while creating a Singleton Class");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}