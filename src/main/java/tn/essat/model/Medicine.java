package tn.essat.model;


public class Medicine extends Personne{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String description;

	public Medicine () {
		
	}
	public Medicine (int id,String nom, String prenom, String mail, String adresse, String tel,
			String login, String password,  String sexe,String description) {
		super(id,nom, prenom, mail, adresse, tel, login, password, sexe);
		this.description = description;
	}

	public Medicine (String nom, String prenom, String mail, String adresse, String tel,
			String login, String password, 
			String sexe, String description) {
		super(nom, prenom, mail, adresse, tel, login, password, sexe);
		this.description = description;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}