package dao;

import java.util.Collection;

import domaine.Personne;

public interface IDao {

	public void ajouterPersonne(Personne p);
	public void modifierPersonne(Personne p);
	public void supprimerPersonne(int id); //Pour supprimer un élément, l'id suffit.
	public Collection<Personne> findAll();
}
