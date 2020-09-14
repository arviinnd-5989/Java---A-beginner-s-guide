import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {
JLabel jlab;

ButtonDemo(){
JFrame jfrm = new JFrame("Button");
jfrm.setLayout(new FlowLayout());
jfrm.setSize(220,90);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JButton jbtnUp = new JButton("UP");
JButton jbtnDown = new JButton("Down");

jbtnUp.addActionListener(this);
jbtnDown.addActionListener(this);

jfrm.add(jbtnUp);
jfrm.add(jbtnDown);

jlab = new JLabel("Press");
jfrm.add(jlab);
jfrm.setVisible(true);
}

public void actionPerformed(ActionEvent ae){
if(ae.getActionCommand().equals("UP"))
jlab.setText("Up");
else
jlab.setText("Down");
}

public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new ButtonDemo();
}
});
}
}




