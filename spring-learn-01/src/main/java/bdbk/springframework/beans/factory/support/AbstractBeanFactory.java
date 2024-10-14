package bdbk.springframework.beans.factory.support;

import bdbk.springframework.beans.exception.BeansException;
import bdbk.springframework.beans.factory.BeanFactory;
import bdbk.springframework.beans.factory.config.BeanDefinition;


/**
 * bean工厂的抽象类，提供获取bean，并根据模板模式开放获取bean对象定义、创建bean的功能
 * @author little8
 * @since 2022-03-21
 */
public abstract class AbstractBeanFactory implements BeanFactory {

	@Override
	public Object getBean(String name) throws BeansException {
		BeanDefinition beanDefinition = getBeanDefinition(name);
		return createBean(name, beanDefinition);
	}

	protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

	protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
