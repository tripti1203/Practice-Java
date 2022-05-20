
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1 ; i<=3;i++) {
		Movie movie = randomMovie();
		System.out.println("Movie # " + i +":" + movie.getName() +"\n" + movie.Plot() + "\n" );
		}
	}
	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random()*3)+1;
		switch(randomNumber) {
		case 1:
			return new After();
		case 2:
			return new HarryPotter();
		case 3: 
			return new Lucifer();
		default: 
			return null;
		}
		
	}
}
