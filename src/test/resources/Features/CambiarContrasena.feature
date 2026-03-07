Feature: Cambiar contrasena de un usuario
  Como un usuario
  Quiero poder cambiar mi contraseña
  Para asegurar que mi cuenta esté protegida

  Scenario: Cambiar contrasena
    Given Se ingresa un usuario "test" y una contraseña "test"
    When Se hace clic en el boton de iniciar sesion
    And Se hace clic en el menu
    And Se hace clic en cambiar contrasena
    And Se ingresa la antigua contrasena
    And Se ingresa la nueva contrasena
    Then Se actualiza correctamente y direcciona al login

  Scenario: Olvidar contrasena
  Given Se hace clic en olvidar contrasena
    When Se ingresa el email
    Then El sistema valida la identidad y envia un correo electronico