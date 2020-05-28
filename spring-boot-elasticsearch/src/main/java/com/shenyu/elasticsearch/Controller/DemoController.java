package com.shenyu.elasticsearch.Controller;

import com.alibaba.fastjson.JSON;
import com.shenyu.elasticsearch.Document.Demo;
import com.shenyu.elasticsearch.Repository.DemoRepository;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @ClassName DemoController
 * @Author shenyu
 * @Date 2020/5/27
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/es")
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;

    @GetMapping("/save")
    public String createDemo(){
        Demo demo = new Demo();
        demo.setId(1L);
        demo.setName("shenyu");
        demo.setCreate_time(new Date());
        demoRepository.save(demo);

        Demo demo1 = new Demo();
        demo1.setId(2L);
        demo1.setName("shenyu1");
        demo1.setCreate_time(new Date());
        demoRepository.save(demo1);

        Demo demo2 = new Demo();
        demo2.setId(3L);
        demo2.setName("shenyu2");
        demo2.setCreate_time(new Date());
        demoRepository.save(demo2);
        return "success";
    }

    @GetMapping("/get")
    public String getDemo(){
        MatchQueryBuilder builder = QueryBuilders.matchQuery("name", "shenyu");

        Page<Demo> demos =  demoRepository.search(builder, PageRequest.of(0,10));
        return JSON.toJSONString(demos.getContent());
    }

}
