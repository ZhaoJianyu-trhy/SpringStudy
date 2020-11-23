package com.zjy.config;

import com.zjy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//类似于<beans>    </beans>
@Configuration
@Import(MyConfig2.class)
public class MyConfig {

    //相当于<bean>标签，id为方法名,class为方法的返回属性
    @Bean
    public User user() {
        return new User();
    }
}
