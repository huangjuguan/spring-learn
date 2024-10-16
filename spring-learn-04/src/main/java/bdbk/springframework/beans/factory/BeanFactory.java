package bdbk.springframework.beans.factory;

import bdbk.springframework.beans.exception.BeansException;

/**
 * bean工厂接口
 * @author huangjuguan
 * @since 2022-03-20
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
