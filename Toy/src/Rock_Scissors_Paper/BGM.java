package Rock_Scissors_Paper;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class BGM {
	public void music() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;

		bgm = new File("SellBuyMusic.wav");

		Clip clip;

		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.loop(2);
			clip.start();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러입니다.");
			e.printStackTrace();
		}
	}
}
