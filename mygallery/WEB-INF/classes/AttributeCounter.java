import javax.servlet.*;
import javax.servlet.http.*;


public class AttributeCounter implements HttpSessionAttributeListener{

private static int modifications = 0;

	public void attributeAdded(HttpSessionBindingEvent event){
	
		modifications++;
		
		//System.out.println("Attribute added:"+name+" :" +value);
		System.out.println("Modifications done:"+modifications);
	
	
	}
	
	public void attributeRemoved(HttpSessionBindingEvent event){

		
	}
	
	public void attributeReplaced(HttpSessionBindingEvent event){
	
		
	}
	public static int getNewAttributes(){
	
	return modifications++;
	
	}

}