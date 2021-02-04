
package epn.edu;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener{
    private JRadioButton a;
    private JRadioButton b;
    private JRadioButton r;
    private JTextField w;
    private JTextField h;
    private JScrollPane js;
    private JPanel jp;
    private JTextField c[][];
    private JButton crear;
    private JButton agregar;
    private JButton sumar;
    private ButtonGroup g;
    private Container p;
			
    public Ventana(){
	a=new JRadioButton("Matriz A");
	b=new JRadioButton("Matriz B");
	r=new JRadioButton("Matriz R");
	w=new JTextField("5");
	h=new JTextField("5");
	js=new JScrollPane();
	jp=new JPanel();
	crear=new JButton("Crear");
	agregar=new JButton("Agregar");
	sumar=new JButton("Sumar");
	g=new ButtonGroup();
	p=this.getContentPane();
	p.setLayout(null);
		
	this.setBounds(0,0,800,600); 
	a.setBounds(0,0,130,25);
	b.setBounds(130,0,130,25);
	r.setBounds(260,0,130,25);
	w.setBounds(390,0,130,25);
	h.setBounds(520,0,130,25);
	crear.setBounds(650,0,130,25);
	agregar.setBounds(650,25,130,25);
	sumar.setBounds(650,50,130,25);
	js.setBounds(0,25,650,450);
	p.add(a);
	p.add(b);
	p.add(r);
	p.add(w);
	p.add(h);
	p.add(js);
	p.add(crear);
	p.add(agregar);
	p.add(sumar);
	g.add(a);
	g.add(b);
	g.add(r);
	agregar.addActionListener(this);
	crear.addActionListener(this);
	sumar.addActionListener(this);
		
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
    }
    
public void actionPerformed(ActionEvent e){
	Object fuente=e.getSource();
		if (fuente== crear){
                    String w1= w.getText();
                    int w2= Integer.parseInt(w1);
                    String h1= h.getText();
                    int h2= Integer.parseInt(h1);
			
                    jp=new JPanel();
                    jp.setBounds(0, 0, w2*50, h2*25);
                    js.setViewportView(jp);
                    jp.setLayout(null);
  			
                    c=new JTextField [w2][h2];
  			
                    for(int i=0 ; i<w2 ; i++){
  			for (int j=0; j<h2; j++){
  					
                            c[i][j]= new JTextField("0");
                            c[i][j].setBounds(50*j, 25*i,50,25);
                            jp. add(c[i][j]);  					
  			}
                    }
		}
            System.out.println(fuente);
	}
}
