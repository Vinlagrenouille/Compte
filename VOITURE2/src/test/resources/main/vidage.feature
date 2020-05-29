Feature: Je veux vider un compte

  Scenario: Je vide un compte
    Given j'ai un compte bancaire
    When je veux
    Then je retire tout l'argent du compte

