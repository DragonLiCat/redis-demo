/** 
 * Project Name:redis-demo 
 * File Name:RedisService.java 
 * Package Name:com.dragonlicat.redis.demo.service 
 * Date:2018年8月26日下午8:07:06 
 * Copyright (c) 2018, shchsh888@hotmail.com All Rights Reserved. 
 * 
*/  
  
package com.dragonlicat.redis.demo.service;  
/** 
 * ClassName:RedisService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年8月26日 下午8:07:06 <br/> 
 * @author   DANAODAI
 * @version   
 * @since    JDK 1.8
 * @see       
 */

import java.util.List;
import java.util.Map;
import org.springframework.data.redis.core.types.RedisClientInfo;
import com.dragonlicat.redis.demo.entry.KvString;

public interface RedisService {
  

  /**
   * 
   * listClients:(这里用一句话描述这个方法的作用). <br/> 
   * TODO(这里描述这个方法适用条件 – 可选).<br/> 
   * TODO(这里描述这个方法的执行流程 – 可选).<br/> 
   * TODO(这里描述这个方法的使用方法 – 可选).<br/> 
   * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
   * 
   * @author DANAODAI
   * @return 
   * @since JDK 1.8
   */
  public List<RedisClientInfo> listClients();
  
  
  /**
   * 
   * setValue:(这里用一句话描述这个方法的作用). <br/> 
   * TODO(这里描述这个方法适用条件 – 可选).<br/> 
   * TODO(这里描述这个方法的执行流程 – 可选).<br/> 
   * TODO(这里描述这个方法的使用方法 – 可选).<br/> 
   * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
   * 
   * @author DANAODAI
   * @param kvString 
   * @since JDK 1.8
   */
  public void setValue(KvString kvString);
  
  /**
   * 
   * getValue:(这里用一句话描述这个方法的作用). <br/> 
   * TODO(这里描述这个方法适用条件 – 可选).<br/> 
   * TODO(这里描述这个方法的执行流程 – 可选).<br/> 
   * TODO(这里描述这个方法的使用方法 – 可选).<br/> 
   * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
   * 
   * @author DANAODAI
   * @param key 
   * @since JDK 1.8
   */
  public Map<String, String> getValue(String key);

}
  