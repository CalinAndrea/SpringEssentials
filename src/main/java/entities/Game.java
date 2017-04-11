package entities;

/**
 * Created by Calin on 10-Apr-17.
 */
public interface Game {

    void setHomeTeam(Team team);
    Team getHomeTeam();
    void setAwayTeam(Team team);
    Team getAwayTeam();
    String playGame();
}
