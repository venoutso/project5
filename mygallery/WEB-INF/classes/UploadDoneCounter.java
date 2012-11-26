import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class UploadDoneCounter implements ServletContextAttributeListener {

  private static int sum_photos =-2;
  
  public void attributeAdded(ServletContextAttributeEvent scab) {

   sum_photos++;

  }

  
  public void attributeRemoved(ServletContextAttributeEvent scab) {
  	
  }

 
  public void attributeReplaced(ServletContextAttributeEvent scab) {
 
  }
  
  public static int getAccessions(){
	
	return sum_photos; 

	
	}

}
