package bdbk.springframework.beans.factory;

/**
 * Callback that allows a bean to be aware of the bean
 * @author huangjuguan
 * @since 2022-06-12
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);

}


