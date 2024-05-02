package Array;

class QueueOfPoint extends Queue {
    public QueueOfPoint(){
    }
    
    @Override
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Point);
    }
    
    @Override
    public void cetak(){
        int i;
        for(i=0; i < getSize(); i++){
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
    public Point getHead(){
       return (Point)super.getHead();
    }
    
    @Override
    public Point getTail(){
       return (Point)super.getTail();
    }
}
