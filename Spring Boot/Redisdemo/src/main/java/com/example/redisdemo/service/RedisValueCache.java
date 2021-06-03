package com.example.redisdemo.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service

public class RedisValueCache {

    private ValueOperations<String, Object> valueOps;

    public RedisValueCache( final RedisTemplate<String, Object> redisTemplate){

        valueOps = redisTemplate.opsForValue();
    }
    public void cache( final String key, final Object data ){
        //valueOps.set(key,data);
        valueOps.set(key, data, 4000, TimeUnit.MILLISECONDS);
    }
    public Object getCacheValue(final String key){
        return valueOps.get(key);
    }
    public void deleteCacheValue(final String key){
        valueOps.getOperations().delete(key);
    }

}
