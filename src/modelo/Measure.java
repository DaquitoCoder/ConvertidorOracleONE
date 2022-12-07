package modelo;

public class Measure {
  String measure;
  Long value;

  public Measure(String measure, Long value) {
    this.measure = measure;
    this.value = value;
  }

  public void setMeasure(String measure) {
    this.measure = measure;
  }

  public String getMeasure() {
    return measure;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  public double convertMeasure() {
    switch (this.measure) {
      case "Centímetros":
        return value / 100;
      case "Metros":
        return value * 1.094;
      case "Pie":
        return value / 3.281;
      case "Kilómetros":
        return value / 1.609;
      case "Litros":
        return value / 3.785;
    }
    return 0;
  }
}
