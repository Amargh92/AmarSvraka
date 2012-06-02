package paketConverto;


import javax.swing.AbstractButton;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.io.InputStreamReader;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.bind.ParseConversionEvent;



public abstract class Calculation extends CategoriesUnits implements ActionListener {
	
	JPanel panelC = new JPanel();
    JFrame okvirC  = new JFrame("calculate");
	
	
	
	public void CalculationCurr()
	{
		
		calcPanel();
		//final double result=0;
		final String amount;
		amount = JOptionPane.showInputDialog(okvirC, "Input the Amount You wish to Convert");
		 
			
			
		
		
		
		
		 String[] currencyFrom = {"EURO","USD","BAM"};
		 final JList currenciesFR = new JList(currencyFrom);    
		 String[] currencyTO = {"EURO","USD","BAM"};
		 final JList currenciesTO = new JList(currencyFrom); 
		

		      
		 currenciesFR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 currenciesFR.setFont(new Font("Century Gothic", 1, 19));
		 currenciesFR.setForeground(Color.white);
		 currenciesFR.setBackground(Color.blue);
		 panelC.add(currenciesFR);
		 currenciesFR.setBounds(70, 70, 100, 100);
		 
		 
		 currenciesTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 panelC.add(currenciesTO);
		 currenciesTO.setFont(new Font("Century Gothic", 1, 19));
		 currenciesTO.setForeground(Color.white);
		 currenciesTO.setBackground(Color.blue);
		 currenciesTO.setBounds(270, 70, 100, 100);
		 
		 
	
		 currenciesFR.addListSelectionListener(new ListSelectionListener()
		 {
				public void valueChanged(ListSelectionEvent fr)
				{
					
				
			   
					currenciesTO.addListSelectionListener(new ListSelectionListener()
					{
						 
							
						public void valueChanged(ListSelectionEvent to)
							{													
							JTextArea resultText = new JTextArea();
							   resultText.setText("  CONVERTED : ");
							   resultText.setFont(new Font("Century Gothic", 1, 22));
							   resultText.setForeground(Color.white);
							   resultText.setBackground(Color.blue);

							   panelC.add(resultText);
							   resultText.setBounds(70, 250, 400, 30);
							   final double fromAmount;
								fromAmount = Integer.parseInt(amount);
								double result=0;
							
							
				if (currenciesFR.getSelectedIndex() == 0)
					{ 
					
					if (currenciesTO.getSelectedIndex()== 0)
					{
						//euro and euro chosen, so balance is 1
						double curr = 1;	
	             	result=fromAmount*curr;
	             	             	
	             	resultText.setText("  CONVERTED : "+result +" �");
				    }
					if (currenciesTO.getSelectedIndex()== 1)
						{
						//euro and usd chosen
						double curr = 1.4241;	
		             	result=fromAmount*curr;
		             	
		             	resultText.setText("  CONVERTED : "+result +" $");
					    }
		             
		             if (currenciesTO.getSelectedIndex()== 2)
						{
		            	//euro and bam chosen
		            	 double curr = 1.9534;
		             	result=fromAmount*curr;
		             	
		             	resultText.setText("  CONVERTED : "+result +" KM");

		                	}
	            	 
				    }
					
	             
	             if (currenciesFR.getSelectedIndex()== 1)
					{
	            	 if (currenciesTO.getSelectedIndex()== 0)
						{
							//usd and euro chosen
	            		 double curr =  0.83256;	
		             	result=fromAmount*curr;		             	             	
		             	resultText.setText("  CONVERTED : "+result +" �");
		             	
					    }
						if (currenciesTO.getSelectedIndex()== 1)
							{
							//usd and usd chosen, so balance is 1
							float curr = 1;	
			             	result=fromAmount*curr;
			             	
			             	resultText.setText("  CONVERTED : "+result +" $");
						    } 
			             
			             if (currenciesTO.getSelectedIndex()== 2)
							{
			            	//usd and bam chosen
			            	 double curr = 1.532;
			             	result=fromAmount*curr;
			             	resultText.setText("  CONVERTED : "+result+" KM");
	            						    
				    }
	             
	             if (currenciesFR.getSelectedIndex()== 2)
					{
	            	 if (currenciesTO.getSelectedIndex()== 1)
						{
							//euro and euro chosen, so balance is 1
	            		 float curr = 1;	
		             	result=fromAmount*curr;
		             	             	
		             	resultText.setText("  CONVERTED : "+result);
					    }
						if (currenciesTO.getSelectedIndex()== 1)
							{
							//euro and usd chosen
							double curr = 1.4;	
			             	result=fromAmount*curr;
			             	
			             	resultText.setText("  CONVERTED : "+result);
						    }
			             
			             if (currenciesTO.getSelectedIndex()== 2)
							{
			            	//euro and bam chosen
			            	 double curr =  1.7;
			             	result=fromAmount*curr;
			             	resultText.setText("  CONVERTED : "+result);
					} 
	            	 
	                	}
							
	             
				}
				}
					});
		    
				
				}}
				 );}
		   
