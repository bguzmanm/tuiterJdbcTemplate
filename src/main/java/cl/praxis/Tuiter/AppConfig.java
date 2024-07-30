package cl.praxis.Tuiter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("cl.praxis")
@PropertySource("classpath:database.properties")
public class AppConfig {

  @Autowired
  Environment environment;

  @Bean
  DataSource ds(){
    DriverManagerDataSource source = new DriverManagerDataSource();
    // source.setCatalog("public");
    source.setDriverClassName(environment.getProperty("driver"));
    source.setUrl(environment.getProperty("url"));
    source.setUsername(environment.getProperty("user"));
    source.setPassword(environment.getProperty("password"));

    return source;
  }

}
