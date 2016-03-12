package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JOptionPane;

import model.Modelo;
import view.View;

public class Controlador implements PropertyChangeListener {

	private Modelo modelo;
	private View view;
	
	public Controlador(Modelo modelo, View view) {
		this.modelo = modelo;
		this.view = view;
		
		registraAcoes();
		modelo.registraListners(this);
	}
	
	private void registraAcoes() {
		view.getBtnIncrementar()
			.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							modelo.incrementa();
						}
					});
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		view.atualizaQuantidade(modelo.getQuantidade());
		
	}
	
	
}
