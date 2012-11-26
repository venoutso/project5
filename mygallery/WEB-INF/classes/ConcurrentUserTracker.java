import javax.servlet.*;
import javax.servlet.http.*;

public class ConcurrentUserTracker implements HttpSessionListener {
  static int users = 0;

  public void sessionCreated(HttpSessionEvent e) {

    users++;

  }

  public void sessionDestroyed(HttpSessionEvent e) {

    if(users>0){

    	users--;
    }
  }

  public static int getConcurrentUsers() {

    return users;

  }
}
