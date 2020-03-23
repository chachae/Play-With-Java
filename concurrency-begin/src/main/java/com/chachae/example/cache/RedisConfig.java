package com.chachae.example.cache;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

/**
 * @author chachae
 * @date 2019/11/23 10:26
 */
@Configuration
public class RedisConfig {

  @Value("${jedis.port}")
  private Integer port;

  @Value("${jedis.host}")
  private String host;

  /**
   * 设置 redis 配置信息
   *
   * @return JedisPool 对象
   */
  @Bean
  public JedisPool jedisPool() {
    return new JedisPool(host, port);
  }
}
