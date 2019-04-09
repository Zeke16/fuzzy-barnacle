
package Interfaces;

public class CBox implements Ibox{
    private Object objeto;
    
    public CBox(){
        this.objeto=null;
    }
    
    @Override
    public Object get(){
        return this.objeto;
    }
    
    @Override
    public void put(Object objeto){
        this.objeto = objeto;
    }

    @Override
    public void ObtenerClase(CBox cbox) {
    }
}
