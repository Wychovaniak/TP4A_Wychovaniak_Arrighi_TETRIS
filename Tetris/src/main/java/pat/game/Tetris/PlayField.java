package pat.game.Tetris;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//gere le champ du jeu
public class PlayField implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int GAME_HEIGHT = 22;
	private static final int GAME_WIDTH = 10;

	private List<List<FieldCell>> playField; //Utilisation d'une double liste (tableau pour le champ)
	private Block currentBlock;

	public PlayField() {
		clearField();
	}

	public List<List<FieldCell>> getPlayField() {
		return this.playField;
	}

	public void clearField() {

		this.playField = new ArrayList<List<FieldCell>>();

		for (int i = 0; i < GAME_WIDTH; i++) {
			this.playField.add(new LinkedList<FieldCell>());
		}

		for (List<FieldCell> column:this.playField) {
			for (int j = 0; j < GAME_HEIGHT; j++) {
				column.add(new FieldCell());
			}
		}

	}

	public Block getCurrentBlock() {
		return currentBlock;
	}
//Chech colone par colone et retourne l'etat du champ 
	public String toString() {

		StringBuffer result = new StringBuffer();

		for (int i=0; i<this.playField.get(0).size();i++) {
			for (List<FieldCell> column:this.playField) {
				FieldCell cell = column.get(i);
				if (cell.isFilled()) {
					result.append("■");
				} else {
					result.append("□");
				}
			}
			result.append("\n");
		}
		return result.toString();
	}

	public void setCurrentBlock(Block current) {
		// TODO Auto-generated method stub
		this.currentBlock = current;
	}

}
