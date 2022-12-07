package control;

import vista.Ventana;
import java.text.DecimalFormat;
import modelo.*;

public class Control {

  DecimalFormat df = new DecimalFormat("##.##");
  PesoColombiano pesoCol;
  MonedaExtranjera monedaExt;

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
              MeasureConverter();
              break;
          }
        } else {
          Ventana.showWindow("Saliendo del programa, vuelva pronto.");
        }
      } while (opc != null);
    } catch (Exception e) {
      Ventana.showMessageError("Saliendo del programa, vuelva pronto.");
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
            pesoCol = new PesoColombiano("Dólar",
                Long.parseLong(Ventana.getInfo("Ingrese el valor en pesos: ")));
            Ventana.showWindow("Usted tiene " + df.format(pesoCol.convertCurrency()) + " dólares.");
            break;
          case "De Peso Colombiano a Euro":
            pesoCol = new PesoColombiano("Euro",
                Long.parseLong(Ventana.getInfo("Ingrese el valor en pesos: ")));
            Ventana.showWindow("Usted tiene " + df.format(pesoCol.convertCurrency()) + " euros.");
            break;
          case "De Peso Colombiano a Yen":
            pesoCol = new PesoColombiano("Yen", Long.parseLong(Ventana.getInfo("Ingrese el valor en pesos: ")));
            Ventana.showWindow("Usted tiene " + df.format(pesoCol.convertCurrency()) + " yenes.");
            break;
          case "De Peso Colombiano a Libra Esterlina":
            pesoCol = new PesoColombiano("Libra Esterlina",
                Long.parseLong(Ventana.getInfo("Ingrese el valor en pesos: ")));
            Ventana.showWindow("Usted tiene " + df.format(pesoCol.convertCurrency()) + " libras esterlinas.");
            break;
          case "De Peso Colombiano a Won Coreano":
            pesoCol = new PesoColombiano("Won Coreano",
                Long.parseLong(Ventana.getInfo("Ingrese el valor en pesos: ")));
            Ventana.showWindow("Usted tiene " + df.format(pesoCol.convertCurrency()) + " wones coreanos.");
            break;
          case "Dólar a Peso Colombiano":
            monedaExt = new MonedaExtranjera("Dólar",
                Long.parseLong(Ventana.getInfo("Ingrese el valor en dólares: ")));
            Ventana.showWindow("Usted tiene " + df.format(monedaExt.toPesoColombiano()) + " pesos colombianos.");
            break;
          case "Euro a Peso Colombiano":
            monedaExt = new MonedaExtranjera("Euro",
                Long.parseLong(Ventana.getInfo("Ingrese el valor en euros: ")));
            Ventana.showWindow("Usted tiene " + df.format(monedaExt.toPesoColombiano()) + " pesos colombianos.");
            break;
          case "Yen a Peso Colombiano":
            monedaExt = new MonedaExtranjera("Yen", Long.parseLong(Ventana.getInfo("Ingrese el valor en yenes: ")));
            Ventana.showWindow("Usted tiene " + df.format(monedaExt.toPesoColombiano()) + " pesos colombianos.");
            break;
          case "Libra Esterlina a Peso Colombiano":
            monedaExt = new MonedaExtranjera("Libra Esterlina",
                Long.parseLong(Ventana.getInfo("Ingrese el valor en libras esterlinas: ")));
            Ventana.showWindow("Usted tiene " + df.format(monedaExt.toPesoColombiano()) + " pesos colombianos.");
            break;
          case "Won Coreano a Peso Colombiano":
            monedaExt = new MonedaExtranjera("Won Coreano",
                Long.parseLong(Ventana.getInfo("Ingrese el valor en libras esterlinas: ")));
            Ventana.showWindow("Usted tiene " + df.format(monedaExt.toPesoColombiano()) + " pesos colombianos.");
            break;
        }
      } else {
        Ventana.showWindow("Saliendo del convertidor de moneda, vuelva pronto.");
      }
    } while (opc != null);
  }

  public void MeasureConverter() {
    Object[] options = { "De Centímetros a Metros", "De Metros a Yardas", "De Pies a Metros", "De Kilometros a Millas",
        "De Litros a Galones" };
    String opc = "";
    Measure measure;
    do {
      opc = Ventana.getInfo("", "Convertidor de moneda", options);
      if (opc != null) {
        switch (opc) {
          case "De Centímetros a Metros":
            measure = new Measure("Centímetros", Long.parseLong(Ventana.getInfo("Ingrese el valor en centímetros: ")));
            Ventana.showWindow("Usted tiene " + df.format(measure.convertMeasure()) + " metros.");
            break;
          case "De Metros a Yardas":
            measure = new Measure("Metros", Long.parseLong(Ventana.getInfo("Ingrese el valor en metros: ")));
            Ventana.showWindow("Usted tiene " + df.format(measure.convertMeasure()) + " yardas.");
            break;
          case "De Pies a Metros":
            measure = new Measure("Pies", Long.parseLong(Ventana.getInfo("Ingrese el valor en pies: ")));
            Ventana.showWindow("Usted tiene " + df.format(measure.convertMeasure()) + " metros.");
            break;
          case "De Kilometros a Millas":
            measure = new Measure("Kilometros", Long.parseLong(Ventana.getInfo("Ingrese el valor en kilometros: ")));
            Ventana.showWindow("Usted tiene " + df.format(measure.convertMeasure()) + " millas.");
            break;
          case "De Litros a Galones":
            measure = new Measure("Litros", Long.parseLong(Ventana.getInfo("Ingrese el valor en litros: ")));
            Ventana.showWindow("Usted tiene " + df.format(measure.convertMeasure()) + " galones.");
            break;
        }
      } else {
        Ventana.showWindow("Saliendo del convertidor de distancias, vuelva pronto.");
      }
    } while (opc != null);
  }
}
