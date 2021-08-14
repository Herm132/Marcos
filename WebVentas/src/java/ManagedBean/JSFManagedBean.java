/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import Entidades.Cliente;
import Sesiones.ClienteFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author pc1
 */
@ManagedBean(name = "JSFManagedBean")
@SessionScoped
public class JSFManagedBean implements Serializable {

    @EJB
    private ClienteFacadeLocal managedCliente;
    private List<Cliente> listaCliente;
    private Cliente cliente;

    public JSFManagedBean() {
    }

    public void listarClientes() {
        setListaCliente(managedCliente.findAll());
        
    }

    public void grabarCliente() {

        managedCliente.create(cliente);
    }

    @PostConstruct
    private void inicio() {
        cliente = new Cliente();
        listarClientes();
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
