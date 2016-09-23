package learn.ioc.bean.factory;

import learn.ioc.bean.User;

/**
 * Created by mikalai on 18.09.2016.
 */
public class UserFactory {

    private String factoryName;

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public User produceUser(){
        User u = new User();
        u.setName("from "+ factoryName);
        return u;
    }
}
