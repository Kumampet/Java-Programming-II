import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class ExGUISwing_02 extends ExGUISwing_01 {
  JButton btn[] = new JButton[6];
  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();
  JPanel p3 = new JPanel();
  JLabel label = new JLabel();

  public void init(){
    Container ctn = this.getContentPane();
    Border border = new BevelBorder(BevelBorder.LOWERED);
    setBounds(100, 100, 300, 250);
    ctn.setLayout(null);
    p1.setLayout(null);
    p2.setLayout(null);
    p3.setLayout(null);

    ctn.setLayout(new GridLayout(1,3,5,5));
    ctn.add(p1);
    ctn.add(p2);
    label.setText("Power OFF...");
    p2.add(label);
    ctn.add(p3);
    btn[0] = new JButton("1");
    btn[1] = new JButton("2");
    btn[2] = new JButton("3");
    btn[3] = new JButton("4");
    btn[4] = new JButton("5");
    btn[5] = new JButton("6");
    for(int i=0; i<3; i++){
      btn[i].setSize(70, 30);
      p1.add(btn[i]);
    }
    for(int i=3; i<6; i++){
      btn[i].setSize(70,30);
      p3.add(btn[i]);
    }
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public ExGUISwing_02(){
    super.setTitle("ExGUISwing_02");
    init();
  }
  public ExGUISwing_02(String title){
    super.setTitle(title + "::" + "ExGUISwing_02");
    init();
  }
  public void setTitle(String title){
    super.setTitle(title + "::" + "ExGUISwing_02");
  }

  class JLabel {
    public void paint(Graphics g){
      g.setColor(new Color(1, 1, 1));
      g.setFont(new Font(null, Font.BOLD, 10));
      g.drawString(messageString, 20,30);

    }
  }

  public static void main(String[] args) {
    JFrame f = new ExGUISwing_02();
    f.setSize(500, 300);
    f.setVisible(true);
  }
}
