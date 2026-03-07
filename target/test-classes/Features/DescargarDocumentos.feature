Feature: Descarga documentos electronicos
  Como un usuario
  Quiero poder descargar documentos electrónicos de la plataforma
  Para tener acceso a ellos en formato descargable
Background:
  Given Se ingresa un usuario "pruebasfevalprevia@ptesa.com" y una contraseña "9f.7MmfCMrMvQ"
  When Se hace clic en el boton de iniciar sesion
  And Se hace clic en factura electronica y se selecciona la opcion documentos emitidos
  And Se selecciona la compañia
  And Se hace clic en la lupa

  Scenario Outline: Descargar documentos
    When Se selecciona el documento
    And Se hace clic en el boton descargar "<documento>"
    Then El sistema descarga el archivo en el ordenador
    Examples:
      | documento   |
      | PDF         |
      | UBL / XML   |
      | AR          |
      | AD          |
