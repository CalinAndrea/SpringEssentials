package entities;

import org.springframework.stereotype.Component;

/**
 * Created by Calin on 10-Apr-17.
 */
@Component
public class RedSox implements Team {
    @Override
    public String getName() {
        return "Boston Red Sox";
    }

    public String toString() {
        return getName();
    }
}