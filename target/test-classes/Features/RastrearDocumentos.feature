Feature: Rastrear documentos
  Background:
    Given Se ingresa un usuario "pruebasfevalprevia@ptesa.com" y una contraseña "9f.7MmfCMrMvQ"
    When Se hace clic en el boton de iniciar sesion
    When Se hace clic en factura electronica y se selecciona la opcion documentos emitidos

  Scenario Outline: Rastrear documentos de la plataforma
    When Se hace clic en el boton de rastreador
    And Se selecciona el filtro "<filtro>"
    And Se hace clic en la lupa
    Then El sistema devuelve los resultados de acuerdo al filtro "<filtro>"
    Examples:
      |filtro      |
      #|Error       |
      |Finalizado  |
      #|732373      |


