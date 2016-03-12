package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class View extends JFrame {

	private JPanel contentPane;
	private JButton btnIncrementar = new JButton("Incrementar");
	private JLabel lblQuantidade = new JLabel("");
	
	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 215, 134);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.add(btnIncrementar, BorderLayout.SOUTH);
		contentPane.add(lblQuantidade, BorderLayout.NORTH);
	}
	
	public JButton getBtnIncrementar() {
		return btnIncrementar;
	}
	
	public JLabel getLblQuantidade() {
		return lblQuantidade;
	}
	
	public void atualizaQuantidade(Integer quant) {
		lblQuantidade.setText(quant.toString());
		lblQuantidade.repaint();
	}

}
