package Entidades;

import Entidades.Cliente;
import Entidades.Producto;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2021-08-13T10:13:34")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Integer> idVenta;
    public static volatile SingularAttribute<Ventas, BigDecimal> valTotal;
    public static volatile SingularAttribute<Ventas, Cliente> numCedula;
    public static volatile SingularAttribute<Ventas, Producto> idProducto;
    public static volatile SingularAttribute<Ventas, Date> fechaVenta;
    public static volatile SingularAttribute<Ventas, Integer> cantVendida;

}