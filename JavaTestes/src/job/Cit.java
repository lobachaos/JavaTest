package job;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Cit {

	public static List<String> geraFrequenciaNota(Integer semitons) {
		List<String> crescente = Arrays.asList("A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#");

		List<String> decrescente = Arrays.asList("A", "Ab", "G", "Gb", "F", "E", "Eb", "D", "Db", "C", "B", "Bb");
		int tom = Math.abs(semitons); // Math.abs(index) para nao dar erro nos negativos.

		List<String> nova = Arrays.asList("", "");

		double a = 440;
		double b = 2;
		double c = (double) semitons / 12;
		double d = Math.pow(b, c);

		double formula = a * d;
		DecimalFormat df = new DecimalFormat("0.0000");
		DecimalFormat df2 = new DecimalFormat("0");
		df.setRoundingMode(RoundingMode.HALF_UP);

		if (semitons >= 0) {
			if (semitons % 12 == 0) {
				nova.set(0, df2.format(formula));
				nova.set(1, crescente.get(0));
			} else if (semitons == 1 || semitons % 12 == 0 + 1) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, crescente.get(1));
			} else if (semitons == 2 || semitons % 12 == 0 + 2) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, crescente.get(2));
			} else if (semitons == 3 || semitons % 12 == 0 + 3) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, crescente.get(3));
			} else if (semitons == 4 || semitons % 12 == 0 + 4) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, crescente.get(4));
			} else if (semitons == 5 || semitons % 12 == 0 + 5) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, crescente.get(5));
			} else if (semitons == 6 || semitons % 12 == 0 + 6) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, crescente.get(6));
			} else if (semitons == 7 || semitons % 12 == 0 + 7) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, crescente.get(7));
			} else if (semitons == 8 || semitons % 12 == 0 + 8) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, crescente.get(8));
			} else if (semitons == 9 || semitons % 12 == 0 + 9) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, crescente.get(9));
			} else if (semitons == 10 || semitons % 12 == 0 + 10) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, crescente.get(10));
			} else if (semitons == 11 || semitons % 12 == 0 + 11) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, crescente.get(11));
			}

		}

		else if (semitons < 0) {

			if (tom == 0 || tom % 12 == 0) {
				nova.set(0, df2.format(formula));
				nova.set(1, decrescente.get(0));
			} else if (tom == 1 || tom % 12 == 0 + 1) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, decrescente.get(1));
			} else if (tom == 2 || tom % 12 == 0 + 2) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, decrescente.get(2));
			} else if (tom == 3 || tom % 12 == 0 + 3) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, decrescente.get(3));
			} else if (tom == 4 || tom % 12 == 0 + 4) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, decrescente.get(4));
			} else if (tom == 5 || tom % 12 == 0 + 5) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, decrescente.get(5));
			} else if (tom == 6 || tom % 12 == 0 + 6) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, decrescente.get(6));
			} else if (tom == 7 || tom % 12 == 0 + 7) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, decrescente.get(7));
			} else if (tom == 8 || tom % 12 == 0 + 8) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, decrescente.get(8));
			} else if (tom == 9 || tom % 12 == 0 + 9) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, decrescente.get(9));
			} else if (tom == 10 || tom % 12 == 0 + 10) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, decrescente.get(10));
			} else if (tom == 11 || tom % 12 == 0 + 11) {
				nova.set(0, df.format(formula).replace(',', '.'));
				nova.set(1, decrescente.get(11));
			}
		}

		return nova;

	}

}
