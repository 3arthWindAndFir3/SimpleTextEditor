package packetiknuzhen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextWritting extends JFrame{
	
	static JLabel filename;
	static JLabel texthere;
	static JLabel emptyspace;

	
	public static void main (String [] args) throws Exception {
		
		JFrame okno=new JFrame ("Редактор текста");

		okno.setResizable(false);
		okno.setSize(630, 500);
		
		okno.setLocationRelativeTo(filename);
		
		JPanel x = new JPanel ();
		
		filename=new JLabel ("Введите название файла.txt");
		texthere=new JLabel ("Введите ваш текст здесь:");
		emptyspace=new JLabel ("               ");
		
	    JTextField textfield1=new JTextField(30);
		
	    JTextArea textfield2=new JTextArea(22,50);
	    
	    JButton savebutton=new JButton ("Сохранить в «Мои документы»");
	    
	    
	    savebutton.addActionListener(new ActionListener() { // обработка нажатия кнопки схоранить
			public void actionPerformed(ActionEvent e)
			{	  
				try {

	                JOptionPane.showMessageDialog(null, "Сохранено!");
	                String username=System.getProperty("user.name");
	                FileWriter fileWriter = new FileWriter("C:\\Users\\"+ username+"\\Documents\\"+textfield1.getText());
	                fileWriter.write(textfield2.getText());
	                fileWriter.close();  
	                }
			
	             catch (Exception e1) {
	            	 JOptionPane.showMessageDialog(null, e1);
	             }
	 
	        
			}
				                                          } 
				
			                        );
	    
	    
	    JScrollPane scroll = new JScrollPane(textfield2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
     
	    x.add(filename);
		x.add(textfield1);
		
		 x.add(emptyspace);
		 
		x.add(texthere);
		x.add(emptyspace);
		
		x.add(scroll);
		
		x.add(emptyspace);
		x.add(emptyspace);
		x.add(emptyspace);
		x.add(emptyspace);
		x.add(savebutton);
		
		okno.add(x);
		
		x.setVisible(true);
		okno.show();
		
	}
	
}
