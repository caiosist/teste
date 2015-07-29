package session;

import java.util.Date;
import java.util.List;

import br.com.jbc.controller.Controller;
import entities.Cliente;

public class SessionCliente {

	private Controller<Cliente> controller = new Controller<Cliente>();

	public Controller<Cliente> getController() {
		return controller;
	}

	public void setController(Controller<Cliente> controller) {
		this.controller = controller;
	}

	public boolean save(Cliente cliente) {
		if (this.validaCliente(cliente)) {
			cliente.setCriacao(new Date());
			cliente.setAlteracao(new Date());
			try {
				this.controller.insert(cliente);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}

	public boolean update(Cliente cliente) {
		if (this.validaCliente(cliente)) {
			cliente.setAlteracao(new Date());
			try {
				this.controller.update(cliente);
				return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean remove(Cliente cliente) throws Exception {
		this.controller.delete(cliente);
		return true;
	}

	public boolean validaCliente(Cliente cliente) {
		// if ((cliente.getCliente() == null) ||
		// (cliente.getCliente().equals(""))) {
		// Mensagem.msgCliente();
		// return false;
		// }
		//
		// if ((cliente.getDdi() == null) || (cliente.getDdi().equals(""))) {
		// Mensagem.msgDdi();
		// return false;
		// }
		//
		// if ((cliente.getSigla() == null) || (cliente.getSigla().equals("")))
		// {
		// Mensagem.msgSigla();
		// return false;
		// }
		return true;
	}

	public List<Cliente> findList(Cliente cliente) {
		try {
			return controller.findList(cliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Cliente find(Cliente cliente) {

		try {
			return this.controller.find(cliente, Controller.SEARCH_EQUALS_STRING);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
