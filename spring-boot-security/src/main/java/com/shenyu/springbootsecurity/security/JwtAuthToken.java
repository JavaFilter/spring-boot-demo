package com.shenyu.springbootsecurity.security;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

/**
 * @ClassName 自定义令牌对象
 * @Author shenyu
 * @Date 2020/6/29
 * @Version 1.0.0
 */
public class JwtAuthToken extends UsernamePasswordAuthenticationToken {

    private static final long serialVersionUID = 1L;

    private String token;

    public JwtAuthToken(Object principal, Object credentials){
        super(principal, credentials);
    }

    public JwtAuthToken(Object principal, Object credentials, String token){
        super(principal, credentials);
        this.token = token;
    }

    public JwtAuthToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities, String token) {
        super(principal, credentials, authorities);
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
