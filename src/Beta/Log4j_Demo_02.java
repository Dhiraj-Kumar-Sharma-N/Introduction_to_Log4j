package Beta;

import org.apache.logging.log4j.*;

public class Log4j_Demo_02 {

	//log is an object created in order to perfom getlogger function present in the Logmanager class that 
	//accepts current class path(LOG4J_Demo_01.class.getName())
	
	
	private static Logger log = LogManager.getLogger(Log4j_Demo_02.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("Debug ");
		
		log.info("Info ");
		
		// Default configuration prints only Error and Fatal Logs(if Config file is not Present)
		
		log.error("Error");
		
		log.fatal("Fatal ");
	
/*============================  OUTPUT  ========================================== 

*/
	}

}
