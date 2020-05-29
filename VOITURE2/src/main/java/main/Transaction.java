package main;

/**
 * Cette classe repr�sente un transfert d'argent, une transaction, d'un montant vers un compte destinataire, et permet de l'effectuer
 *
 * @author Vincent N & Mustapha B
 * @version 26 avril 2020
 */
public class Transaction
{
    // variables d'instance
    private int montant;
    private CompteCourant destinataire;

    /**
     * Constructeur d'objets de classe Transaction
     */
    public Transaction(CompteCourant c, int montant){
        destinataire = c;
        this.montant = montant;
    }
    
    /**
     * Constructeur 2 d'objets de classe Transaction
     */
    public Transaction(int montant){
    	this.destinataire = null;
    	this.montant = montant;
    }

    /**
     * M�thode effectuant le transfert d'argent, la transaction vers le compte destinataire
     * @return le nouveau solde du destinataire
     */
    public int validerTransaction(){
    	if(this.destinataire == null){
    		return -1;
    	}
        int tmp = this.montant + this.destinataire.getSolde();
        this.destinataire.setSolde(tmp);
        this.destinataire.addTransaction(this);
        return tmp;
    } 
}
