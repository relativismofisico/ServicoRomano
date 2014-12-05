package co.edu.udea.empresariales.romanos;

public class ConvetidorRomanos {
	String ERDN = "";

	public static int[] RomanoConvertidorUnidades(int num) {
		int x;
		int mil, cent, dece, unid;
		mil = (num / 1000);
		x = num % 1000;
		cent = x / 100;
		x = num % 100;
		dece = x / 10;
		unid = num % 10;
		return new int[] { mil, cent, dece, unid };
	}

	public String convertirUnidadesDeMilARomano(int mil) {
		int[] resultadoEsperado = RomanoConvertidorUnidades(mil);
		int tamaño = resultadoEsperado.length;
		int miles = resultadoEsperado[tamaño - 4];
		switch (miles) {
		case 1:
			return ("M");
		case 2:
			return ("MM");
		case 3:
			return ("MMM");
		}
		return "";
	}

	public String convertirCentenasARomano(int centena) {
		int[] resultadoEsperado = RomanoConvertidorUnidades(centena);
		int tamaño = resultadoEsperado.length;
		int cent = resultadoEsperado[tamaño - 3];
		switch (cent) {
		case 1:
			return ("C");
		case 2:
			return ("CC");
		case 3:
			return ("CCC");
		case 4:
			return ("CD");
		case 5:
			return ("D");
		case 6:
			return ("DC");
		case 7:
			return ("DCC");
		case 8:
			return ("DCCC");
		case 9:
			return ("CM");
		}
		return "";
	}

	public String convertirDecenasARomano(int decenas) {
		int[] resultadoEsperado = RomanoConvertidorUnidades(decenas);
		int tamaño = resultadoEsperado.length;
		int dece = resultadoEsperado[tamaño - 2];
		switch (dece) {
		case 1:
			return ("X");
		case 2:
			return ("XX");
		case 3:
			return ("XXX");
		case 4:
			return ("XL");
		case 5:
			return ("L");
		case 6:
			return ("LX");
		case 7:
			return ("LXX");
		case 8:
			return ("LXXX");
		case 9:
			return ("XC");
		}
		return "";
	}

	public String convertirUnidadesARomano(int unidades) {
		int[] resultadoEsperado = RomanoConvertidorUnidades(unidades);
		int tamaño = resultadoEsperado.length;
		int unidad = resultadoEsperado[tamaño - 1];
		switch (unidad) {
		case 1:
			return ("I");
		case 2:
			return ("II");
		case 3:
			return ("III");
		case 4:
			return ("IV");
		case 5:
			return ("V");
		case 6:
			return ("VI");
		case 7:
			return ("VII");
		case 8:
			return ("VIII");
		case 9:
			return ("IX");
		}
		return "";
	}
}