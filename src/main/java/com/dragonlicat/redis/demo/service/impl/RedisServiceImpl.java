/** 
 * Project Name:redis-demo 
 * File Name:RedisServiceImpl.java 
 * Package Name:com.dragonlicat.redis.demo.service.impl 
 * Date:2018年8月26日下午8:07:46 
 * Copyright (c) 2018, shchsh888@hotmail.com All Rights Reserved. 
 * 
*/  
  
package com.dragonlicat.redis.demo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;
import org.springframework.stereotype.Service;
import com.dragonlicat.redis.demo.entry.KvString;
import com.dragonlicat.redis.demo.service.RedisService;

/** 
 * ClassName:RedisServiceImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年8月26日 下午8:07:46 <br/> 
 * @author   DANAODAI
 * @version   
 * @since    JDK 1.8
 * @see       
 */
@Service
public class RedisServiceImpl implements RedisService {
  
  @Autowired
  private RedisTemplate< String, String> redisTemplate;

  @Override
  public List<RedisClientInfo> listClients() {
    // TODO Auto-generated method stub
    
    return redisTemplate.getClientList();
  }

  @Override
  public void setValue(KvString kvString) {
    // TODO Auto-generated method stub
    redisTemplate.opsForValue().set(kvString.getKey(), kvString.getValue());
  }

  @Override
  public Map<String, String> getValue(String key) {
    // TODO Auto-generated method stub
    Map<String, String> map= new HashMap<>();
    map.put(key, redisTemplate.opsForValue().get(key));
    return map;
    
  }

}
  