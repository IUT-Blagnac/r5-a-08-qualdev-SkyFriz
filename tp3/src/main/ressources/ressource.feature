Feature: Pere Noel

  Pere Noel pose dépose un cadeau au pied du sapin

  Scenario: Pere Noel pose dépose un cadeau au pied du sapin
    Given Pere Noel prend un cadeau
    When  Pere Noel dépose le cadeau au pied du sapin
    Then  il y a un cadeau au pied du sapin