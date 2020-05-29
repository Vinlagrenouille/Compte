package main;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test TransactionTest.
 *
 * @author  (votre nom)
 * @version (un numÃ©ro de version ou une date)
 *
 * Les classes-test sont documentÃ©es ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basÃ©es sur le document Å  2002 Robert A. Ballance intitulÃ©
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associÃ©s aux classes Ã  tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le mÄ™me paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque mÃ©thode Test Ã  exÃ©cuter.  Il peut y avoir
 * plus d'une mÃ©thode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ dÃ©couvrira automatiquement (par introspection) les mÃ©thodes
 * Test de votre classe Test et gÃ©nÃ©rera la TestSuite consÃ©quente.
 * Chaque appel d'une mÃ©thode Test sera prÃ©cÃ©dÃ© d'un appel de setUp(),
 * qui rÃ©alise les engagements, et suivi d'un appel Ã  tearDown(), qui les
 * dÃ©truit.
 */
public class TransactionTest
{
    // DÃ©finissez ici les variables d'instance nÃ©cessaires Ã  vos engagements;
    // Vous pouvez Ã©galement les saisir automatiquement du prÃ©sentoir
    // Ã  l'aide du menu contextuel "PrÃ©sentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du prÃ©sentoir (les objets sans constructeur, comme int, float, etc.).
    protected double fValeur1;
    protected double fValeur2;

    /**
     * Constructeur de la classe-test TransactionTest
     */
    public TransactionTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * MÃ©thode appelÃ©e avant chaque appel de mÃ©thode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        fValeur1= 2.0;
        fValeur2= 3.0;
    }

    /**
     * Supprime les engagements
     *
     * MÃ©thode appelÃ©e aprÃ¨s chaque appel de mÃ©thode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //LibÃ©rez ici les ressources engagÃ©es par setUp()
    }

    @Test
    public void testValider()
    {
        CompteCourant compteCo1 = new CompteCourant(6);
        Transaction transact2 = new Transaction(compteCo1, 10);
        assertEquals(10, transact2.validerTransaction());
        assertEquals(10, compteCo1.getSolde());
    }

    @Test
    public void testValider2()
    {
        CompteCourant compteCo2 = new CompteCourant(5);
        Transaction transact2 = new Transaction(10);
        assertEquals(-1, transact2.validerTransaction());
        assertEquals(0, compteCo2.getSolde());
    }
}


