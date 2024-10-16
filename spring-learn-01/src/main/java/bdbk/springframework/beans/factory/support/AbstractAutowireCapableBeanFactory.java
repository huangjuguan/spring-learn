package bdbk.springframework.beans.factory.support;

import bdbk.springframework.beans.factory.config.BeanDefinition;
import bdbk.springframework.beans.exception.BeansException;

/**
 * 具备实例化bean能力的抽象工厂
 * @author huangjuguan
 * @since 2022-03-21
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

	@Override
	protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
		return doCreateBean(beanName, beanDefinition);
	}

	protected Object doCreateBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
		Class beanClass = beanDefinition.getBeanClass();
		Object bean = null;
		try {
			bean = beanClass.newInstance();
		} catch (Exception e) {
			throw new BeansException("实例化bean失败", e);
		}
		return bean;
	}
}
