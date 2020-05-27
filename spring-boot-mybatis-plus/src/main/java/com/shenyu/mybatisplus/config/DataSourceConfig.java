package com.shenyu.mybatisplus.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @ClassName DataSourceConfig
 * @Author shenyu
 * @Date 2020/5/26
 * @Version 1.0.0
 */
@Configuration
public class DataSourceConfig {

    @Autowired
    private Environment env;

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
