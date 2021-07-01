package br.ucsal.flappybird;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

public class Resolucao extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	Menu botaoresolucao = new Menu();
	Principal principal = new Principal();
	private JButton resolucao1 = new JButton("1280 x 720");
	private JButton resolucao2 = new JButton("854 x 480");
	private JButton resolucao3 = new JButton("426 x 240");
	private JPanel thiiis;
	public Resolucao() {
		
		botaoresolucao.setPanel(this);
		
		this.opcoes();
	}
 
	 public void opcoes () {
	    this.setSize(800,700); // tamanho da janela
	    this.add(new Resolucao());
		 resolucao1.setBackground(Color.GREEN);resolucao1.setBackground(Color.GREEN);resolucao1.setBackground(Color.GREEN);
		 resolucao2.setForeground(Color.WHITE);resolucao2.setForeground(Color.WHITE);resolucao2.setForeground(Color.WHITE);
		 resolucao3.setForeground(Color.WHITE);resolucao3.setForeground(Color.WHITE);resolucao3.setForeground(Color.WHITE);
		 resolucao1.setFont(new FontUIResource("SansSerif",Font.BOLD, 18));
		 resolucao2.setFont(new FontUIResource("SansSerif",Font.BOLD, 18));
		 resolucao3.setFont(new FontUIResource("SansSerif",Font.BOLD, 18));
	     	
	     	
	     	//posição x e y e largura e altura
		 resolucao1.setBounds(325, 290, 540, 80);
		 resolucao2.setBounds(325, 400, 540, 80);
		 resolucao3.setBounds(325, 500, 540, 80);
		 
	
		 
	 }
	
		public void setPanel(JPanel thiiis) {
			this.thiiis = thiiis;
			
			resolucao1.addActionListener((ActionListener) thiiis);
			resolucao2.addActionListener((ActionListener) thiiis);
			resolucao3.addActionListener((ActionListener) thiiis);
		}

		public void actionPerformed(ActionEvent e) {
			this.add(new Resolucao());

				}
			
		
		
}
	 
	 
