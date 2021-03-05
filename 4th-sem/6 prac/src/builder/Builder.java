package builder;

import builder.house.*;

public interface Builder {
    void buildBasement();

    void buildStorey();

    void buildRoof();

    House getResult();
}
