package bdbk.springframework.beans.factory;

import bdbk.springframework.beans.exception.BeansException;

/**
 * bean工厂接口
 * @author little8
 * @since 2022-03-20
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
