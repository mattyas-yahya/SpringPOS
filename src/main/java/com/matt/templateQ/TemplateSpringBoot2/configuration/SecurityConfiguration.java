package com.matt.templateQ.TemplateSpringBoot2.configuration;

import com.matt.templateQ.TemplateSpringBoot2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {

@Autowired
private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Autowired
//    UserRepository urep;
//
@Autowired
private DataSource dataSource;
//
//    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
//
private UserDetailsService userDetailsService;

@Autowired
private UserService userService;
Authentication auth = SecurityContextHolder.getContext().getAuthentication();


@Bean
public BCryptPasswordEncoder passwordEncoder() {
BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
return bCryptPasswordEncoder;
}
private static final String SQL_ROLE
="select name, role from user where name=?";

private static final String SQL_LOGIN
= "select name, password, active from user where name=?";




@Override
protected void configure(AuthenticationManagerBuilder auth)
throws Exception
{
auth.
jdbcAuthentication()
.dataSource(dataSource)
.usersByUsernameQuery(SQL_LOGIN)
.authoritiesByUsernameQuery(SQL_ROLE)
.dataSource(dataSource)
.passwordEncoder(bCryptPasswordEncoder)
;
}




    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();

        http.authorizeRequests()
                .antMatchers("/dist/**","/plugins/**","/css/**","/bootstrap/**","/js/**","/css/**","/fonts/**","/registration").permitAll()
                .antMatchers("/dashboard/**","/dashboard/index.html","/dashboard/index","/contact","/PM","/Departemen","/jadwal","/asset","/histori","/Work_order","/biaya","/moveout","/header_moveout","/report","/failur","/MtbfMttr").hasRole("ADMIN")
                .antMatchers("/service_request").hasRole("USER")
                .antMatchers("/monitor").hasRole("ACTUATOR")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .usernameParameter("name")
                .passwordParameter("password")
                .defaultSuccessUrl("/index").successHandler(successHandler())
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }
@Bean
public AuthenticationSuccessHandler successHandler()
{
return new MySimpleUrlAuthenticationSuccessHandler();
}
}
