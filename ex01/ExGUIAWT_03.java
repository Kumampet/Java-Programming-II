import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ExGUIAWT_03 extends ExGUIAWT_02 implements MouseListener, MouseMotionListener{
  private double point_x;
  public void init(){
    super.init();
    addMouseListener(this);
    addMouseMotionListener(this);
  }

  public void mousePressed(MouseEvent e){
    point_x = e.getX();
  }

  public void mouseDragged(MouseEvent e){
    if(point_x < e.getX()){
      num++;
      lb.setText(String.valueOf(num));
    }else if(point_x > e.getX()){
      num--;
      lb.setText(String.valueOf(num));
    }else{
      num = num;
      lb.setText(String.valueOf(num));
    }
    mousePressed(e);
  }

  //Don't use method.
  public void mouseClicked(MouseEvent e){}
  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
  public void mouseMoved(MouseEvent e){}
}
