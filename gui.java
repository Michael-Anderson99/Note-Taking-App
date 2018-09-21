package notes;

/* week of the 11 of june 2018
 * Standards for myself: bracket allignment, white space, comment the open and close of statements,comment what every major part means, close all readers when done
 * this project was done outside of school hours but does reference code from a language analyser tool I made in a college assignment
 * created by Michael Anderson,
 * email:Michael.anderson2@mydit.ie,
 * twitter:@Mikey99Anderson
 * A note taking program that uses a GUI and takes the name of a TF and makes it a file
 * and adds content of a TA to be the content of the note
 * Created in Eclipse
 * I like to use lots of white space to make the code readable, it makes it easier to work with
 */


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.*;

public class gui extends JFrame implements ActionListener, MouseListener
{
	//declaring what variables I will need, for saving the content and creating the gui and the file
	private JTextField tf1;
	private JButton b1;
	private JTextArea ta1;
	private String s1;
	File f1;
	
	
	gui(String title)
	{
		//setting the name of the gui window
		super(title);
		setSize(600,600);
		setLayout(new FlowLayout());
		
		//create button to reference for saving
		b1 = new JButton("Save!");
		b1.addActionListener(this);
		
		//creating the textfield for the title
		tf1 = new JTextField();
		tf1.setColumns(50);
		tf1.setText("Enter the title of your note here");
		tf1.addMouseListener(this);
		
		//initializing the text area for the actual content
		ta1 = new JTextArea(15, 50);
		ta1.setText("Enter your text here!");
		ta1.addMouseListener(this);
		
		//mouse listeners added to clear content when the default sentence is contained in the text fields
		
		//adding button and text fields to the gui and making the gui visible so the program works
		add(tf1);
		add(ta1);
		add(b1);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		//uses the mouse listner to clear the textfield if the default sentince is written when the user goes to type
		if (e.getSource() == ta1)
		{
			
			if("Enter your text here!".equals (ta1.getText()))
			{
				ta1.setText(" ");
			}
		}
		else if (e.getSource() == tf1)
		{
			
			if("Enter the title of your note here".equals (tf1.getText()))
			{
				tf1.setText(" ");
			}
		}
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//action listener used to save the contents to a text file and save the first text field as the title of the file
		if (e.getSource() == b1)
		{
			
			try
			{
				s1 = tf1.getText();
				f1 = new File("C:\\Users\\Michael\\Documents\\Personal\\EclipseNotes\\"+s1+".txt");
				FileWriter fwrite = new FileWriter(f1.getAbsoluteFile(),true);
				
		        BufferedWriter buff = new BufferedWriter(fwrite);
		        
		        buff.write(ta1.getText());
		        buff.close();
		        //always close the buffered writer
				
			}//try
			catch(Exception ex) 
			{
				System.out.println("exception "+ex.getMessage()+"caught");
			}//catch
			
						
		}
		else
		{
			System.out.println("hi!");
			//"hi" was used in testing and i want to keep it until the project is 100% finished just as a marker and reminder that work is still to be done
		}
		
	}
	
	
	
	
			
	
}
