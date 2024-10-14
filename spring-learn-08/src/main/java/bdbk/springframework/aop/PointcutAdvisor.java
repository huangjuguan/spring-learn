package bdbk.springframework.aop;

/**
 * 切入点的通知器的接口
 * @author huangjuguan
 * @since 2022-06-26
 */
public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();

}
