package control;

import vista.Ventana;

public class Control {

  public void initProgram() {
    try {
      Object[] options = { "Convertidor de moneda", "Convertidor de distancias" };
      String opc = "";
      do {
        opc = Ventana.getInfo("Seleccione el convertidor: ", "Convertidor", options);
        if (opc != null) {
          switch (opc) {
            case "Convertidor de moneda":
              CurrencyConverter();
              break;

            case "Convertidor de distancias":
              DistanceConverter();
              break;
          }
        } else {
          Ventana.showWindow("Saliendo del programa, vuelva pronto.");
        }
      } while (opc != null);
    } catch (Exception e) {
      Ventana.showMessageError(e.toString());
    }
  }

  public void CurrencyConverter() {
    Object[] options = { "De Peso Colombiano a Dólar", "De Peso Colombiano a Euro", "De Peso Colombiano a Yen",
        "De Peso Colombiano a Libra Esterlina", "De Peso Colombiano a Won Coreano", "Dólar a Peso Colombiano",
        "Euro a Peso Colombiano", "Yen a Peso Colombiano", "Libra Esterlina a Peso Colombiano",
        "Won Coreano a Peso Colombiano" };
    String opc = "";
    do {
      opc = Ventana.getInfo("", "Convertidor de moneda", options);
      if (opc != null) {
        switch (opc) {
          case "De Peso Colombiano a Dólar":

            break;
          case "De Peso Colombiano a Euro":

            break;
          case "De Peso Colombiano a Yen":

            break;
          case "De Peso Colombiano a Libra Esterlina":

            break;
          case "De Peso Colombiano a Won Coreano":

            break;
          case "Dólar a Peso Colombiano":

            break;
          case "Euro a Peso Colombiano":

            break;
          case "Yen a Peso Colombiano":

            break;
          case "Libra Esterlina a Peso Colombiano":

            break;
          case "Won Coreano a Peso Colombiano":

            break;
        }
      } else {
        Ventana.showWindow("Saliendo del convertidor de moneda, vuelva pronto.");
      }
    } while (opc != null);
  }

  public void PesoToAnotherCurrency(String currency) {
    //TODO: Implementar este método para convertir de Peso Colombiano a otra moneda uwu
  }

  //TODO: Crear el método para convertir de otra moneda a Peso Colombiano uwu
  public void DistanceConverter() {

  }

}
