/** 
 * Project Name:redis-demo 
 * File Name:RedisController.java 
 * Package Name:com.dragonlicat.redis.demo.controller 
 * Date:2018年8月26日下午8:15:56 
 * Copyright (c) 2018, shchsh888@hotmail.com All Rights Reserved. 
 * 
*/  
  
package com.dragonlicat.redis.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;
import com.dragonlicat.redis.demo.entry.KvString;
import com.dragonlicat.redis.demo.service.RedisService;
import com.dragonlicat.redis.demo.utils.ViewTools;

/** 
 * ClassName:RedisController <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年8月26日 下午8:15:56 <br/> 
 * @author   DANAODAI
 * @version   
 * @since    JDK 1.8
 * @see       
 */
@RestController
public class RedisController {
  
  @Autowired
  private RedisService redisService;
  
  
  @GetMapping("/v1/redis/clients")
  public JSONObject listClients() {   
    return ViewTools.convertJson(redisService.listClients());   
  }
  
  @GetMapping("/v1/redis/{key}")
  public JSONObject getKvStrings(@PathVariable(value="key") String key) {   
    return ViewTools.convertJson(redisService.getValue(key));   
  }
  
  @PostMapping("/v1/redis/kv")
  @ResponseBody
  public void setKvStrings(@RequestBody KvString kvString) {   
    redisService.setValue(kvString);   
  }

}
  