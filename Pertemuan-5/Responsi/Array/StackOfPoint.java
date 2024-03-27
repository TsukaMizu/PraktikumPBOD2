package Array;

import java.util.ArrayList;

class StackOfPoint extends Stack {
    private ArrayList<Point> points;

    public StackOfPoint(){
        points = new ArrayList<>();
    }

    public void addPoint(Point point){
        points.add(point);
    }

    public void removePoint(Point point){
        points.remove(point);
    }

    public ArrayList<Object> getPoint(){
        return list;
    }

    public Object getTop(){
        if(!list.isEmpty()){
            return list.get(list.size()-1);
        }
        else{
            return null;
        }
    }

    public void del(){
        if(!list.isEmpty()){
            list.remove(list.size()-1);
            points.remove(points.size()-1);
        }
    }  
}
