package Array;

abstract class Stack extends List {
    protected Stack(){

    }

    public Object getTop(){
        return getElement(getSize()-1);
    }
    
    @Override
    public void del(){
        list.removeLast();
    }
    
    @Override
    public void cetak(){
        int i;
        for(i=getSize()-1; i >= 0; i--){
            System.out.println(getElement(i));
    }
    }
}
