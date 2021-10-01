package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Juego_Palitos {
	
	
	public static void main(String[] args) {
		
		
		      MarcoJuego mimarco= new MarcoJuego();
	         mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         mimarco.setVisible(true);

		
		
	}

}

class MarcoJuego extends JFrame{

    public MarcoJuego(){
      setTitle("Juego Palitos");
      setBounds(300,300,500,300);
      setLayout(new BorderLayout());
      acumulado=21;
      jugador_1=1;
      jugador_2=2;
      
      JButton botonJuega1=new JButton("Juega jugador: "   +  jugador_1);	
      JButton botonJuega2=new JButton("Juega jugador: "   +  jugador_2);
      add(botonJuega1,BorderLayout.EAST);
      add(botonJuega2,BorderLayout.WEST);
     // quien_letoca= new JTextArea(4,10);
      //quien_letoca.setEditable(false);
     // add(quien_letoca, BorderLayout.CENTER);
      
      botonJuega1.addActionListener(new ActionListener(){
          
          public void actionPerformed(ActionEvent arg0){
                     
        	   
        	   cantidad_sel = Integer.parseInt(JOptionPane.showInputDialog("Selecciona 1 o 2 palitos Jugador 1: "));
      		          	  
        	   acumulado=acumulado-cantidad_sel;      	   
        	           	                    	   
        	   
               if(acumulado==0 || acumulado==-1) {
            	  
            	   JOptionPane.showMessageDialog(null, "Ganador Jugador : " + jugador_2);
               }
        	   
              	   
          }
          
      });
      
      
  botonJuega2.addActionListener(new ActionListener(){
          
          public void actionPerformed(ActionEvent arg0){
                     
        	   
        	   cantidad_sel = Integer.parseInt(JOptionPane.showInputDialog("Selecciona 1 o 2 palitos Jugador 2: "));
      		          	  
        	   acumulado=acumulado-cantidad_sel;      	   
        	           	                    	   
        	   
               if(acumulado==0 || acumulado==-1) {
            	  
            	   JOptionPane.showMessageDialog(null, "Ganador Jugador : " + jugador_1);
               }
        	   
              	   
          }
          
      });
      
     
      //
      
     
   }
    


	private int jugador_1;
	
	private int jugador_2;
    
    private int acumulado;
    
    private int cantidad_sel;
    

 }



   