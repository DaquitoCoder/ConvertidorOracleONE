package vista;

import javax.swing.JOptionPane;

public class Ventana {

  public static void showWindow(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  public static String getInfo(String message) {
    return JOptionPane.showInputDialog(null, message);
  }

  public static String getInfo(String message, String title, Object[] array) {
    Object initialOption = array[0];
    return (String) JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, array,
        initialOption);
  }

  public static void showMessageError(String message) {
    JOptionPane.showMessageDialog(null, message, "ERRROR!", JOptionPane.ERROR_MESSAGE);
  }
}
