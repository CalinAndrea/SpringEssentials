package config;

import entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by Calin on 10-Apr-17.
 */
@Configuration
@ComponentScan(basePackages = {"entities", "config"})
public class AppConfig {

    @Autowired
    private DataSource dataSource;

    //resource is for name Beans
    @Resource
    private Team redSox;

    //autowire is for type. for more types, we need qualifier
    @Autowired @Qualifier("cubs")
    private Team away;
    @Bean
    public Game game() {
        BaseballGame baseballGame = new BaseballGame(redSox, away);
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }

}
