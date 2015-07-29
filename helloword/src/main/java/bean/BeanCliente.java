package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mensagem.Mensagem;

import org.primefaces.context.RequestContext;

import session.SessionCliente;
import entities.Cliente;

@ManagedBean
@SessionScoped
public class BeanCliente {

	private Cliente cliente = new Cliente();

	private Cliente selected = new Cliente();

	private Cliente filtro = new Cliente();

	private List<Cliente> clientes = new ArrayList<Cliente>();

	private SessionCliente session = new SessionCliente();

	// //////////////////////////CONSTRUCTOR//////////////////////////////////////
	// ///////////////////////////////////////////////////////////////////////////

	public BeanCliente() {
		// this.carregaCliente();
	}

	// //////////////////////////CONSTRUCTOR//////////////////////////////////////
	// ///////////////////////////////////////////////////////////////////////////

	public SessionCliente getSession() {
		return session;
	}

	public void setSession(SessionCliente session) {
		this.session = session;
	}

	public Cliente getFiltro() {
		return filtro;
	}

	public void setFiltro(Cliente filtro) {
		this.filtro = filtro;
	}

	public Cliente getSelected() {
		return selected;
	}

	public void setSelected(Cliente selected) {
		this.selected = selected;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// ******************************METODOS******************************
	// ***********************************************************************************
	// ******************************************************************************************

	public void reinit() {

		this.cliente = new Cliente();
		this.filtro = new Cliente();
		this.selected = new Cliente();
		this.clientes = new ArrayList<Cliente>();

	}

	public String save() throws Exception {
		RequestContext context = RequestContext.getCurrentInstance();
		boolean sucesso = false;

		if (this.cliente.getId() != null) {
			return this.update();
		}
		if (this.session.validaCliente(this.cliente)) {
			if (this.session.save(cliente)) {
				this.reinit();
				Mensagem.msgSave();
				sucesso = true;
				context.addCallbackParam("sucesso", sucesso);
				return "";
			}
		}
		context.addCallbackParam("sucesso", sucesso);
		return "getCliente";
	}

	public String update() {
		RequestContext context = RequestContext.getCurrentInstance();
		boolean sucesso = false;

		if (this.session.validaCliente(this.cliente)) {
			if (this.session.update(this.cliente)) {
				this.reinit();
				this.carregaCliente();
				sucesso = true;
				context.addCallbackParam("sucesso", sucesso);
				return Mensagem.msgUpdate();
			}
		}
		context.addCallbackParam("sucesso", sucesso);
		return null;

	}

	public String remove() {
		try {
			this.session.remove(this.cliente);
			this.reinit();
			this.carregaCliente();
			return Mensagem.msgRemove();
		} catch (Exception e) {
			return Mensagem.msgNotRemove();
		}
	}

	public void carregaCliente() {
		this.clientes = this.session.findList(new Cliente());
	}

	public void find() throws Exception {
		this.clientes = this.session.findList(this.filtro);
	}

	public void novo() {
		this.setCliente(new Cliente());
	}
}