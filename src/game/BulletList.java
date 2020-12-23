package game;

import inputs.Constants;
import types.code.*;
import types.graphics.BLabel;

import javax.swing.*;
import java.util.ArrayList;

public class BulletList extends BLabel {

    private ArrayList<Bullet> bulletList;

    public BulletList(JComponent game) {
        super(game);
        setSize(Constants.bkgImg);
        setBounds(0, 0);

        bulletList = new ArrayList<>();

    }

    public void add(Coordinate startLoc, Velocity velocity) {
        bulletList.add(new Bullet(this, startLoc, velocity));
        add(bulletList.get(bulletList.size() - 1));
    }

    public void update(Coordinate referencePoint) {
        setBounds(-referencePoint.getX(), -referencePoint.getY());
        for(int i = 0; i < bulletList.size(); i++) bulletList.get(i).update();

    }

}
