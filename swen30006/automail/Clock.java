package automail;

public class Clock {
	
	/** Represents the current time **/
    private static int Time = 0;
    
    /** The threshold for the latest time for mail to arrive **/
    public static int LAST_DELIVERY_TIME = 300;
    
    public Clock(int lastDeliveryTime) {
    	
    }

    public static int Time() {
    	return Time;
    }
    
    public static void Tick() {
    	Time++;
    }
}