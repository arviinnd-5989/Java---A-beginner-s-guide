import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CBDemo implements ItemListener {
JLabel jlabSelected;
JLabel jlabChanged;
JCheckBox jobAlpha;
JCheckBox jobBeta;
JCheckBox jobGamma;


CBDemo(){
JFrame jfrm = new JFrame("Check");

jfrm.setLayout(new FlowLayout());

jfrm.setSize(280,120);

jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

jlabSelected = new JLabel("");
jlabChanged= new JLabel("");

jobAlpha = new JCheckBox("Alpha");
jobBeta = new JCheckBox("Beta");
jobGamma = new JCheckBox("Gamma");

jobAlpha.addItemListener(this);
jobBeta.addItemListener(this);
jobGamma.addItemListener(this);

jfrm.add(jobAlpha);
jfrm.add(jobBeta);
jfrm.add(jobGamma);
jfrm.add(jlabChanged);
jfrm.add(jlabSelected);

jfrm.setVisible(true);
}

public void itemStateChanged(ItemEvent ie){
String str = "";
JCheckBox cb = (JCheckBox) ie.getItem();

if(cb.isSelected())
jlabChanged.setText(cb.getText());
else
jlabChanged.setText(cb.getText());

if(jobAlpha.isSelected()){
str+= "Alpha";
}

jlabSelected.setText(str);
}


public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new CBDemo();
}
});
}
}




