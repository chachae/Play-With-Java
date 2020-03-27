package com.chachae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConcurrencyApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConcurrencyApplication.class, args);
  }

  @Bean
  public FilterRegistrationBean<HttpFilter> httpFilter() {
    FilterRegistrationBean<HttpFilter> registrationBean = new FilterRegistrationBean<>();
    registrationBean.setFilter(new HttpFilter());
    registrationBean.addUrlPatterns("/threadLocal/*");
    return registrationBean;
  }
}
