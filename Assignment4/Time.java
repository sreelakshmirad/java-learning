package Assignment4;

class Time implements Cloneable, Comparable<Time> {
	
	//private time to store time elapsed since January 1, 1970	
	private long time;

	//no-arg constructor	
	public Time() {
		time = System.currentTimeMillis() / 1000;
	}

	//constructor that accepts hour, minute and seconds	
	public Time(int hour, int minute, int second) {
		time = (hour * 3600) + (minute * 60) + second;
	}

	//constructor that accepts elapsed time	
	public Time(long elapsedTime) {
		this.time = elapsedTime;
	}

	//method to return hour	
	public int getHour() {
		return (int) (time / 3600 % 24);
	}

	//method to return minute	
	public int getMinute() {
		return (int) (time / 60 % 60);
	}

	//method to return second	
	public int getSecond() {
		return (int) (time % 60);
	}

	//method to return elapsed seconds	
	public long getSeconds() {
		return time;

	}

	//method to return a formatted time	
	public String toString() {
		return getHour() + (getHour() > 1 ? " hours " : " hour ") + getMinute()
				+ (getMinute() > 1 ? " minutes " : " minute ") + getSecond()
				+ (getSecond() > 1 ? " seconds " : " second ");
	}
	
	//method to return the difference of elapsed time of this object and another object	
	public int compareTo(Time t) {
		return (int)(this.time - t.time);
	}
	
	//method to clone object	
	public Object clone() {
		
		Time t2 = new Time();
		t2.time = time;
		return t2;
			
	}

}