	public void CalculationLength()
	
	{
		calcPanel();
		//final double result=0;
		final String amount;
		amount = JOptionPane.showInputDialog(okvirC, "Input the Amount You wish to Convert");
		

		 String[] lengthFrom = {"kg","g","mg","tonne","ounces (oz)","stones(st)"};
		 final JList lengthsFR = new JList(lengthFrom);    
		 String[] lengthTO = {"kg","g","mg","tonne","ounces (oz)","stones(st)"};
		 final JList lengthsTO = new JList(lengthFrom); 
		
		 lengthsFR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 lengthsFR.setFont(new Font("Century Gothic", 1, 19));
		 lengthsFR.setForeground(Color.white);
		 lengthsFR.setBackground(Color.blue);
		 panelC.add(lengthsFR);
		 lengthsFR.setBounds(70, 70, 100, 100);
		 
		 lengthsTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 panelC.add(lengthsTO);
		 lengthsTO.setFont(new Font("Century Gothic", 1, 19));
		 lengthsTO.setForeground(Color.white);
		 lengthsTO.setBackground(Color.blue);
		 lengthsTO.setBounds(270, 70, 100, 100);
		 
		 lengthsFR.addListSelectionListener(new ListSelectionListener()
		 {
				public void valueChanged(ListSelectionEvent fr)
				{
					lengthsTO.addListSelectionListener(new ListSelectionListener()
					{
						 
							
						public void valueChanged(ListSelectionEvent to)
							{													
							JTextArea resultText = new JTextArea();
							   resultText.setText("  CONVERTED : ");
							   resultText.setFont(new Font("Century Gothic", 1, 22));
							   resultText.setForeground(Color.white);
							   resultText.setBackground(Color.blue);

							   panelC.add(resultText);
							   resultText.setBounds(70, 250, 400, 30);
							   final double fromAmount;
								fromAmount = Integer.parseInt(amount);
								double result=0;
								
								if (lengthsFR.getSelectedIndex() == 0)
								{ 
								
								if (lengthsTO.getSelectedIndex()== 0)
								{
									//kg and kg are chosen, so balance is 1
									double val = 1;	
				             	result=fromAmount*val;
				             	             	
				             	resultText.setText("  CONVERTED : "+result +" kg");
							    }
								if (lengthsTO.getSelectedIndex()== 1)
									{
									//kg and g chosen
									double val = 1000;	
					             	result=fromAmount*val;
					             	
					             	resultText.setText("  CONVERTED : "+result +" g");
								    }
					             
				}
								if (lengthsTO.getSelectedIndex()== 2)
								{
				            	//kg and mg chosen
				            	 double val = 1000000;
				             	result=fromAmount*val;
				             	
				             	resultText.setText("  CONVERTED : "+result +" mg");

				                	}
			            	 if (lengthsTO.getSelectedIndex()==3)
			            	 {
			            	 //kg and tonne chosen 	 
			            	 double val=1/1000;
						     result = fromAmount*val;
						     resultText.setText("CONVERTED:"+result+"t");
			            	 }
			            	 
							}
					
	
	
	
	
	
	
	
	
	
	
	
	public void calcPanel()
	{
    panelC.setLayout(null);
	
    panelC.setBackground(Color.blue);

     panel.setVisible(false);
     okvir2.setVisible(false);
	
	
	 okvirC.add(panel1);
	 okvirC.add(panelC);
	 okvirC.setSize(500,400);
	 okvirC.setVisible(true);
	 okvirC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	 okvirC.setLocation(500, 180);
	 okvirC.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\users\\�uli�\\desktop\\HARUN_FAKULTET\\logoIconSmall.jpg"));
	 okvirC.setResizable(false);
	 
	 
	 JLabel from = new JLabel();
	 from.setText("From:"); 
	 from.setFont(new Font("Century Gothic", 1, 22));	 
	 from.setForeground(Color.white);
	 panelC.add(from);
	 from.setBounds(70, 20, 100, 50);
	
	 JLabel to = new JLabel();
	 to.setText("To:");
	 to.setFont(new Font("Century Gothic", 1, 22));
	 to.setForeground(Color.white);
	 panelC.add(to);
	 to.setBounds(270, 20, 100, 50);
	}
					}		 
	


	
		 
	
		 

