package com.techprimers.springbatchexample1.batch;

import com.techprimers.springbatchexample1.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static final Map<String, String> DEPT_NAMES =
            new HashMap<>();

//    public Processor() {
//        DEPT_NAMES.put("001", "Technology");
//        DEPT_NAMES.put("002", "Business");"003", "Marketing");
//    }

    @Override
    public User process(User user) throws Exception {

        System.out.println(String.format("Hello world"));
        return user;
    }
}
