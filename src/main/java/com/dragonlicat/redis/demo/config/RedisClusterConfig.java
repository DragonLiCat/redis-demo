/**
 * Project Name:redis-demo File Name:RedisClusterConfig.java Package
 * Name:com.dragonlicat.redis.demo.config Date:2018年8月26日下午5:38:31 Copyright (c) 2018,
 * shchsh888@hotmail.com All Rights Reserved.
 * 
 */

package com.dragonlicat.redis.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * ClassName:RedisClusterConfig <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年8月26日 下午5:38:31 <br/>
 * 
 * @author DANAODAI
 * @version
 * @since JDK 1.8
 * @see
 */
@Configuration
@EnableRedisRepositories
public class RedisClusterConfig {

  @Autowired
  private RedisProperties redisProperties;

  @Bean
  public RedisConnectionFactory connectionFactory() {

    return new JedisConnectionFactory(redisClusterConfiguration());
  }

  @Bean
  public RedisClusterConfiguration redisClusterConfiguration() {
    RedisClusterConfiguration redisClusterConfiguration =
        new RedisClusterConfiguration(redisProperties.getCluster().getNodes());
    redisClusterConfiguration.setMaxRedirects(redisProperties.getCluster().getMaxRedirects());
    // 如加密pwd
    // redisClusterConfiguration.setPassword("pwd");
    return redisClusterConfiguration;
  }

  @Bean
  public RedisTemplate<String, String> redisTemplate() {
    RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(connectionFactory());
    RedisSerializer<String> stringSerializer = new StringRedisSerializer();
    redisTemplate.setKeySerializer(stringSerializer);
    redisTemplate.setValueSerializer(stringSerializer);
    return redisTemplate;
  }
}
