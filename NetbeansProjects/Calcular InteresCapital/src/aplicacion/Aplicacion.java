package aplicacion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aplicacion extends JFrame implements ActionListener{
    private JLabel etq[];
    private JTextField cdt[];
    private JButton bt[];
    private Color c1;
    private Container d;
    
    public Aplicacion (){
        etq=new JLabel[7];
        cdt=new JTextField[3];
        bt=new JButton[2];
        d =this.getContentPane();
        
        etq[0]=new JLabel("E.P.N. Proyecto Basico");
        etq[1]=new JLabel("Capital");
        etq[2]=new JLabel("Interes");
        etq[3]=new JLabel("Periodo");
        etq[4]=new JLabel("Resultado");
        etq[5]=new JLabel("0");
        etq[6]=new JLabel("Listo...");
        
        cdt[0]=new JTextField();
        cdt[1]=new JTextField();
        cdt[2]=new JTextField();
        
        bt[0]=new JButton("Limpiar");
        bt[1]=new JButton("Calcular");
        
        etq[0].setBounds(10,5,605,50);
        etq[1].setBounds(10,55,300,50);
        etq[2].setBounds(10,105,300,50);
        etq[3].setBounds(10,155,300,50);
        etq[4].setBounds(10,205,300,50);
        etq[5].setBounds(315,205,300,50);
        etq[6].setBounds(10,355,605,50);
        
        cdt[0].setBounds(315,55,300,50);
        cdt[1].setBounds(315,105,300,50);
        cdt[2].setBounds(315,155,300,50);
        
        bt[0].setBounds(10,255,300,50);
        bt[1].setBounds(315,255,300,50);
        
        this.setBounds(0,0,625,440);
        d.setLayout(null);
        for(int i=0;i<7;i++){
            d.add(etq[i]);
        }
        for(int j=0;j<3;j++){
            d.add(cdt[j]);
        }
        d.add(bt[0]);
        d.add(bt[1]);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bt[0].addActionListener(this);
        bt[1].addActionListener(this);
        
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){ 
        Object fuente=e.getSource();
        if(fuente==bt[0]){
            cdt[0].setText("");
            cdt[1].setText("");
            cdt[2].setText("");
            etq[5].setText("");
        }else if(fuente==bt[1]){
            String x =cdt[0].getText();
            double y =Double.parseDouble(x);
            String x1 =cdt[1].getText();
            double y1 =Double.parseDouble(x1);
            String x2 =cdt[2].getText();
            double y2 =Double.parseDouble(x2);
            double y3=y*Math.pow(1+y1,y2);
            etq[5].setText("" + y3);
        }  
    }
}
