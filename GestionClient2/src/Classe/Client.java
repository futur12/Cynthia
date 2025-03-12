/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import AcceeDonne.DeuxMethode;




/**
 *
 * @author LENOVO
 */
public class Client implements DeuxMethode {
    private String Matricule, Nom,Postnom,Prenom,Age,Adresse,EtatCivil,Nationalite,Coordonnées,Agenda;
    public String getMatricule(){
        return Matricule;
    }
    public void setMatricule(String Matrucule){
        this.Matricule=Matricule;
    }
    public String getNom(){
        return Nom;
    }
     public void setNom(String Nom){
        this.Nom=Nom;
     }
      public String getPostnom(){
        return Postnom;
    }
     public void setPostnom(String Postnom){
        this.Postnom=Postnom;
     }
      public String getPrenom(){
        return Prenom;
    }
     public void setPrenom(String Prenom){
        this.Prenom=Prenom;
     }
      public String getAge(){
        return Age;
    }
     public void setAge(String Age){
        this.Age=Age;
     }
     public String getAdresse(){
        return Adresse;
    }
     public void setAdresse(String Adress){
        this.Adresse=Adresse;
     }
      public String getEtatCivil(){
        return EtatCivil;
    }
     public void setEtatCivil(String EtatCivil){
        this.EtatCivil=EtatCivil;
     }
      public String getNationalite(){
        return Nationalite;
    }
     public void setNationalite(String Nationalite){
        this.Nationalite=Nationalite;
     }
      public String getCoordonnées(){
        return Coordonnées;
    }
     public void setCoordonnées(String Coordonnées){
        this.Coordonnées=Coordonnées;
     }
     public String getAgenda(){
         return Agenda;
     }
     public void setAgenda(String Agenda){
         this.Agenda=Agenda;
     }

    @Override
    public boolean miseAjour() throws Exception {
         return Sauvegarder.miseAjour(this); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean supprimer() throws Exception {
        return Supprimer.delete(this); //To change body of generated methods, choose Tools | Templates.
    }
}
