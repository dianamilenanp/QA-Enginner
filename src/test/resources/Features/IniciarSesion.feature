Feature: Iniciar Sesion
  Como un usuario
  Quiero poder iniciar sesión
  Para acceder a las diferentes funcionalidades

  Scenario: Iniciar sesión con credenciales validas
    Given Se ingresa un usuario "test" y una contraseña "test"
    When Se hace clic en el boton de iniciar sesion
    Then El sistema valida el usuario y direcciona a la pagina de inicio

  Scenario: Iniciar sesión con credenciales invalidas
    Given Se ingresa un usuario "test" y una contraseña "test"
    When Se hace clic en el boton de iniciar sesion
    Then El sistema valida el usuario e indica que las credenciales no son correctas


