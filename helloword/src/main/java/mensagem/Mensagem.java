package mensagem;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Mensagem {

	public static String msgSave() {
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Pais Criado com sucesso", ""));
		return "";
	}

	public static String msgRemove() {
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Pais Excluido com sucesso", ""));
		return "";
	}

	public static String msgNotRemove() {
		FacesContext
				.getCurrentInstance()
				.addMessage(
						null,
						new FacesMessage(
								FacesMessage.SEVERITY_ERROR,
								"Não é possivel excluir o pais selecionado. O pais esta relacionado a um ou mais Estados!",
								""));
		return "";
	}

	public static String msgUpdate() {
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Pais atualizado com sucesso!", ""));
		return "";
	}

	public static String msgPais() {
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"O nome do País é obrigatorio!", ""));
		return "";
	}

	public static String msgSigla() {
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"A Sigla do País é obrigatoria!", ""));
		return "";
	}

	public static String msgDdi() {
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"O DDI do País é obrigatorio!", ""));
		return "";
	}
}
