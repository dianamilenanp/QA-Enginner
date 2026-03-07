Feature: Realizar filtros de documentos electronicos
Background:
  Given Se ingresa un usuario "pruebasfevalprevia@ptesa.com" y una contraseña "9f.7MmfCMrMvQ"
  When Se hace clic en el boton de iniciar sesion
  And Se hace clic en factura electronica y se selecciona la opcion documentos emitidos
  And Se selecciona la compañia

  Scenario: Filtrar por compania
    When Se hace clic en la lupa
    Then El sistema devuelve los resultados de acuerdo a la compania

  Scenario Outline: Filtrar por sucursal
    When Seleccione la sucursal "<sucursal>"
    When Se hace clic en la lupa
    Then El sistema devuelve los resultados de acuerdo a la sucursal
    Examples:
      |sucursal                   |
      |PTESA Pruebas SAS BRANCH   |

  Scenario Outline: Filtrar por prefijo
    When Ingrese el prefijo "<prefijo>"
    When Se hace clic en la lupa
    Then El sistema devuelve los resultados de acuerdo al prefijo "<prefijo>"
    Examples:
      |prefijo |
      |SETT    |

  Scenario Outline: Filtrar por documento
    When Ingrese el documento "<documento>"
    And Se hace clic en la lupa
    Then El sistema devuelve los resultados de acuerdo al documento "<documento>"
    Examples:
      |documento        |
      |SETP991210247    |

  Scenario Outline: Filtrar por estado del documento
    When Seleccione el estado "<estado>"
    And Se hace clic en la lupa
    Then El sistema devuelve los resultados de acuerdo al estado "<estado>"
    Examples:
      |estado                                   |
      |Aceptado por la DIAN                     |
      |Rechazado por la DIAN                    |
      |Aceptado por la DIAN con notificaciones  |
      |Enviado al adquiriente                   |
      |Aceptado por el adquiriente              |
      |Aceptación tácita                        |
      |Rechazado por el adquiriente             |
      #|Bloqueado por soportes                   |

  Scenario Outline: Filtrar por el tipo de documento
    When Seleccione el tipo "<tipo>"
    And Se hace clic en la lupa
    Then El sistema devuelve los resultados de acuerdo al tipo "<tipoDoc>"
    Examples:
      |tipo                                    |tipoDoc  |
      |Factura de Venta                        |FE       |
      |Nota Débito                             |ND       |
      |Nota Crédito                             |NC       |
      |Documento de Soporte                    |DS       |
      |Nota de ajuste a Documento de Soporte   |NC       |

  Scenario Outline: Filtrar por la razon social del cliente
    When Ingrese la razon social "<nombre>"
    And Se hace clic en la lupa
    Then El sistema devuelve los resultados de acuerdo al nombre del cliente "<nombre>"
    Examples:
      |nombre                                |
      |Adquiriente de pruebas automatizadas  |

  Scenario Outline: Filtrar por identificacion del cliente
    When Ingrese la identificacion "<identificacion>"
    And Se hace clic en la lupa
    Then El sistema devuelve los resultados de acuerdo al nit del cliente "<identificacion>"
    Examples:
      |identificacion   |
      |1014306300       |

  Scenario Outline: Filtrar por fecha
    When Seleccione la fecha "<fecha>"
    And Se hace clic en la lupa
    Then El sistema devuelve los resultados de acuerdo a la fecha "<fecha>"
    Examples:
      |fecha               |
      #|Hoy                 |
      |Últimos 7 días      |
      #|Últimos 30 días     |
      #|Últimos 6 meses     |
      #|Últimos 12 meses    |

  Scenario Outline: Descargar reporte de excel
    When Seleccione la fecha "<fecha>"
    And Se hace clic en la lupa
    When Hago clic en el boton descargar reporte excel
    Then El archivo se descarga
    Examples:
      |fecha               |
      |Últimos 7 días                  |

  Scenario Outline: Descargar reporte de RG
    When Seleccione la fecha "<fecha>"
    And Se hace clic en la lupa
    #When Hago clic en el boton descargar reporte pdf
    When Hago clic en reportes
    Then El archivo se descarga
    Examples:
      |fecha               |
      |Hoy                 |
