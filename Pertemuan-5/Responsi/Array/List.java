package Array;

import java.util.ArrayList;

public abstract class List {
    protected ArrayList<Object> list;

    List() {
        list = new ArrayList<>();
    }

    public Object getElement(int i){
        return list.get(i);
    }

    public int getSize() {
        return list.size();
    }

    public abstract boolean cekElmtType(Object e);

    public void add(Object e) throws Exception {
        if(cekElmtType(e)){
            list.addLast(e);
        }
        else{
            throw new Exception("Tipe Elemen tidak sesuai !");
        }
    }

    public abstract void del();

    public abstract void cetak();
}
