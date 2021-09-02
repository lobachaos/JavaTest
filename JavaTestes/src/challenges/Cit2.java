package challenges;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class Cit2 {
	public static List<String> geraFrequenciaNota(Integer semitons) {
		List<String> list = Arrays.asList("","");
		
		double a = 440;
		double b = 2;
		double c = (double) semitons/12;
		double d = Math.pow(b, c);
		double result = a * d;
		String convert = Double.toString(result);
		BigDecimal bg = new BigDecimal(convert);
		 String convert2 = bg.setScale(4, RoundingMode.HALF_UP).toString();
		if(semitons == 0 ) {
			list.set(0, "440");
			list.set(1, "A");
		}
		 else if(semitons == 1) {
			list.set(0,convert2);
			list.set(1, "A#");
		}else if (semitons == 2) {
			list.set(0,convert2);
			list.set(1, "B");
		}else if (semitons == -1) {
			list.set(0,convert2);
			list.set(1, "G#");
		}else if (semitons == -2) {
			list.set(0,convert2);
			list.set(1,"G");
		}else if (semitons ==-3) {
			list.set(0,convert2);
			list.set(1, "F#");
		} else if (semitons ==-4) {
			list.set(0,convert2);
			list.set(1, "F");
		}else if (semitons == -5) {
			list.set(0,convert2);
		    list.set(1, "E");
		}else if (semitons ==-6) {
			list.set(0,convert2);
			list.set(1,"D#");
		}else if (semitons == -7) {
			list.set(0,convert2);
			list.set(1, "D");
		}else if (semitons == -8) {
			list.set(0,convert2);
			list.set(1, "C#");
		}else if (semitons == -9) {
			list.set(0,convert2);
			list.set(1,"C");
		}
		
	
		return list;
}
}
