package epn.com;

public class Nodo {

	////3 campos
    Object info;
    Nodo Izq;
    Nodo Der;
    
    
    public Nodo(Object Dato){//lista vacia
        this.info = Dato;
        this.Izq = null;
        this.Der = null;
    }
    
 
    public Nodo(Nodo Izq, Object Dato){//Ingresar antes
        this.Izq = Izq;
        this.info = Dato;
        this.Der = null;
    }
    
   
    public Nodo(Object Dato, Nodo Der){//ingresar despues
        this.Izq = null;
        this.info = Dato;
        this.Der = Der;
    }
    
    public  Nodo(Nodo Izq, Object Dato, Nodo Der){//lista doble 
        this.Izq = Izq;
        this.info = Dato;
        this.Der = Der;
    }
}

