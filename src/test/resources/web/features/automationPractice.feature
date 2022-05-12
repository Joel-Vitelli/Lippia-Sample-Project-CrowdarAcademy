Feature: El usuario se logea en la web correctamente

  @Test
  Scenario: El usuario se logea correctamente con credenciales validas
    Given El usuario se encuentra en la web Automation Practice
    When El usuario clickea el botón "My Account" del menú
    And El usuario ingresa su username "joel_prueba@test.com"
    And El usuario ingresa su pasword "TestingCrowdar2022!"
    And El usuario clickea el botón "Login"
    Then El usuario verifica que ingreso correctamente a la web
