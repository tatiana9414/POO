package model.dec;

public interface SalleCinemaItf {
  String getFilm();
	double getTarif();
	int getNbPlaces();

	void vendrePlace();
	double tauxRemplissage();
  double chiffreAffaires();
  int nbPlacesDisponibles();
	void estPleine();
}
