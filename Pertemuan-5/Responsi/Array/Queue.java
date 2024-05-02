package Array;

public abstract class Queue extends List {
    public Queue(){

    }

    public Object getHead(){
        return getElement(0);
    }

    public Object getTail(){
        return getElement(getSize()-1);
    }

    @Override
    public void del(){
        list.removeFirst();
    }

    @Override
    public void cetak(){
        int i;
        for(i=0; i<getSize(); i++){
            System.out.println(getElement(i));
        }
    }
    
}
