package com.atclq.wechat.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "wechat")//读取配置文件中的wechat开头的配置
public class WechatAccountConfig {

    private String mpAppId;

    private String mpAppSecret;
}
