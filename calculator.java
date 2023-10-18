import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;

public class calculator implements ActionListener
{
    JFrame jf;
    JLabel displayLabel;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton buttondot;
    JButton buttonzero;
    JButton buttonequals;
    JButton buttondivide;
    JButton buttonmultiply;
    JButton buttonsubtract;
    JButton buttonadd;
    JButton buttonclear;
    
    boolean isOperatorClicked=false;
    String preOperatorValue="";
    String postOperatorValue="";
    String Operator="";
    double result;

    public calculator()
    {
        jf=new JFrame();
        jf.setLayout(null);
        
        jf.setBounds(500, 150, 450, 700);

        displayLabel=new JLabel();
        displayLabel.setBounds(30, 30, 380, 100);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setFont(new FontUIResource("Arial",5,30));
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.BLACK);

        button7=new JButton("7", null);
        button7.setBounds(30, 150, 80, 80);
        button7.setBackground(Color.gray);
        button7.setFont(new FontUIResource("Arial",1,20));
        button7.addActionListener(this);

        button8=new JButton("8", null);
        button8.setBounds(130, 150, 80, 80);
        button8.setBackground(Color.gray);
        button8.setFont(new FontUIResource("Arial",1,20));
        button8.addActionListener(this);

        button9=new JButton("9", null);
        button9.setBounds(230, 150, 80, 80);
        button9.setBackground(Color.gray);
        button9.setFont(new FontUIResource("Arial",1,20));
        button9.addActionListener(this);

        button4=new JButton("4", null);
        button4.setBounds(30, 250, 80, 80);
        button4.setBackground(Color.gray);
        button4.setFont(new FontUIResource("Arial",1,20));
        button4.addActionListener(this);
        
        button5=new JButton("5", null);
        button5.setBounds(130, 250, 80, 80);
        button5.setBackground(Color.gray);
        button5.setFont(new FontUIResource("Arial",1,20));
        button5.addActionListener(this);

        button6=new JButton("6", null);
        button6.setBounds(230, 250, 80, 80);
        button6.setBackground(Color.gray);
        button6.setFont(new FontUIResource("Arial",1,20));
        button6.addActionListener(this);

        button1=new JButton("1", null);
        button1.setBounds(30, 350, 80, 80);
        button1.setBackground(Color.gray);
        button1.setFont(new FontUIResource("Arial",1,20));
        button1.addActionListener(this);

        button2=new JButton("2", null);
        button2.setBounds(130, 350, 80, 80);
        button2.setBackground(Color.gray);
        button2.setFont(new FontUIResource("Arial",1,20));
        button2.addActionListener(this);

        button3=new JButton("3", null);
        button3.setBounds(230, 350, 80, 80);
        button3.setBackground(Color.gray);
        button3.setFont(new FontUIResource("Arial",1,20));
        button3.addActionListener(this);

        buttondot=new JButton(".", null);
        buttondot.setBounds(30, 450, 80, 80);
        buttondot.setBackground(Color.gray);
        buttondot.setFont(new FontUIResource("Arial",1,20));
        buttondot.addActionListener(this);

        buttonzero=new JButton("0", null);
        buttonzero.setBounds(130, 450, 80, 80);
        buttonzero.setBackground(Color.gray);
        buttonzero.setFont(new FontUIResource("Arial",1,20));
        buttonzero.addActionListener(this);

        buttonequals=new JButton("=", null);
        buttonequals.setBounds(230, 450, 80, 80);
        buttonequals.setBackground(Color.gray);
        buttonequals.setFont(new FontUIResource("Arial",1,20));
        buttonequals.addActionListener(this);

        buttondivide=new JButton("/", null);
        buttondivide.setBounds(330, 150, 80, 80);
        buttondivide.setBackground(Color.gray);
        buttondivide.setFont(new FontUIResource("Arial",1,20));
        buttondivide.addActionListener(this);

        buttonmultiply=new JButton("x", null);
        buttonmultiply.setBounds(330, 250, 80, 80);
        buttonmultiply.setBackground(Color.gray);
        buttonmultiply.setFont(new FontUIResource("Arial",1,20));
        buttonmultiply.addActionListener(this);

