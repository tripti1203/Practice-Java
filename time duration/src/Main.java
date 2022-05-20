public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = getDurationString(61,40);
		String y = getDurationString(3700L);
		System.out.println(x);
		System.out.println(y);
	}
	public static String getDurationString(long minutes , long seconds){
		if(minutes<0 || seconds>59 || seconds<0) {
			return "Invalid Input";
		}
		else {
			long hours = minutes/60;
			long remainingMinutes = minutes%60;
			return hours + "h " + remainingMinutes + "m " + seconds + "s";
		}
	}
	public static String getDurationString(long seconds) {
		if(seconds<0) {
			return "Invalid Input" ;
		}
		else {
			long minutes = seconds/60;
			long remainingSeconds = seconds%60;
			return getDurationString(minutes , remainingSeconds);
		}
	}
}
