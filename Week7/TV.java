package Week7;

public class TV {
	  private int channel = 1; // Default channel is 1
	  private int volumeLevel = 1; // Default volume level is 1
	  boolean on = false; // By default TV is off
	  
	  public TV() {
	  }
	  
	  public void turnOn() {
	    on = true;
	  }
	  
	  public void turnOff() {
	    on = false;
	  }
	  
	  public void setChannel(int newChannel)throws IllegalArgumentException {
	    if (on && newChannel >= 1 && newChannel <= 120)
	      channel = newChannel;
	    else
	    	throw new IllegalArgumentException(
	    	        "new channel should be between 1 and 120");
	  }
	  
	  public void setVolume(int newVolumeLevel) throws IllegalArgumentException{
	    if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
	      volumeLevel = newVolumeLevel;
	    else
	    	throw new IllegalArgumentException(
	    	        "new volume should be between 1 and 7");
	    	
	  }
	  
	  public void channelUp() {
	    if (on && channel < 120)
	      channel++;
	  }
	  
	  public void channelDown() {
	    if (on && channel > 1)
	      channel--;
	  }
	  
	  public void volumeUp() {
	    if (on && volumeLevel < 7)
	      volumeLevel++;
	  }
	  
	  public void volumeDown() {
	    if (on && volumeLevel > 1)
	      volumeLevel--;
	  }
	  public int getChannel() {
		  return channel;
	  }
	  
	  public int getvolumeLevel() {
		  return volumeLevel;
	  }
	  


	}