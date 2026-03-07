Feature: Cerrar Sesion
Background:
  Given Se ingresa un usuario "pruebasfevalprevia@ptesa.com" y una contraseña "9f.7MmfCMrMvQ"
  When Se hace clic en el boton de iniciar sesion

  Scenario: Cerrar sesion de la plataforma
    When Se hace clic en el menu
    And Se hace clic en salir
    Then El sistema direcciona al login
