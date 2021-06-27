package com.xjzhang.common.cache;

import org.springframework.data.redis.core.RedisTemplate;

/**
 *  缓存提供类
 * @author xjzhang
 * @version 1.0
 * @date 2021/6/27 19:02
 */
public class CacheProvider {
    //由于当前class不在spring boot框架内（不在web项目中）所以无法使用autowired，使用此种方法进行注入
    private static RedisTemplate<String, String> template = (RedisTemplate<String, String>) SpringBeanUtil.getBean("redisTemplate");



}
