package principal;

import vista.VentanaPrincipal;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		try {
			VentanaPrincipal frame = new VentanaPrincipal();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
