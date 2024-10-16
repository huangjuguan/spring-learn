package bdbk.springframework.beans.factory.support;

/**
 * 单例注册接口
 * @author huangjuguan
 * @since 2022-03-25
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
