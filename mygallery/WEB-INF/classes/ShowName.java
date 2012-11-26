import javax.servlet.*;
import javax.servlet.http.*;


public class ShowName implements HttpSessionAttributeListener{


static Object name=new Object();

	public void attributeAdded(HttpSessionBindingEvent event){

		name=event.getValue();
		
	}
	
	public void attributeRemoved(HttpSessionBindingEvent event){

		
	}
	
	public void attributeReplaced(HttpSessionBindingEvent event){
	
		
	}
	public static Object getNewAttributes(){
	
	return name;
	
	}

}
