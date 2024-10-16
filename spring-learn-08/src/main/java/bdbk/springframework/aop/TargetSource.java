package bdbk.springframework.aop;

/**
 * 被代理的目标对象
 * @author huangjuguan
 * @since 2022-06-26
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    public Class<?>[] getTargetClass(){
        return this.target.getClass().getInterfaces();
    }

    public Object getTarget(){
        return this.target;
    }

}
