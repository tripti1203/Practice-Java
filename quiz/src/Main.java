import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[] question= new String[]{
	        "Octopus has 8 legs?",
            "The moon is away from the earth than the sun is?",
            "Octopus has three hearts?",
            "Microwave have longer wavelength than ultraviolet ray?",
            "Unicorn exists on earth?"
    };
	boolean[] answer= new boolean[]{
	        true,
            false,
            true,
            true,
            false
    };
	boolean[] userAnswer= new boolean[5];
	int finalScore=0,i=0;
	Scanner scanner= new Scanner(System.in);
	for(i=0;i<5;i++){
	    System.out.println("Question"+ (i+1)+ ":"+ question[i]+ "True or False");
	    System.out.print("Answer :");
	    userAnswer[i]= scanner.nextBoolean();
	    if(userAnswer[i]==answer[i]){
	        finalScore++;
	        System.out.println("CORRECT...");
        }
	    else{
	        System.out.println("WRONG ANSWER.....");
        }
    }
	System.out.println("FINAL SCORE :"+ finalScore);
    }
}
