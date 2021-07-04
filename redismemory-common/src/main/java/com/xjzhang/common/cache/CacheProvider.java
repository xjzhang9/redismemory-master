package com.xjzhang.common.cache;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * 缓存提供类
 *
 * @author xjzhang
 * @version 1.0
 * @date 2021/6/27 19:02
 */
public class CacheProvider {
    private RedisTemplate<String, String> template;
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.template = redisTemplate;
    }

}
