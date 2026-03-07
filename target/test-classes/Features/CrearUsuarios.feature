Feature: Crear usuarios
  Como un usuario administrador
  Quiero poder crear usuarios
  Para gestionar los accesos a la plataforma de emisión

  Scenario: Crear usuario en la plataforma
    Given Se ingresa un usuario "pruebasfevalprevia@ptesa.com" y una contraseña "9f.7MmfCMrMvQ"
    When Se hace clic en el boton de iniciar sesion
    And Se hace clic en los modulos de configuracion
    And Se hace clic en usuarios
    And Se selecciona la compania a gestionar
    And Se hace clic en crear usuario
    And Se ingresan los datos del usuario y se hace clic en el boton crear
    Then El sistema muestra un mensaje de exito
    And Se busca el usuario y se hace clic en ver sucursales
    And Asigno permisos al usuario activando cada uno

