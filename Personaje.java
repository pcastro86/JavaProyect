import javax.swing.*;

public class Personaje {

    // atributos
    String name;
    String power;

    // metodos
    public void usePower(String name, String power){
        JOptionPane.showMessageDialog(null, "You are " + name + " and your power to defend the city it's " + power);
    }
}
