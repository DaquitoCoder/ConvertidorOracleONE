package modelo;

public class PesoColombiano {
  String currency;
  Long value;

  public PesoColombiano(String currency, Long value) {
    this.currency = currency;
    this.value = value;
  }

  public PesoColombiano(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public double convertCurrency() {
    switch (this.currency) {
      case "Dólar":
        return value / 4767.19;
      case "Euro":
        return value / 5050.52;
      case "Yen":
        return value /  35.52;
      case "Libra Esterlina":
        return value /  5889.74;
      case "Won Coreano":
        return value / 3.69;
    }
    return 0;
  }

}
