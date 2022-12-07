package modelo;

public class MonedaExtranjera {
  String name;
  Long value;

  public MonedaExtranjera(String name, Long value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public double toPesoColombiano() {
    switch (this.name) {
      case "Dólar":
        return value * 4767.19;
      case "Euro":
        return value * 5050.52;
      case "Yen":
        return value * 35.52;
      case "Libra Esterlina":
        return value * 5889.74;
      case "Won Coreano":
        return value * 3.69;
    }
    return 0;
  }

}
