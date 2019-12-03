import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/*
<applet code = "ExGenerics_02" width=400 height=400></applet>
*/
class str<T extends String>
{
	ArrayList<String> s;
	str(){
		s = new ArrayList<String>();
	}
	void add(String t){
		s.add(t);
	}
	void add(int i){
		String st = String.valueOf(i);
		s.add(st);
	}
	void add(Point p){
		String p2s = String.valueOf(p);
		s.add(p2s);
	}
	String get(int i){
		return s.get(i);
	}
	int size(){
		return s.size();
	}
}

public class ExGenerics_02 extends Applet{
	str<String> num_list = new str<String>();

	public void init(){
		this.setSize(400, 300);
		num_list.add("1200");
		num_list.add(new Point(300, 100));
		num_list.add(1300);
		num_list.add("1400");
		num_list.add("1500");
		num_list.add("1600");
	}

	public void paint(Graphics g){
		super.paint(g);

		for(int ii = 0 ; ii < num_list.size() ; ii++){
		    g.drawString(num_list.get(ii), 100, (ii+1)*20);
		}
	}
}
