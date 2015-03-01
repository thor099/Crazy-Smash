import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;



/**
 * @author Owner
 * @version 1.0
 * @created 27-Feb-2015 10:17:35 PM
 */
public class GUI {

	public Media audioFile;
	public MediaPlayer player1;
	public Scene Window;
	public main_menu m_main_menu;
	public options_menu m_options_menu;
	public in_game m_in_game;
	public high_scoreList m_high_scoreList;
	public credits m_credits;

	public GUI(){

	}

	public void finalize() throws Throwable {

	}

	public void fullScreen(){

	}

	public Pane getMain_menuPane(){
		return null;
	}

	public void play(){
		player1.play();

	}

}