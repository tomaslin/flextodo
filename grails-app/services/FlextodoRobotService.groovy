
import org.grails.plugins.wave.*
import com.google.wave.api.*
import org.codehaus.groovy.grails.commons.ConfigurationHolder as CH

/**
 * {@link FlextodoRobotService}
 *
 * A Wave robot implementation
 */
class FlextodoRobotService implements GrailsWaveRobot {
	
    boolean transactional = false

	/**
	 * Set these properties for your custom robot. 
	 * Keep in mind to remove capabilities from the 
	 * list below which your robot has not implemented.
	 */
    static robotName = "Mr. TODO Rodriguez"
	static robotVersion = "0.1"
	static imageUrl = "http://${CH.config.google.appengine.application}.appspot.com/images/robot.jpg"
	static profileUrl = "http://${CH.config.google.appengine.application}.appspot.com"
	static robotCapabilities = [EventType.WAVELET_PARTICIPANTS_CHANGED,
								EventType.WAVELET_SELF_ADDED,
								EventType.WAVELET_SELF_REMOVED]
	
    public void processEvents(RobotMessageBundle eventsBundle) {
		
		
		
    }
}
