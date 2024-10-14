package bdbk.springframework.test.bean;

import bdbk.springframework.beans.factory.annotation.Autowired;
import bdbk.springframework.context.annotation.Scope;
import bdbk.springframework.stereotype.Component;

/**
 *
 * @author huangjuguan
 * @since 2022-03-20
 */
@Component
public class UserService {

    public String name = "UserService";
    @Autowired
    public UserService2 userService;

    public UserService2 getService() {
        return userService;
    }
}
