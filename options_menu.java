import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;



/**
 * @author Owner
 * @version 1.0
 * @created 27-February-2015 10:17:35 PM
 */
public class options_menu {

	public Button Difficulty;
	public Button main_menu;
	public Button musicVolume;
	public Pane options_menuPane;
	public ComboBox<?> player1Attack; // '?' is 'type' argument
	public ComboBox<?> player1Movement;
	public ComboBox<?> player2Attack;
	public ComboBox<?> player2Movement;
	public Button soundFXvolume;

	public options_menu(){

	}

	public void finalize() throws Throwable {

	}

	public int player1Control(){
		return 0;
	}

	public int toggleDifficulty(){
		return 0;
	}

	public int toggleMusic(){
		return 0;
	}

	public int toggleSoundFX(){
		return 0;
	}

}