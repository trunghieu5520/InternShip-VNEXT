package com.example.redisdemo.service;

import com.example.redisdemo.dto.PersonDTO;
import com.example.redisdemo.dto.RangeDTO;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RedisListCache {
    private RedisTemplate<String, Object> redisTemplate;
    private ListOperations<String, Object> listOps;

    public RedisListCache(RedisTemplate<String, Object> redisTemplate) {
        listOps = redisTemplate.opsForList();

    }
    public void cachePersons(final String key, final List<PersonDTO> persons){
        for (final PersonDTO person : persons){
            listOps.leftPush(key, person);
        }
    }
    public List<PersonDTO> getPerSonInRange(final String key, final RangeDTO range){
        final List<Object> objects = listOps.range(key, range.getFrom(), range.getTo());
        if (CollectionUtils.isEmpty(objects)){
            return Collections.emptyList();
        }
        return objects.stream()
                .map(x -> (PersonDTO) x)
                .collect(Collectors.toList());
    }
    public PersonDTO getLastElement(final String key) {
        final Object o = listOps.rightPop(key);
        if (o == null) {
            return null;
        }

        return (PersonDTO) o;
    }

    public void trim(final String key, final RangeDTO range) {
        listOps.trim(key, range.getFrom(), range.getTo());
    }
//
//    @PostConstruct
//    public void setup(){
//        listOperations.leftPush("key","Hello World");
//        System.out.println(listOperations.rightPop("key"));
//    }
}
