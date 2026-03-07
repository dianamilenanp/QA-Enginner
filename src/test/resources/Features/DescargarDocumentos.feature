Feature: Descarga documentos
  Como un usuario
  Quiero poder descargar documentos electrónicos de la plataforma
  Para tener acceso a ellos en formato descargable
Background:
  Given Se ingresa un usuario "test" y una contraseña "test"
  When Se hace clic en el boton de iniciar sesion
  And Se hace clic en documentos

  Scenario Outline: Descargar documentos
    When Se selecciona el documento
    And Se hace clic en el boton descargar "<documento>"
    Then El sistema descarga el archivo en el ordenador
    Examples:
      | documento   |
      | PDF         |
      | EXCEL       |
