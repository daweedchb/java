package ru.mirea.components;

import org.springframework.stereotype.Component;
import ru.mirea.interfaces.Programmer;

@Component
public class Middle implements Programmer {
    @Override
    public String doCoding() {
        return "Mid is coding";
    }
}
