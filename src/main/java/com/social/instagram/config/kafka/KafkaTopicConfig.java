package com.social.instagram.config.kafka;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Value("${kafka.bootstrap.address}")
    private String address;

    private static final String NICE_TOPIC = "nice";

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> kafkaAdminConfig = new HashMap<>();

        kafkaAdminConfig.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, address);

        return new KafkaAdmin(kafkaAdminConfig);
    }

    @Bean
    public NewTopic niceTopic() {
        return TopicBuilder.name(NICE_TOPIC)
                .build();
    }

}