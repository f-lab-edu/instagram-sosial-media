package com.social.instagram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
    @EnableAspectJAutoProxy
    AspectJ의 @Aspect를 handling 할 수 있도록 지원해줍니다. Spring AOP는 메서드 실행의 기능만 사용 할 수 있지만
    AspectJ는 메서드 호출, 메서드 실행, 생성자 호출등 다양한 기능을 제공해주고 있다. 또한 AspectJ는 컴파일 시점에서 Weaving을 하기 때문에
    런타임 시점에 과부하가 발생하지 않는다.
*/
@SpringBootApplication
@EnableAspectJAutoProxy
public class InstagramSocialApplication {

    public static void main(String[] args) {
        SpringApplication.run(InstagramSocialApplication.class, args);
    }

}