package com.rme.sgip.mb;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "resetInputView")
public class InputView {

	private String text1;

	private String text2;

	private String text3;

	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public String getText3() {
		return text3;
	}

	public void setText3(String text3) {
		this.text3 = text3;
	}

	public void save() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Data Saved"));
	}

	public void reset() {
		RequestContext.getCurrentInstance().reset("form:panel");
	}

	public void resetFail() {
		this.text1 = null;
		this.text2 = null;

		FacesMessage msg = new FacesMessage("Model reset, but it won't work properly.");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}