import java.awt.EventQueue;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class MenubarExample1 extends JFrame{

	public MenubarExample1(){
		initUI();
	}
	
	private void initUI(){
		
		createMenubar();
		
		setTitle("Menubar");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	private void createMenubar(){
		JMenuBar menubar = new JMenuBar();
		ImageIcon icon = new ImageIcon("exit.png");
		
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		
		
		menubar.add(file);
		setJMenuBar(menubar);
		
		
	}
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				MenubarExample1 menubar = new MenubarExample1();
				menubar.setVisible(true);
			}
		});
	}

}
