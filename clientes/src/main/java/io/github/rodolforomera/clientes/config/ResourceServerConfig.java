package io.github.rodolforomera.clientes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfiguration;

/*@EnableResourceServer*/
public class ResourceServerConfig /*extends ResourceServerConfiguration*/ {

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/api/usuarios/**").permitAll()
                .antMatchers("/api/clientes/**",
                                        "/api/servicos-prestados/**").authenticated()
                .anyRequest().denyAll();
    }*/

}
