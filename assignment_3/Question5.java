package assignments.assignment_3;

public class Question5 {

	public static void main(String[] args) {
		
		int inputSeconds, hours, minutes, seconds;

		inputSeconds = 3695;
		hours = (inputSeconds/60)/60;
		minutes = (inputSeconds/60)%60;
		seconds = inputSeconds%60;

		System.out.println("inputSecond is " + inputSeconds);
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds +" seconds");

	}

}
