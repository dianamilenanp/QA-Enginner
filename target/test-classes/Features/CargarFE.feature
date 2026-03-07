Feature: Cargar Factura electronica
Background:
  Given Se ingresa un usuario "pruebasfevalprevia@ptesa.com" y una contraseña "9f.7MmfCMrMvQ"
  When Se hace clic en el boton de iniciar sesion

  Scenario Outline: Cargar Factura electronica formato XML
    When Seleccione el emisor y cargue el documento "<documento>" XML
    Then El sistema devuelve un trackid y el documento se carga correctamente
    Examples:
      | documento |
      | FE     |
      | NI     |
      | DS     |

  Scenario Outline: Cargar Factura electronica formato Excel
    When Seleccione el emisor y cargue el documento "<documento>" Excel
    Then El sistema devuelve un trackid y el documento se carga correctamente
    Examples:
      | documento|
      | FE       |
      | NI       |
      | DS       |

  Scenario Outline: Cargar Factura electronica formato TXT
    When Seleccione el emisor y cargue el documento "<documento>" TXT
    Then El sistema devuelve un trackid y el documento se carga correctamente
    Examples:
      | documento|
      | FE       |
      | DS       |

  Scenario Outline: Cargar Factura electronica formato Alfa
    When Seleccione el emisor y cargue el documento "<documento>" Alfa
    Then El sistema devuelve un trackid y el documento se carga correctamente
    Examples:
      | documento|
      | FE       |

  Scenario Outline: Cargar Factura electronica formato Apiros
    When Seleccione el emisor y cargue el documento "<documento>" Apiros extension "<formato>"
    Then El sistema devuelve un trackid y el documento se carga correctamente
    Examples:
      | documento | formato    |
      | FE      | apiros     |
      | NI      | apirosnom  |
      | DS      | apiros     |

  Scenario Outline: Cargar Factura electronica formato UBL21
    When Seleccione el emisor y cargue el documento "<documento>" UBL21 extension "<formato>"
    Then El sistema devuelve un trackid y el documento se carga correctamente
    Examples:
      | documento | formato |
      | FE      | ubl21 |
      | NI      | nom |
      | DS      | ubl21 |

  Scenario Outline:  Cargar Factura electronica formato Astara
    When Seleccione el emisor y cargue el documento "<documento>" Astara
    Then El sistema devuelve un trackid y el documento se carga correctamente
    Examples:
      | documento |
      | FE     |
      | DS     |

  Scenario Outline: Cargar Factura electronica formato Confipetrol
    When Seleccione el emisor y cargue el documento "<documento>" Confipetrol
    Then El sistema devuelve un trackid y el documento se carga correctamente
    Examples:
      | documento |
      | FE     |