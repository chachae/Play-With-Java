package com.chachae.seckill.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author chachae
 * @since 2020/3/23 20:47
 */
@Data
@Component
@PropertySource(value = {"classpath:application.properties"})
@ConfigurationProperties(prefix = "seckill")
public class Props {

    private GoodsProperties goods = new GoodsProperties();

}
