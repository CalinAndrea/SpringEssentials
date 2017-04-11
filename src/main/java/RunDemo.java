import config.AppConfig;
import entities.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Calin on 10-Apr-17.
 */
public class RunDemo {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Game game = context.getBean("game", Game.class);
        System.out.println(game.playGame());
    }
}
