package entities;

import java.util.Date;

public class LogEntry {
	// Atributos
	private String username;
	private Date moment;
	
	// Métodos getters e settes
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	
	// Método Construtor
	public LogEntry(String username, Date moment) {
		this.username = username;
		this.moment = moment;
	}
	
	
}
