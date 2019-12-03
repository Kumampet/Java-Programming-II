import javax.swing.*;

public class ExGUISwing_01 extends JFrame {
  public ExGUISwing_01(){
    super.setTitle("ExGUISwing_01");
    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
    public static void main(String[] args) {
        JFrame f = new ExGUISwing_01();
        f.setSize(300,200);
        f.setVisible(true);
    }
}
