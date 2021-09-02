package swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Observer {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador");
		janela.setSize(500, 200);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // centraliza no monitor
		JButton botao = new JButton("Clicar");
		janela.add(botao);

		botao.addActionListener(e -> {
			System.out.println("Evento Ocorreu !!!");
		});
		
		janela.setVisible(true);
	}

}
