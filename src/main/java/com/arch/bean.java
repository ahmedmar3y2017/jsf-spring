package com.arch;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@ManagedBean(eager = true)
// @SessionScoped
@Component("bean")
@Scope(FacesViewScope.NAME)
public class bean {

	private String username;

	@PostConstruct
	public void init() {
		username = "ahmed mar3y";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void display() {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Executed", "Hello : " + username));

	}

}
