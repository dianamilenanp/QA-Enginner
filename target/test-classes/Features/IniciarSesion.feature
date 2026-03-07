Feature: Iniciar Sesion
  Como un usuario
  Quiero poder iniciar sesión en la plataforma de emisión
  Para acceder a emitir documentos electronicos

  Scenario: Iniciar sesión con credenciales validas
    Given Se ingresa un usuario "pruebasfevalprevia@ptesa.com" y una contraseña "9f.7MmfCMrMvQ"
    When Se hace clic en el boton de iniciar sesion
    Then El sistema valida el usuario y direcciona a la pagina de inicio

  Scenario: Iniciar sesión con credenciales invalidas
    Given Se ingresa un usuario "pruebasfevalprevia@ptesa.com" y una contraseña "P4w5W0rT"
    When Se hace clic en el boton de iniciar sesion
    Then El sistema valida el usuario e indica que las credenciales no son correctas


