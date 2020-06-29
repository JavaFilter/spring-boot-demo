package com.shenyu.springbootsecurity.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * @ClassName GrantedAuthorityImpl
 * @Author shenyu
 * @Date 2020/6/29
 * @Version 1.0.0
 */
public class GrantedAuthorityImpl implements GrantedAuthority {

    private static final long serialVersionUID = 1L;

    private String authority;

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}