package com.shenyu.springbootjpadata.dao;

import com.shenyu.springbootjpadata.model.UserDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName UserDemoDao
 * @Author shenyu
 * @Date 2020/6/17
 * @Version 1.0.0
 */
public interface UserDemoDao extends CrudRepository<UserDemo,Long> {

}
