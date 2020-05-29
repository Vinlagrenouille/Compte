Feature: Je reçois une transaction
  Cette situation m'arrivera

  Scenario: Recevoir une transaction
    Given j'ai un compte bancaire
    When une transaction a lieu
    Then mon compte est crédité de cet argent