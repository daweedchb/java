package ru.mirea.components;

import org.springframework.stereotype.Component;
import ru.mirea.interfaces.Programmer;

@Component
public class Senior implements Programmer {
    @Override
    public String doCoding() {
        return "Senior is coding";
    }
}
