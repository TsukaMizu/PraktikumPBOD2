package Array;


class QueueOfNumber extends Queue{
    public Object getHead(){
        if(!list.isEmpty()){
            return list.get(0);
        }
        else{
            return null;
        }
    }

    public Object getTail(){
        if(!list.isEmpty()){
            return list.get(list.size()-1);
        }
        else{
            return null;
        }
    }

    public void del(){
        if(!list.isEmpty()){
            list.remove(0);
        }
    }
}
