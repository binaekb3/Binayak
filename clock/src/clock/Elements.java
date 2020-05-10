package clock;

public class Elements {
	private int hour;
	private int min;
	private int second;
	
	public void setTime(int h,int m,int s) {
		hour=(h>=0&&h<24)?h:0;
		min=(m>=0&&m<60)?m:0;
		second=(s>=0&&s<60)?s:0;
		
		
		}
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour,min,second);
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d",(hour==0||hour==12)?12:hour%12,min,second);
	}
	}
	


