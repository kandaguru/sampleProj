package Log4jPAckage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jTest {
	
	private static Logger log=LogManager.getLogger(Log4jTest.class.getName());
	
	
	@Test
	public  void mainlog () {
		
	 log.debug("This is Button click");
	 log.info("Window opened");
	 log.info("Elememnt Checked.......");
	 log.error("Not Available");
	 log.fatal("Element not attached in code");
	 
		
	}

}
