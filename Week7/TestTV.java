package Week7;

public class TestTV {  
	  public static void main(String[] args) {
	    
		try { 
		TV tv1 = new TV(); // Create a TV
	    tv1.turnOn(); // Turn on tv1
	    tv1.setChannel(30);
	    tv1.setVolume(3);
	    
	    System.out.println("tv1's channel is " + tv1.getChannel() 
	      + " and volume level is " + tv1.getvolumeLevel());
	    
	    TV tv2 = new TV();
	    tv2.turnOn();
	    tv1.setChannel(150);
	    tv2.channelUp();
	    tv2.channelUp();

	    System.out.println("tv2's channel is " + tv2.getChannel() 
	      + " and volume level is " + tv2.getvolumeLevel());

		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			
		}
	  }
	}