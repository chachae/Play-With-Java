package com.chachae.example.cache;

import cn.hutool.db.nosql.redis.RedisDS;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

/**
 * @author chachae
 * @date 2019/11/23 10:29
 */
@Component
public class RedisUtil {

  @Resource private JedisPool jedisPool;

  /**
   * 使用hutool 同步获取 Jedis 对象<br>
   * 「需要在根目录：resources/config/redis.setting 下写好 Redis 链接配置信息」
   *
   * @return Jedis 对象
   */
  private synchronized Jedis getJedis() {
    // 自定义配置文件路径 RedisDS.create("/redis.setting").getJedis()
    return RedisDS.create().getJedis();
  }

  /**
   * 使用 hutool set key
   *
   * @param key 键
   * @param value 值
   */
  private synchronized void setByHutoolExample(String key, String value) {
    Jedis jedis = getJedis();
    jedis.set(key, value);
    jedis.close();
  }

  /**
   * 同步锁 set key
   *
   * @param key 键
   * @param value 值
   */
  public synchronized void set(String key, String value) {
    Jedis jedis = jedisPool.getResource();
    jedis.set(key, value);
    jedis.close();
  }

  /**
   * 同步锁 get key
   *
   * @param key 键
   * @return 值
   */
  public synchronized String get(String key) {
    Jedis jedis = jedisPool.getResource();
    if (null == jedis) {
      return null;
    }
    String value = jedis.get(key);
    jedis.close();
    return value;
  }
}
