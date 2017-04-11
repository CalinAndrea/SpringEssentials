package entities;

import org.springframework.stereotype.Component;

/**
 * Created by Calin on 10-Apr-17.
 */
@Component
public class Cubs implements Team {

    @Override
    public String getName() {
        return "Chicago Cubs";
    }

    public String toString() {
        return getName();
    }
}
