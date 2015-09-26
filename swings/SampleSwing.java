package swings;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

import sun.awt.WindowClosingListener;

public class SampleSwing extends JFrame implements ActionListener,WindowClosingListener{

	/**
	 * @param args
	 */
	JTextField nameText;
	JTextField urNameText;
	JButton watsUrName;
	
	public SampleSwing(){
		super("Sample Swing");
		
		nameText= new JTextField("name");
		urNameText = new JTextField("urName");
		
		JButton watsUrName = new JButton("AskButton");
		
		Container container = getContentPane();
		
		container.add(nameText);
		container.add(urNameText);
		container.add(watsUrName);
		
		container.setLayout(new FlowLayout());
		
		watsUrName.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		
		SampleSwing ss = new SampleSwing();
		
		ss.setSize(250, 250);
		ss.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg){
		if(arg.getSource().equals(watsUrName)){
			urNameText.setText(nameText.getText());
			
		}
		else{
			System.out.println("Bad Souce");
		}
	}
	
	public void windowClosing(WindowEvent event){
		dispose();
		System.exit(EXIT_ON_CLOSE);
	}


	@Override
	public RuntimeException windowClosingNotify(WindowEvent arg0) {
		// TODO Auto-generated method stub
		this.dispose();
		return null;
	}

	@Override
	public RuntimeException windowClosingDelivered(WindowEvent arg0) {
		// TODO Auto-generated method stub
		this.dispose();
		return null;
	}
}
