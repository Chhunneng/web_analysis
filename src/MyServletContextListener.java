import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener, ServletContextAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("new context Initialized??????????????????");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("new context Destroyed??????????????????");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Context attribute Added "+servletContextAttributeEvent.getName());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Context attribute Removed "+servletContextAttributeEvent.getName());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("Context attribute Replaced "+servletContextAttributeEvent.getName());
    }
}
