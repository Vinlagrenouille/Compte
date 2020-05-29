package main;


import java.util.ArrayList;

public class CompteCourant
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int solde;
    private int numero;
    private ArrayList<Transaction> transactions;

    /**
     * Constructeur d'objets de classe CompteCourant
     */
    public CompteCourant(int i)
    {
        // initialisation des variables d'instance
        solde = 0;
        numero = i;
        transactions = new ArrayList<Transaction>();
       
    }

    public int getNumero(){
        return numero;
    }
    public int getSolde(){
        return solde;
    }
    public void setSolde(int i){
        solde = i;
    }
    public void addTransaction(Transaction t){
    	transactions.add(t);
    }
    public ArrayList<Transaction> getTransactions(){
    	return transactions;
    }
}