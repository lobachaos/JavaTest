package job;
public class Challenger2 {
	public static String tamanhoSetorBusca(Integer areaMaior, Integer areaMenor) {

		double areaTotal = areaMaior;
		double areaVip = areaMenor;

		if ((areaTotal - areaVip) % 8 == 0) {
			int areaPop1 = (int) ((areaTotal - areaVip) / 8);
			String convert = String.valueOf(areaPop1);
			return convert;
		} else {
			
			double areaPop = (double)(areaMaior - areaMenor) / 8;
			String convert2 = String.valueOf(areaPop);
			
			return convert2;
		}

	}

}
