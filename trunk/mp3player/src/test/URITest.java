package test;

import java.net.URI;

import com.fherdelpino.mp3player.Player;

public class URITest {
	
	private static final String EXAMPLE_TEXT = "c:\\Users\\delpinof\\Music\\test\\A Perfect Circle - eMOTIVe\\A Perfect Circle - When The Levee Breaks.mp3";
	
	public static void main(String args[]) {
		URI uri = null;
    	String path = EXAMPLE_TEXT;
    	path = "file:///".concat(path);
    	path = path.replace("\\", "/");
    	path = path.replace(" ", "%20");
    	System.out.println(path);
		uri = URI.create(path);
		System.out.println(uri.getPath());
		Player p = Player.getInstance();
    	p.changeSongAndPlay(path);
	}

}
