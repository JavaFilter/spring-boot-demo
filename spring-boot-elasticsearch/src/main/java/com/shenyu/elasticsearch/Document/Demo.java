package com.shenyu.elasticsearch.Document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.Date;

/**
 * @ClassName Demo
 * @Author shenyu
 * @Date 2020/5/27
 * @Version 1.0.0
 */
@Data
@Document(indexName = "demodoc",type = "demo")
public class Demo {

    @Id
    private long id;

    @Field
    private String name;

    private Date create_time;

}
