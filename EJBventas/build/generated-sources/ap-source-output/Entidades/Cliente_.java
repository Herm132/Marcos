package Entidades;

import Entidades.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2021-08-13T10:13:34")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile CollectionAttribute<Cliente, Ventas> ventasCollection;
    public static volatile SingularAttribute<Cliente, String> usuario;
    public static volatile SingularAttribute<Cliente, String> numCedula;
    public static volatile SingularAttribute<Cliente, String> apellidosNombres;
    public static volatile SingularAttribute<Cliente, String> clave;

}