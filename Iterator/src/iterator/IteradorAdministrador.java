package iterator;

public class IteradorAdministrador {
    
    Administradores admin;
    private int contador;
    
    public IteradorAdministrador(Administradores admin){
        this.admin=admin;
        this.contador=0;
    }

    public Object next() throws Exception{
        if(!this.hasNext()){
            this.contador=0;
        }
        this.contador++;
        return(this.admin.get(contador-1));
    }

    public boolean hasNext() {
        if(contador>=this.getSize()){
            return(false);
        }else{
            return(true);
        }
    }

    public int getSize() {
        return(this.admin.getSize());
    }

    public void remove(String nombre) throws Exception {
        this.admin.remove(nombre);
    }
    
}
