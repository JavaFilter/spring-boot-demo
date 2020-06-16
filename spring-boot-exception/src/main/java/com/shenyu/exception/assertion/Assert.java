package com.shenyu.exception.assertion;

import com.shenyu.exception.BusinessException;

import java.util.Collection;
import java.util.Map;

/**
 * @ClassName Assert
 * @Author shenyu
 * @Date 2020/6/16
 * @Version 1.0.0
 */
public interface Assert {

    /**
     * 创建异常
     * @param args
     * @return
     */
    BusinessException newException(Object... args);

    /**
     * 创建异常
     * @param t
     * @param args
     * @return
     */
    BusinessException newException(Throwable t, Object... args);

    /**
     * <p>断言对象 not null。如果对象为null，则抛出异常
     *
     * @param obj 待判断对象
     */
    default void assertIsNull(Object obj) {
        if (obj == null) {
            throw newException();
        }
    }

    /**
     * <p>断言对象为空。如果对象不为空，则抛出异常
     *
     * @param obj 待判断对象
     */
    default void assertNotNull(Object obj) {
        if (obj != null) {
            throw newException();
        }
    }

    /**
     * <p>断言字符串<code>str</code>不为空串（长度为0）。如果字符串<code>str</code>为空串，则抛出异常
     *
     * @param str 待判断字符串
     */
    default void assertIsEmpty(String str) {
        if (null == str || "".equals(str.trim())) {
            throw newException();
        }
    }

    /**
     * <p>断言整数<code>str</code>不为空不为0。如果数值<code>str</code>为空为=0，则抛出异常
     *
     * @param integer 待判断整数
     */
    default void assertIsEmpty(Integer integer) {
        if (null == integer || integer.intValue() == 0) {
            throw newException();
        }
    }


    /**
     * <p>断言小数<code>str</code>不为空为0。如果数值<code>str</code>为空为0，则抛出异常
     *
     * @param args 待判断小数
     */
    default void assertIsEmpty(Double args) {
        if (null == args || args == 0d) {
            throw newException();
        }
    }


    /**
     * <p>断言数组<code>arrays</code>大小不为0。如果数组<code>arrays</code>大小不为0，则抛出异常
     *
     * @param arrays 待判断数组
     */
    default void assertNotEmpty(Object[] arrays) {
        if (arrays == null || arrays.length == 0) {
            throw newException();
        }
    }

    /**
     * <p>断言集合<code>c</code>大小为0。如果集合<code>c</code>大小为0，则抛出异常
     *
     * @param c 待判断数组
     */
    default void assertIsEmpty(Collection<?> c) {
        if (c ==  null || c.isEmpty()) {
            throw newException();
        }
    }

    /**
     * <p>断言Map<code>map</code>大小不为0。如果Map<code>map</code>大小不为0，则抛出异常
     *
     * @param map 待判断Map
     */
    default void assertNotEmpty(Map<?, ?> map) {
        if (map ==  null || map.isEmpty()) {
            throw newException();
        }
    }

    /**
     * <p>断言布尔值<code>expression</code>为false。如果布尔值<code>expression</code>为true，则抛出异常
     *
     * @param expression 待判断布尔变量
     */
    default void assertIsTrue(boolean expression) {
        if (expression) {
            throw newException();
        }
    }


    /**
     * <p>断言布尔值<code>expression</code>为true。如果布尔值<code>expression</code>为false，则抛出异常
     *
     * @param expression 待判断布尔变量
     */
    default void assertIsFalse(boolean expression) {
        if (!expression) {
            throw newException();
        }
    }

    /**
     * <p>直接抛出异常
     *
     */
    default void assertFail() {
        throw newException();
    }

    /**
     * <p>直接抛出异常，并包含原异常信息
     * <p>当捕获非运行时异常（非继承{@link RuntimeException}）时，并该异常进行业务描述时，
     * 必须传递原始异常，作为新异常的cause
     *
     * @param t 原始异常
     */
    default void assertFail(Throwable t) {
        throw newException(t);
    }

    /**
     * <p>断言对象<code>o1</code>与对象<code>o2</code>相等，此处的相等指（o1.equals(o2)为true）。
     * 如果两对象不相等，则抛出异常
     *
     * @param o1 待判断对象，若<code>o1</code>为null，也当作不相等处理
     * @param o2  待判断对象
     */
    default void assertEquals(Object o1, Object o2) {
        if (o1 == o2) {
            return;
        }
        if (o1 == null) {
            throw newException();
        }
        if (!o1.equals(o2)) {
            throw newException();
        }
    }

}
