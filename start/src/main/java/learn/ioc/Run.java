package learn.ioc;

import learn.ioc.bean.User;
import learn.ioc.bean.factory.ClientService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mikalai on 18.09.2016.
 */
public class Run {

    static Logger log = Logger.getLogger(Run.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});

        User u = context.getBean("firstUser", User.class);
        log.info(u);

        u = context.getBean("myname", User.class);
        log.info(u);

        u = context.getBean("newname", User.class);
        log.info(u);

        u = context.getBean("extraname", User.class);
        log.info(u);

        u = context.getBean("toFirstUser", User.class);
        log.info(u);

        ClientService cs =context.getBean("clientService", ClientService.class);
        log.info(cs);

        u = context.getBean("proucedUser", User.class);
        log.info(u);

    }
}
