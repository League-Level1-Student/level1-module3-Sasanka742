package _05_netflix;

public class netflixRunner {
	public static void main(String[] args) {
		//movies
		Movie JW = new Movie("John Wick", 7);
		Movie Logan = new Movie("Logan", 9);
		Movie TS = new Movie("Toy Story", 6);
		Movie AE = new Movie("Endgame", 8);
		Movie Pika = new Movie("Detective Pikachu", 7);
		//netflix queue
		NetflixQueue queue = new NetflixQueue();
		
		//adding movies to the queue
		queue.addMovie(Pika);
		queue.addMovie(AE);
		queue.addMovie(TS);
		queue.addMovie(Logan);
		queue.addMovie(JW);
		
		//prints the movies
		queue.printMovies();
		
		System.out.println("The best movie is "+ queue.getBestMovie());
		queue.removeMovie(0);
		System.out.println("The second best movie is "+ queue.getBestMovie());
		
	}
}
