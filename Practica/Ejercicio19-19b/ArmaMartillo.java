package ar.edu.unlp.info.oo2.Ejercicio19;

public class ArmaMartillo implements Arma {

	@Override
	public int dañarAcero() {
		return 8;
	}

	@Override
	public int dañarHierro() {
		return 10;
	}

	@Override
	public int dañarCuero() {
		return 12;
	}

}
