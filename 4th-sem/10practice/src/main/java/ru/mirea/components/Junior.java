package ru.mirea.components;

import org.springframework.stereotype.Component;
import ru.mirea.interfaces.Programmer;

@Component
public class Junior implements Programmer {
    @Override
    public String doCoding() {
        return "Jun is coding";
    }
}
