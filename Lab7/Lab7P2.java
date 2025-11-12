import java.awt.event.*;
import java.awt.*;
class Lab7P2 implements ActionListener(){
Frame f=new Frame();
TextField tf=new TextField();
Button b=new Button();
Label l=new Label();
int a=1;
Lab7P2(){
	//public static void main(String...args){
	//final int a=1;
	Frame f= new Frame();
	FlowLayout fl=new FlowLayout();
	f.setLayout(fl);	
	f.setSize(400,400);
	TextField tf=new TextField(20);
	//tf.getText();
	Button b=  new Button();
	b.setLabel("Click");
	b.setSize(20,20);
	//f.add(tf);
	Label l=new Label();
	l.setPreferredSize(new Dimension(10,20));
	f.setVisible(true);
	f.add(tf);
	f.add(b);
	f.add(l);
	//l.setText(tf.getText());
	b.addActionListener(this);
	f.addWindowListener(new WindowAdapter()){
	@Override
		public void windowClosing(WindowEvent we){}
		 f.dispose();
	}
     }
    );
}
		public void actionPerformed(ActionEvent ae){
			System.out.println("hello");
		//public void WindowClosing(WindowEvent we){}
			//System.out.println("hi");
			l.setText(tf.getText()+"-"+a);
			a++;
			}
			public static void main(string...args){
			
				Lab7P2 p= Lab7P2();
			}
	
	}

