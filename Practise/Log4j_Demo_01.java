package Alpha;

import org.apache.logging.log4j.*;

public class Log4j_Demo_01 {

	//log is an object created in order to perfom getlogger function present in the Logmanager class that 
	//accepts current class path(LOG4J_Demo_01.class.getName())
	
	
	private static Logger log = LogManager.getLogger(Log4j_Demo_01.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("Debug Message is Displayed");
		
		log.info("Info Message is Displayed");
		
		// Default configuration prints only Error and Fatal Logs(if Config file is not Present)
		
		log.error("Error Message is displayed");
		
		log.fatal("Fatal Message is displayed");
	
/*============================  OUTPUT  ========================================== 
 
ERROR StatusLogger No log4j2 configuration file found. Using default configuration: 
logging only errors to the console. Set system property 'org.apache.logging.log4j.simplelog.StatusLogger.level' 
to TRACE to show Log4j2 internal initialization logging.

21:36:38.263 [main] ERROR Alpha.Log4j_Demo_01 - Error Message is displayed
21:36:38.267 [main] FATAL Alpha.Log4j_Demo_01 - Fatal Message is displayed 

 */

	}

}
