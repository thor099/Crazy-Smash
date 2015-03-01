import javafx.animation.Animation;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;



/**
 * @author Owner
 * @version 1.0
 * @created 27-February-2015 10:17:35 PM
 */
public class level {

	public Image background;
	public Animation building;
	public int currentLevel;
	public int currentScore;
	public Animation enemies;
	public Pane levelPane;
	public int timeRemaining;

	public level(){

	}

	public void finalize() throws Throwable {

	}

	public int dayNight(){
		return 0;
	}

	public boolean getCurrentScore(){
		return false;
	}

	public Pane getExit(){
		return null;
	}

	public void getStart(){

	}

}