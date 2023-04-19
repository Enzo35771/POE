import javax.swing.*;

public class Main {
    public static void main(String[] args) {

       String name = JOptionPane.showInputDialog(null, "What is your name?");
       String surname = JOptionPane.showInputDialog(null, "What is your surname?");
       String username = JOptionPane.showInputDialog(null, "Enter your username:");
       String password = JOptionPane.showInputDialog(null, "Enter your password:");
//object
       Login user = new Login(username, password);
       user.checkUserName(username);
       user.checkPasswordComplexity(password);
       JOptionPane.showMessageDialog(null,user.registerUser());

       String loginUser = JOptionPane.showInputDialog(null, "Enter your username:");
       String loginPass = JOptionPane.showInputDialog(null, "Enter your password:");



    }
}
