package com.chachae;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author chachae
 * @date 2019/11/4 12:00
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

  @Resource private HttpInterceptor httpInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(httpInterceptor).addPathPatterns("/**");
  }
}
