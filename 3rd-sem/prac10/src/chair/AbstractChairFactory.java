package chair;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicChair();

    FunctionalChair createFunctionalChair();
}
