/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.lab2.swing;
import javax.swing.*;
/**
 *
 * @author Estudiante
 */
public class Lab2 extends JFrame {
    
    JTextField username = new JTextField(15);
    JTextField phonenumber = new JTextField(15);
    String[] genders = {"Masculino","Femenino"};
    JButton accept = new JButton("ACEPTAR");
    JButton clear = new JButton("LIMPIAR");
    JComboBox formatBox = new JComboBox(genders);
    
    public Lab2() {
        super("Formulario");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    JPanel panel = new JPanel();
    JLabel usernameLabel = new JLabel("Nombre: ");
    JLabel phoneLabel = new JLabel("Telefono: ");
    JLabel formatLabel = new JLabel("Genero:");
    usernameLabel.setName("lblUsername");
    phoneLabel.setName("lblUsername");
    username.setName("username");
    phonenumber.setName("phonenumber");
    accept.setName("accept");
    clear.setName("clear");
    
    panel.setName("Form");
    panel.add(usernameLabel);
    panel.add(username);
    panel.add(phoneLabel);
    panel.add(phonenumber);
    panel.add(accept);
    panel.add(clear);
    panel.add(formatLabel);
    panel.add(formatBox);
    add(panel);
    setVisible(true);
    
}
    
    
    
    
     private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
       Lab2.setLookAndFeel();
       Lab2 ff = new Lab2();
    }
    
}
