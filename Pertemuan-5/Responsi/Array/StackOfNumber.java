package Array;
class StackOfNumber extends Stack {
    public Object getTop(){
        if(!list.isEmpty()){
            return list.get(list.size()-1);
        }
        else{
            return null;
        }
    }
    
    public boolean cekElmtType(Object elmt){
        return (elmt instanceof Integer);
    }

    public void del(){
        if (!list.isEmpty()){
            list.remove(list.size()-1);
        }
    }

}
