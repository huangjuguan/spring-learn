package bdbk.springframework.beans.factory.support;

import java.util.HashMap;
import java.util.Map;


/**
 * 默认单例实现
 * @author huangjuguan
 * @since 2022-03-25
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
