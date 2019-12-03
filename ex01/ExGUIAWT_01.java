import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ExGUIAWT_01 extends Applet {
  public void init(){
    setSize(400, 300);
    setVisible(true);
  }
  public void paint(Graphics g){
    Dimension size = getSize();
    g.setColor(Color.red);
    g.drawOval(10,10,200,200);
    g.drawString("April 11 2019", size.width / 2 - 30, size.height - 30);
  }
}
