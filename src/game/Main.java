package game;

import inputs.Constants;
import methods.BMath;
import types.code.Coordinate;
import types.code.Ellipse;
import types.code.LineSegment;
import types.graphics.BFrame;

public class Main {

    public static void main(String[] args) {
        // BFrame frame = new BFrame("Shooter Game 3", Constants.mainFrameWidth, Constants.mainFrameHeight);

        // frame.setVisible(true);

        Coordinate co = new Coordinate(1, 7.8);
        Ellipse el = new Ellipse(new Coordinate(7.44 ,4.57), 17.68, 10.32);
        LineSegment ls = new LineSegment(new Coordinate(0, 7.8), new Coordinate(7.8, 0));

        Coordinate[] a = BMath.intersects(ls, el);
        if(a.length > 0) System.out.println(a[0]);
        if(a.length > 1) System.out.println(a[1]);

        System.out.println(!BMath.contains(co, ls));

        co = new Coordinate(BMath.intersects(ls, el)[0]);
        System.out.println(co);

        // new Game(frame);

    }

}