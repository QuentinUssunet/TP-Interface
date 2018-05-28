package service;

import java.util.Collection;

import dao.DaoImpl;
import dao.IDao;
import domaine.Personne;

public class ServiceImpl implements IAdmin, IUtilisateur{

	// Attribut de passage d'une couche à une autre
	private IDao dao = new DaoImpl();
	@Override
	public Collection<Personne> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		dao.ajouterPersonne(p);
	}

	@Override
	public void modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		dao.modifierPersonne(p);
	}

	@Override
	public void supprimerPersonne(int id) {
		// TODO Auto-generated method stub
		dao.supprimerPersonne(id);
	}

	
	
}
