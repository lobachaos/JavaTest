package job;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
	// A é a referencia
	// Crescente
	// C, C#, D, D#, E, F, F#, G, G#, A, A#, B --> 03 é C
	// Decrescente
	// C, Db, D, Eb, E, F, Gb, G, Ab, A, Bb, B --> = -1 é Ab -2 é G


	public static List<String> geraFrequenciaNota(Integer semitons) {

		List<String> crescente = Arrays.asList("A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#");
		
		List<String> decrescente = Arrays.asList("A","Ab","G","Gb","F","E","Eb","D","Db","C","B","Bb");
		int tom = Math.abs(semitons); // Math.abs(index) para nao dar erro nos negativos.
		
		List<String> freqCrescente = Arrays.asList("440","466.16376","493.8833","523.2511","554.3652","587.3295","622.2539",
				"659.25511","698.4564","739.9888","783.9908","830.6093","880");
		
		List<String> freqDecrescente = Arrays.asList("440","415.3046","391.9954","369.9944","349.2282","329.6275"
				,"311.1269","293.6647","277.1826","261.6255","246.9416","233.0818");
		
		List<String> nova = Arrays.asList("","");
		if(semitons > 0 ) {
			if(semitons == 0|| semitons % 12 == 0) {
				nova.set(0, freqCrescente.get(0));
				nova.set(1, crescente.get(0));
			}
			else if (semitons == 1 ||  semitons % 12 == 0 +1) {
				nova.set(0, freqCrescente.get(1));
				nova.set(1, crescente.get(1));
			}else if (semitons == 2 || semitons % 12 == 0 +2) {
				nova.set(0, freqCrescente.get(2));
				nova.set(1, crescente.get(2));
			}else if (semitons == 3 || semitons %12 == 0 +3) {
				nova.set(0, freqCrescente.get(3));
				nova.set(1, crescente.get(3));
			}else if (semitons == 4 || semitons %12 == 0 +4) {
				nova.set(0, freqCrescente.get(4));
				nova.set(1, crescente.get(4));
			}else if (semitons == 5 || semitons %12 == 0 +5) {
				nova.set(0, freqCrescente.get(5));
				nova.set(1, crescente.get(5));
			}else if (semitons == 6 || semitons %12 == 0 +6) {
				nova.set(0, freqCrescente.get(6));
				nova.set(1, crescente.get(6));
			}else if (semitons == 7 || semitons %12 == 0 +7) {
				nova.set(0, freqCrescente.get(7));
				nova.set(1, crescente.get(7));
			}else if (semitons == 8 || semitons %12 == 0 +8) {
				nova.set(0, freqCrescente.get(8));
				nova.set(1, crescente.get(8));
			}else if (semitons == 9 || semitons %12 == 0 +9) {
				nova.set(0, freqCrescente.get(9));
				nova.set(1, crescente.get(9));
			}else if (semitons == 10 || semitons %12 == 0 +10) {
				nova.set(0, freqCrescente.get(10));
				nova.set(1, crescente.get(10));
			}else if (semitons == 11 || semitons %12 == 0 +11) {
				nova.set(0, freqCrescente.get(11));
				nova.set(1, crescente.get(11));
			}
			
		}
		else if(semitons < 0) {
			
			if(tom == 0|| tom % 12 == 0) {
				nova.set(0, freqDecrescente.get(0));
				nova.set(1, decrescente.get(0));
			}
			else if (tom == 1 ||  tom % 12 == 0 +1) {
				nova.set(0, freqDecrescente.get(1));
				nova.set(1, decrescente.get(1));
			}else if (tom == 2 || tom % 12 == 0 +2) {
				nova.set(0, freqDecrescente.get(2));
				nova.set(1, decrescente.get(2));
			}else if (tom == 3 || tom %12 == 0 +3) {
				nova.set(0, freqDecrescente.get(3));
				nova.set(1, decrescente.get(3));
			}else if (tom == 4 || tom %12 == 0 +4) {
				nova.set(0, freqDecrescente.get(4));
				nova.set(1, decrescente.get(4));
			}else if (tom == 5 || tom %12 == 0 +5) {
				nova.set(0, freqDecrescente.get(5));
				nova.set(1, decrescente.get(5));
			}else if (tom == 6 || tom %12 == 0 +6) {
				nova.set(0, freqDecrescente.get(6));
				nova.set(1, decrescente.get(6));
			}else if (tom == 7 || tom %12 == 0 +7) {
				nova.set(0, freqDecrescente.get(7));
				nova.set(1, decrescente.get(7));
			}else if (tom == 8 || tom %12 == 0 +8) {
				nova.set(0, freqDecrescente.get(8));
				nova.set(1, decrescente.get(8));
			}else if (tom == 9 || tom %12 == 0 +9) {
				nova.set(0, freqDecrescente.get(9));
				nova.set(1, decrescente.get(9));
			}else if (tom == 10 || tom %12 == 0 +10) {
				nova.set(0, freqDecrescente.get(10));
				nova.set(1, decrescente.get(10));
			}else if (tom == 11 || tom %12 == 0 +11) {
				nova.set(0, freqDecrescente.get(11));
				nova.set(1, decrescente.get(11));
			}
		}
		
		return nova;

	}

}