        buttonsubtract=new JButton("-", null);
        buttonsubtract.setBounds(330, 350, 80, 80);
        buttonsubtract.setBackground(Color.gray);
        buttonsubtract.setFont(new FontUIResource("Arial",1,20));
        buttonsubtract.addActionListener(this);

        buttonadd=new JButton("+", null);
        buttonadd.setBounds(330, 450, 80, 80);
        buttonadd.setBackground(Color.gray);
        buttonadd.setFont(new FontUIResource("Arial",1,20));
        buttonadd.addActionListener(this);

        buttonclear=new JButton("Clear");
        buttonclear.setBounds(30, 550, 380, 100);
        buttonclear.setBackground(Color.gray);
        buttonclear.setFont(new FontUIResource("Arial",1,20));
        buttonclear.addActionListener(this);

        jf.add(button7);
        jf.add(button8);
        jf.add(button9);
        jf.add(button4);
        jf.add(button5);
        jf.add(button6);
        jf.add(button1);
        jf.add(button2);
        jf.add(button3);
        jf.add(buttondot);
        jf.add(buttonzero);
        jf.add(buttonequals);
        jf.add(buttondivide);
        jf.add(buttonmultiply);
        jf.add(buttonsubtract);
        jf.add(buttonadd);
        jf.add(displayLabel);
        jf.add(buttonclear);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        calculator c=new calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button7)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("7");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"7");
            }
        }
        else if(e.getSource() == button8)
        {
             if(isOperatorClicked)
            {
                displayLabel.setText("8");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"8");
            }
        }
        else if(e.getSource() == button9)
        {
             if(isOperatorClicked)
            {
                displayLabel.setText("9");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }
        else if(e.getSource() == button4)
        {
             if(isOperatorClicked)
            {
                displayLabel.setText("4");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }
        else if(e.getSource() == button5)
        {
             if(isOperatorClicked)
            {
                displayLabel.setText("5");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"5");
            }
        }
        else if(e.getSource() == button6)
        {
             if(isOperatorClicked)
            {
                displayLabel.setText("6");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }
        else if(e.getSource() == button1)
        {
             if(isOperatorClicked)
            {
                displayLabel.setText("1");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }
        else if(e.getSource() == button2)
        {
             if(isOperatorClicked)
            {
                displayLabel.setText("2");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }
        else if(e.getSource() == button3)
        {
             if(isOperatorClicked)
            {
                displayLabel.setText("3");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }
        else if(e.getSource() == buttondot)
        {
             if(isOperatorClicked)
            {
                displayLabel.setText(".");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+".");
            }
        }
        else if(e.getSource() == buttonzero)
        {
            if(isOperatorClicked)
            {
                displayLabel.setText("0");
                isOperatorClicked=false;
            }
            else
            {
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }
        else if(e.getSource() == buttonequals)
        {
            postOperatorValue=displayLabel.getText();
            double pre=Double.parseDouble(preOperatorValue);
            double post=Double.parseDouble(postOperatorValue);
            if(Operator == "+")
            {
                result= pre+post;
            }
            else if(Operator == "-")
            {
                result= pre - post;
            }
            else if(Operator == "*")
            {
                result= pre * post;
            }
            else if(Operator == "/")
            {
                result= pre / post;
            }
            displayLabel.setText(result + "");
            isOperatorClicked=true;
        }
        else if(e.getSource() == buttondivide)
        {
            isOperatorClicked= true;
            Operator= "/";
            preOperatorValue= displayLabel.getText();
        }
        else if(e.getSource() == buttonmultiply)
        {
            isOperatorClicked= true;
            Operator= "*";
            preOperatorValue= displayLabel.getText();
        }
        else if(e.getSource() == buttonsubtract)
        {
            isOperatorClicked= true;
            Operator= "-";
            preOperatorValue= displayLabel.getText();
        }
        else if(e.getSource() == buttonadd)
        {
            isOperatorClicked= true;
            Operator= "+";
            preOperatorValue= displayLabel.getText();
        }
        else if(e.getSource() == buttonclear)
        {
            displayLabel.setText("");
            postOperatorValue= "";
            preOperatorValue= "";
        }        
    }
}