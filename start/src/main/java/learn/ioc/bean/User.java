package learn.ioc.bean;

/**
 * Created by mikalai on 18.09.2016.
 */
public class User {

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
