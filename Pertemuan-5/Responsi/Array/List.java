package Array;

import java.util.ArrayList;

public abstract class List {
    protected ArrayList<Object> list;

    public List() {
        list = new ArrayList<>();
    }

    public Object getElement(int i) {
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        } else {
            return null;
        }
    }

    public int getSize() {
        return list.size();
    }

    public void add(Object e) {
        list.add(e);
    }

    public abstract void del();

    public void cetak() {
        for (Object e : list) {
            System.out.println(e);
        }
    }
}
