package epn.com;


public class Lista {
		
    public Nodo Primero,Ultimo,Nuevo,Aux,Pos,Ant;//crear variables de enlace
    
    //constructor
    public Lista(){
        Primero = Ultimo = Nuevo = Aux = Pos = Ant = null;
    }
    //insertar al frente
    public void insertarAlFrente(int dato){
    	
		    	
    		if(Primero==null){//1 caso(lista vacia)
    	        Primero = new Nodo(dato);
    	        Ultimo = Primero;
    	        }
    	        else{
    	            Nuevo = new Nodo(Ultimo, dato);
    	            Ultimo.Der = Nuevo;
    	            Ultimo = Nuevo;
    	        }
          despliegaLista();
    
        
    }
    //insertar atraz
    public void insertarAtras(Object dato){
        if(Primero==null){
            Primero = new Nodo(dato);
            Ultimo = Primero;
        }
        else {
            Nuevo = new Nodo(dato,Primero);
            Primero.Izq=Nuevo;
            Primero = Nuevo;
        }despliegaLista();
    }
    //inseratar despues de 
    public void insertarAntesDe(Object DatoB,Object DatoI){
        if(Primero==null){
            System.out.println ("lista vacia");
        }
        else{//hay datos
            if(buscar(DatoB)== true){
                //EMPEZAR A REALIZAR EL METODO
                if(Aux==Primero){///caso 1
                Nuevo= new Nodo(DatoI,Primero);
                Primero.Izq = Nuevo;
                Primero=Nuevo;
                }
                else{//en caso de que no este al inicio de la lista
                    Nuevo = new Nodo(Ant,DatoI , Aux);
                    Aux.Izq = Nuevo;
                    Ant.Der=Nuevo;
                }
            }    
        }
        despliegaLista();
    }
   //insertar despues de 
    public void insertarDespuesDe(Object DatoB, Object DatoI){
        if(Primero==null){
            System.out.println ("lista vacia");
        }
        else{//hay metodos
            if(buscar(DatoB)== true){
                //EMPEZAR A REALIZAR EL METODO
                if(Aux==Ultimo){
                    Nuevo=new Nodo(Aux,DatoI);
                    Aux.Der=Nuevo;
                    Ultimo=Nuevo;
                }
                else{//en caso de que no este al inicio de la lista
                    Nuevo= new Nodo(Aux,DatoI,Aux.Der);
                    Aux.Der = Nuevo;
                    Pos = Aux.Der;
                    Pos.Izq =Aux.Der;
                }
                
            }
        }despliegaLista();
    }
    //elimianar nodo
    public void eliminarNodo(Object DatoB){
        if(Primero==null){
            System.out.println ("lista vacia");
        }
        else{
            if(buscar(DatoB)==true){///hacer cuatro casos
                if(Primero==Ultimo){//// 1 caso
                    Primero=Ultimo=null;
                }
                else if(Aux==Primero){//2caso
                    Primero=Aux.Der;
                    Primero.Izq=Aux=null;
                }
                else if(Aux==Ultimo){//3 caso
                    Ultimo=Ant;
                    Ultimo.Der=Aux=null;
                }
                else{//4 caso
                    Ant.Der=Pos;
                    Pos.Izq=Ant;
                    Aux=null;
                }
            }
        }despliegaLista();
    }
        
    //buscar datos 
    public boolean  buscar(Object DatoB){
        Aux = Primero;
        boolean bandera = false;
        while (Aux != null && bandera != true) {
            if(DatoB.equals(Aux.info)){// si encuentra el dato //la funcion .equals sirve para comparar el contenido de una direccion de memoria
                bandera = true;
            }
            else{//apunta al siguiente nodo
                Ant = Aux;
                Aux = Aux.Der;
                Pos = Aux.Der;
            }
        }
        if(bandera == true){
            return true;
        }
        else{
            System.out.println ("ese dato no existe");
            return false;
        }
    }
  //desplegar en pantalla
    public  void despliegaLista(){
        Aux = Primero;
        System.out.println ("LISTA COMPLETA\n-------------------");
        while (Aux != null) {
        	System.out.println (Aux.info);
            Aux = Aux.Der;
        }
        System.out.println ("-------------------");
    }
			
	}
