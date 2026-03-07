Feature: Crear sucusales
  Como un usuario administrador
  Quiero poder crear una nueva sucursal en el sistema
  Para gestionar las operaciones en diferentes ubicaciones

  Scenario: Crear sucursal principal
    Given Se ingresa un usuario "pruebasfevalprevia@ptesa.com" y una contraseña "9f.7MmfCMrMvQ"
    When Se hace clic en el boton de iniciar sesion
    And Se hace clic en los modulos de configuracion
    And Se hace clic en sucursales
    And Se selecciona la compania a gestionar
    And Se hace clic en crear sucursal
    And Se ingresan los datos de la sucursal
    And Se hace clic en el boton crear
    Then El sistema muestra un mensaje de exito
