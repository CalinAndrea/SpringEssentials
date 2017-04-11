package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by Calin on 10-Apr-17.
 */
@Configuration
public class InfrastructureConfig {

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource();
    }

}
