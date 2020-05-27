package com.shenyu.elasticsearch.Repository;

import com.shenyu.elasticsearch.Document.Demo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName DemoRepository
 * @Author shenyu
 * @Date 2020/5/27
 * @Version 1.0.0
 */
@Component
public interface DemoRepository extends ElasticsearchRepository<Demo, Long> {

    List<Demo> findByName(String name);

}
