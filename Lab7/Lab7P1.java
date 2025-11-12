import java.awt.event.*;
import java.awt.*;
class Lab7P1{
	public static void main(String...args){
	final int a[]={1};
	Frame f= new Frame();
	FlowLayout fl=new FlowLayout();
	f.setLayout(fl);
	
	
	f.setSize(400,400);
	
	TextField tf=new TextField(20);
	tf.getText();
	
	
	Button b=  new Button();
	b.setLabel("Click");
	b.setSize(20,20);
	
	f.add(tf);
	
	Label l=new Label();
	l.setPreferredSize(new Dimension(10,20));
	
	
	
	f.setVisible(true);
	f.add(b);
	f.add(l);
	l.setText(tf.getText());
	f.addWindowListener(new WindowAdapter(){
		public void WindowClosing(WindowEvent we){}
		
	
	});
	
	b.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent ae){
		System.out.println("hi");
		l.setText(tf.getText()+"-"+a[0]);
		a[0]++;
		} 
		});
		}
	
	
	
	}


