import javax.sound.midi.*;

public class MiniMiniMusicCmdLine { 
	public static void main(String [] args) {
		MiniMiniMusicCmdLine mini = new MiniMiniMusicCmdLine();

		if(args.length < 2) {
			System.out.println("Don,t forget the instrument and note args");
		}else{
			int instrument = Integer.parseInt(args[0]);
			int note = Integer.parseInt(args[1]);
			mini.play(instrument,note);
		}
	}

	public void play(int instrument,int note) {

System.out.println("instrument = " + instrument + ", note = " + note);

		try { 
			Sequencer player = MidiSystem.getSequencer();
			player.open();

			Sequence seq = new Sequence(Sequence.PPQ,4);

			Track track = seq.createTrack();

			ShortMessage first = new ShortMessage();
			first.setMessage(192,1,instrument, 0);
			MidiEvent changeInstrument = new MidiEvent(first,1);
			track.add(changeInstrument);

			ShortMessage second = new ShortMessage();
			second.setMessage(192,2,instrument, 0);
			MidiEvent changeInstrument1 = new MidiEvent(second,1);
			track.add(changeInstrument1);

			ShortMessage a = new ShortMessage();
			a.setMessage(144,2,note,100);
			MidiEvent noteOn = new MidiEvent(a,1);
			track.add(noteOn);

			ShortMessage b = new ShortMessage();
			b.setMessage(128,2,note,100);
			MidiEvent noteOff = new MidiEvent(b,16);
			track.add(noteOff);
			ShortMessage a = new ShortMessage();
			a.setMessage(144,1,note,100);
			MidiEvent noteOn = new MidiEvent(a,1);
			track.add(noteOn);

			ShortMessage b = new ShortMessage();
			b.setMessage(128,1,note,100);
			MidiEvent noteOff = new MidiEvent(b,16);
			track.add(noteOff);

			player.setSequence(seq);

			player.start();

			Thread.sleep(1000*2);
			player.close();

		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}