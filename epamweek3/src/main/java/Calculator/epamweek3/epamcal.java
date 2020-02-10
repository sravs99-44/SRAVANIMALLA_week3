package Calculator.epamweek3;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="epamcal" width=250 height=250>
</applet>
*/
public class epamcal extends Applet implements ActionListener
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -4185674410856059203L;
	String msg="";
      TextField t1,t2;
	  Button add1,sub,div,mul;
	  public void init()
	  {
	    t1=new TextField(12);
		t2=new TextField(12);
		add1 =new Button ("+");
		add1.setBounds(50,25,150,150);
		sub=new Button ("-");
		sub.setBounds(50,50,50,50);
		mul=new Button("*");
		mul.setBounds(50,75,50,50);
		
		div=new Button("/");
		div.setBounds(50,100,50,50);
		add(t1);
		add(t2);
		add(add1);
		add(sub);
		add(mul);
		add(div);
		add1.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		t1.setText("0");
		t2.setText("0");
		}
		//Methods used in the caliculator
		public int addition (int a,int b)
		{
			return (a+b);
		}
		public int subtraction(int a,int b)
		{
			return (a-b);
		}
		public int multiplication(int a,int b)
		{
			return a*b;
		}
		public int division(int a,int b)
		{
			return a/b;
		}
		//Method for the action performed
		public void actionPerformed(ActionEvent ae)
		{
			int a=0,b=0,z=0;
			String s1,s2,s3,s;
			try
			{
			   s1=t1.getText();
			   a=Integer.parseInt(s1);
			   s2=t2.getText();
			   b=Integer.parseInt(s2);
			  }
				catch (Exception ex){}
			
			
			  String str=ae.getActionCommand();
			  if(str.equals("+"))
			  {  z=addition(a,b);
		  
				  str=String.valueOf(z);
				  msg="sum :"+str;
				  repaint();
			  }
			  if(str.equals("-"))
			  {  z=subtraction(a,b);
		  
				  str=String.valueOf(z);
				  msg="sub :"+str;
				  repaint();
			  }
			  if(str.equals("*"))
			  {  z=multiplication(a,b);
		  
				  str=String.valueOf(z);
				  msg="mul :"+str;
				  repaint();
			  }
			  if(str.equals("/"))
			  {  z=division(a,b);
		  
				  str=String.valueOf(z);
				  msg="div :"+str;
				  repaint();
			  }
		}
			
		public void paint(Graphics g)
		{
		    
			g.drawString ("enter NUMBERS and select OPERATION",10,75);
			g.drawString(msg,10,90);
	
			
		
		}
}		