package entities;

import org.springframework.stereotype.Component;

/**
 * Created by Calin on 10-Apr-17.
 */
@Component
public class Royals implements Team {
    @Override
    public String getName() {
        return "Kansas City Royals";
    }

    public String toString() {
        return getName();
    }
}
