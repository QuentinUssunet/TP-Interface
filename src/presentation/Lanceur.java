package presentation;

import domaine.Personne;
import service.IAdmin;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IAdmin admin = new ServiceImpl();
		Personne p = new Personne();
		admin.ajouterPersonne(p);
		
		
		
	}

}
