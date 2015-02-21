
// Example of simple frame, a Jbutton for quitting the application and tooltip [ help messages]


import java.awt.Container;
import java.awt.Event;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MnemonicExample extends JFrame {
	
	
	public MnemonicExample(){
		initUI();
	}
	
	private void initUI(){
		
		JButton quitButton = new JButton("quit");
		
		
		quitButton.setToolTipText("A button comp");
		
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Pressed");
			}
		});
		
		//Sets the keyboard mnemonic on the current model. The mnemonic is the key which when combined with the look and feel's mouseless modifier 
		//(usually Alt) will activate this button if focus is contained somewhere within this button's ancestor window. 
		quitButton.setMnemonic(KeyEvent.VK_B);
		
		createLayout(quitButton);
		
		
		setTitle("Tooltip example");
		setSize(300,200);
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	private void createLayout(JComponent...arg) {
		//Container pane = getContentPane();
		JPanel pane = (JPanel) getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		
		pane.setLayout(gl);
		pane.setToolTipText("Mnemonic Example");
		
		//gl.setAutoCreateContainerGaps(true);
		
		gl.setHorizontalGroup(gl.createSequentialGroup()
				.addComponent(arg[0]));
		gl.setVerticalGroup(gl.createSequentialGroup()
				.addComponent(arg[0]));
		
		//gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[1]));
		//gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[1]));
		
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				MnemonicExample sim = new MnemonicExample();
				sim.setVisible(true);
			}
		});

	}

}
