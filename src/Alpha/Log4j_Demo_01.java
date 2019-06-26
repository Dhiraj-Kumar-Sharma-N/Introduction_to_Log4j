package Alpha;

import org.apache.logging.log4j.*;

public class Log4j_Demo_01 {

	//log is an object created in order to perfom getlogger function present in the Logmanager class that 
	//accepts current class path(LOG4J_Demo_01.class.getName())
	
	
	private static Logger log = LogManager.getLogger(Log4j_Demo_01.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("Debug Message was Displayed");
		
		log.info("Info Message was Displayed");
		
		// Default configuration prints only Error and Fatal Logs(if Config file is not Present)
		
		log.error("Error Message is displayed");
		
		log.fatal("Fatal Message is displayed");
	
/*============================  OUTPUT  ========================================== 
 
23:12:54.571 [main] DEBUG Alpha.Log4j_Demo_01 - Debug Message is Displayed
23:12:54.576 [main] INFO  Alpha.Log4j_Demo_01 - Info Message is Displayed
23:12:54.576 [main] ERROR Alpha.Log4j_Demo_01 - Error Message is displayed
23:12:54.577 [main] FATAL Alpha.Log4j_Demo_01 - Fatal Message is displayed

*/
	}

}
