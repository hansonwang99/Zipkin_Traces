package com.hansonwang99.zipkintool;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("zipkin")
public class ZipkinProperties {

    private String endpoint;
    private String service;
}