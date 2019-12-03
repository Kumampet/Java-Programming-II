import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ExGUIAWT_02 extends ExGUIAWT_01 implements ActionListener{
  private Button btn_plus;
  private Button btn_minus;
  public Label lb;
  public int num = 0;

  public void init(){
    super.init();
    btn_plus = new Button("+");
    btn_minus = new Button("-");
    btn_plus.addActionListener(this);
    btn_minus.addActionListener(this);
    lb = new Label("0");
    add(btn_plus);
    add(btn_minus);
    add(lb);
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == btn_plus) {
      num++;
      lb.setText(String.valueOf(num));
    }else{
      num--;
      lb.setText(String.valueOf(num));
    }
  }

  public void paint(Graphics g){
    super.paint(g);
    lb.setForeground(Color.black);
  }

}
