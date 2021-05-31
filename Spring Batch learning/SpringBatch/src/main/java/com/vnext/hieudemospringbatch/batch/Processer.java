package com.vnext.hieudemospringbatch.batch;

import com.vnext.hieudemospringbatch.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processer implements ItemProcessor<User, User> {
    private static final Logger log = LoggerFactory.getLogger(Processer.class);
    @Override
    public User process(User user) throws Exception {

        user.setStatus(0);

        log.info("Setting batch");
        return user;
    }
}
