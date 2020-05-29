Feature: Je veux créer un second compte

  Scenario: Je crée un double de mon compte
    Given j'ai un compte bancaire
    When je veux
    Then je crée un second compte avec le même montant

