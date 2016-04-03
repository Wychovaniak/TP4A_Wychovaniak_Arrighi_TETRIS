package pat.game.Tetris;
//Fonction qui gere le nouvel affichage
public class RepaintRunner implements Runnable{

	private TetrisCanvas tC;

	public RepaintRunner(TetrisCanvas tC){
		
		this.tC = tC;
		
	}
	
	public void run() {
		synchronized (tC) {
			
			while(true){
				try {
					tC.repaint();
					tC.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					return;
				}
			}
		}
	}

}
