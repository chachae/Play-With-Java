package cn.chachae.play.with.java.intervirew_experience;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author chenyuexin
 * @date 2021/2/6 14:21
 * @version 1.0
 */
@SpringBootApplication
public class InterviewExperienceApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder()
        .main(InterviewExperienceApplication.class)
        .bannerMode(Mode.OFF)
        .web(WebApplicationType.SERVLET)
        .run(args);
  }
}
