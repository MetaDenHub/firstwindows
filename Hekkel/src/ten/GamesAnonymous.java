package ten;

//Chekers with Factory Pattern + anonymous classes

interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;

	@Override
	public boolean move() {
		System.out.println("Checkers move " + moves);
		return ++moves != MOVES;
	}

	GameFactory factory = new GameFactory() {
		@Override
		public Game getGame() {
			return new Checkers();
		}
	};
}

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;

	@Override
	public boolean move() {
		System.out.println("Chess move " + moves);
		return ++moves != MOVES;
	}

	public GameFactory factory = new GameFactory() {
		@Override
		public Game getGame() {
			return new Chess();
		}
	};
}

public class GamesAnonymous {
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while (s.move())
			;
	}

	public static void main(String[] args) {
		playGame(new Checkers().factory);
		playGame(new Chess().factory);
	}
}
