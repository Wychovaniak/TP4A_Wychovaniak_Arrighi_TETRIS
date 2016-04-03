package pat.game.Tetris;

//Lance le tetris
public class App {
	public static void main(String[] args) {
		TetrisGame game = new TetrisGame();
		new TetrisGUI(game);
	}
}
