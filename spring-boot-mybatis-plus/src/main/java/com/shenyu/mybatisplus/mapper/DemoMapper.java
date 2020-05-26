package com.shenyu.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shenyu.mybatisplus.model.Demo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName DemoMapper
 * @Author shenyu
 * @Date 2020/5/26
 * @Version 1.0.0
 */
@Mapper
public interface DemoMapper extends BaseMapper<Demo> {

}
