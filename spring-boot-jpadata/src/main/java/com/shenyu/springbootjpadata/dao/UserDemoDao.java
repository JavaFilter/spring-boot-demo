package com.shenyu.springbootjpadata.dao;

import com.shenyu.springbootjpadata.model.UserDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName UserDemoDao
 * @Author shenyu
 * @Date 2020/6/17
 * @Version 1.0.0
 */
public interface UserDemoDao extends CrudRepository<UserDemo,Long> {

    /**
     * 更新user
     * @param name
     * @param password
     * @param email
     * @param id
     */
    @Query("update UserDemo set name = ?1 , password = ?2, email = ?3 where id = ?4")
    void updateUserDemo(String name,String password,String email,Long id);

}
