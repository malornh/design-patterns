package adapter;

public class Vlc implements MediaPlayer {

	@Override
	public void play(String fileName) {
		System.out.println("Playing VLC file: " + fileName);
	}

}
