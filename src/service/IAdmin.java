package service;

import domaine.Personne;

public interface IAdmin {
	
	public void ajouterPersonne(Personne p);
	public void modifierPersonne(Personne p);
	public void supprimerPersonne(int id);

}
