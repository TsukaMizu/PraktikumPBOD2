package Array;

class StackOfPoint extends Stack {
    public StackOfPoint(){
    }
    
    //method
    @Override
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Point);
    }
    
    @Override
    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            if(getElement(i) instanceof Point P){
                P.cetak();
            }
        }
    }
    
    @Override
    public Point getElement(int i){
       return (Point)super.getElement(i);
    }
    
    @Override
    public Point getTop(){
       return (Point)super.getTop();
    } 
}
