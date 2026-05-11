package com.hmall.cart.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "hm.cart") //用于绑定 配置文件 中前缀为 hm.cart 的配置项
public class CartProperties {
    private Integer maxAmount;
}
