# Autor: LUIS FELIPE OSORIO
@stories

Feature: U test register and successfully login
  As user, I want to register and login in u test page

  @scenario1
  Scenario: Register in utest page
    Given Go to u-test page and open register form
    And   fill the following data to register
      | firstName | lastName | dayBirth | monthBirth | yearBirth | email                | movilDevice |
      | Felipe    | Ososrio  | 15       | June       | 1998      | testemail1@gmail.com | Apple       |