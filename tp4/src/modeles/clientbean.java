package modeles;

public class clientbean {
private String nom;
private String prenom;
private String adresse;
private String tel;
private String email;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public clientbean() {
	
}

public clientbean(String nom, String prenom, String adresse, String tel, String email) {
	this.nom = "";
	this.prenom = "";
	this.adresse = "";
	this.tel = "";
	this.email = "";
}


}
