package listeners;

import java.util.Date;

import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
public class MyListener implements HttpSessionListener, HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public MyListener() {
        // TODO Auto-generated constructor stub
    }
    
    public void sessionCreated(HttpSessionEvent arg0) {
    	System.out.println("Hello from listener session created at "+ new Date(arg0.getSession().getCreationTime()));
    	
    }
    public void sessionDestroyed(HttpSessionEvent arg0) {
    	System.out.println("Hello from listener session destroyed at "+ new Date(arg0.getSession().getCreationTime()));
    }
    
    public void attributeAdded(HttpSessionBindingEvent arg0) {
    	System.out.println("From listener key with "+ arg0.getName()+ " and value is "+arg0.getValue()+ " added succesfully");
    	
    }
    public void attributeRemoved(HttpSessionBindingEvent arg0) {
    	 
    	System.out.println("From listener key with "+ arg0.getName()+ " and value is "+arg0.getValue()+ " remove successfully");
    }
    public void attributeReplaced(HttpSessionBindingEvent arg0) {
    	
    	System.out.println("From listener key with "+ arg0.getName()+ " and value is "+arg0.getValue() +" modified successfully");
    }
    
    
    
    
	
}
