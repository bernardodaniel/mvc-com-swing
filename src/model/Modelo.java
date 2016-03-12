package model;

import java.beans.PropertyChangeListener;

import javax.swing.event.SwingPropertyChangeSupport;

public class Modelo {

	private int quantidade = 0;
	private SwingPropertyChangeSupport changeSupport;
	
	public Modelo() {
		changeSupport = 
				new SwingPropertyChangeSupport(this);
	}
	
	public void registraListners(
			PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(
				listener);
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void incrementa() {
		quantidade = ++quantidade;
		changeSupport.firePropertyChange(
				"quantidade", null, null);
	}
	
	
}
