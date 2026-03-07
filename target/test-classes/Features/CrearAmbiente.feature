Feature: Crear ambiente
 Como un usuario superadministrador
 Quiero crear un ambiente de emisión
 Para configurar una nueva compañía en el sistema

   Scenario: Crear ambiente de emision
    Given Se ingresa un usuario "pruebasfevalprevia@ptesa.com" y una contraseña "9f.7MmfCMrMvQ"
    When Se hace clic en el boton de iniciar sesion
    And Se hace clic en los modulos de configuracion
    And Se hace clic en crear ambiente
    And Se ingresan los datos de la compania
    And Se ingresan los datos de la sucursal principal
    And Se ingresan los datos del administrador
    And Se ingresan los datos de la rg
    And Se configura el sftp
    And Se hace clic en el boton crear ambiente
    Then El sistema muestra un mensaje de exito
