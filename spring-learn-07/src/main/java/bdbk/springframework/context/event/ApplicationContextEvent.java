package bdbk.springframework.context.event;

import bdbk.springframework.context.ApplicationContext;
import bdbk.springframework.context.ApplicationEvent;

/**
 * 应用上下文的事件
 * @author huangjuguan
 * @since 2022-06-14
 */
public class ApplicationContextEvent extends ApplicationEvent {

    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }

}
