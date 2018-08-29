/** 
 * Project Name:redis-demo 
 * File Name:User.java 
 * Package Name:com.dragonlicat.redis.demo.entry 
 * Date:2018年8月26日下午9:22:11 
 * Copyright (c) 2018, shchsh888@hotmail.com All Rights Reserved. 
 * 
*/  
  
package com.dragonlicat.redis.demo.entry;  
/** 
 * ClassName:User <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年8月26日 下午9:22:11 <br/> 
 * @author   DANAODAI
 * @version   
 * @since    JDK 1.8
 * @see       
 */
public class KvString {
  String key;
  String value;
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }
  
  
  @Override
  public String toString() {
    return "KvString [key=" + key + ", value=" + value + "]";
  }
  
  

}
  