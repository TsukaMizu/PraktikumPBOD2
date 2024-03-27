package Array;
import java.util.ArrayList;

public class QueueOfPoint extends Queue {
    private ArrayList<Point> points;

    public void QueueOfPoints() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public void removePoint(Point point) {
        points.remove(point);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public Object getHead() {
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public Object getTail() {
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        } else {
            return null;
        }
    }

    public void del() {
        if (!list.isEmpty()) {
            list.remove(0);
            points.remove(0);
        }
    }

}
