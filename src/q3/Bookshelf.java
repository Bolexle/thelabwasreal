package q3;

public class Bookshelf {
	
	public static void main(String[] args) {
		Book huckle =  new Book("Adventurs of Huckleberry Finn", "Mark Twain", "Chatto and Windus", 1884);
		Book leagues = new Book("Twenty Thousand Leagues Under the Sea", "Jules Verne", "Pierre-Jules Hetzel", 1870);
		Book nineteen = new Book();
		
		System.out.println(huckle);
		System.out.println(leagues);
		System.out.println(nineteen);
	}

}
