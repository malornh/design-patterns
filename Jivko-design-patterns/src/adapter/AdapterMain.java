package adapter;

public class AdapterMain {

	public static void main(String[] args) {

		MediaPackage player = new Mp3();
		player.playFile("test_song.mp3");
		
		MediaPlayer mediaPlayer = new FormatAdapter(player);
		mediaPlayer.play("file.avi");

	}

}
