import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener, HttpSessionAttributeListener {
    int count;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        count++;
        System.out.println("Session Created>>>>>>>>>>>>");
        System.out.println("The Active user: "+count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        count--;
        System.out.println("Session Destroy>>>>>>>>>>>>");
        System.out.println("The Active user: "+count);
    }


    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("Session attribute Added "+httpSessionBindingEvent.getName());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("Session attribute Removed "+httpSessionBindingEvent.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("Session attribute Replaced "+httpSessionBindingEvent.getName());
    }
}
