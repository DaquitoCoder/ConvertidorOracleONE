package modelo;

public class MonedaExtranjera {
  String name;
  Long value;

  public MonedaExtranjera(String name, Long value) {
    this.name = name;
    this.value = value;
  }

  public String getname() {
    return name;
  }

  public void setname(String name) {
    this.name = name;
  }

  public Long getvalue() {
    return value;
  }

  public void setvalue(Long value) {
    this.value = value;
  }

  public long toPesoColombiano() {
    switch (this.name) {
      case "Dólar":
        return value * (long) 4767.19;
      case "Euro":
        return value * (long) 5050.52;
      case "Yen":
        return value * (long) 35.52;
      case "Libra Esterlina":
        return value * (long) 5889.74;
      case "Won Coreano":
        return value * (long) 3.69;
    }
    return 0;
  }

}
