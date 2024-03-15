package com.example.demo.domain.conf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("myconf")
@RefreshScope
@Getter
@Setter
public class ApplicationConfiguration {

    private String group;
}
