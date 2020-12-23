package game.entity.enemy;

import game.entity.Entity;
import inputs.Constants;
import types.code.Coordinate;
import types.graphics.BLabel;

import javax.swing.*;
import java.util.ArrayList;

public class EnemyList extends BLabel {

    private ArrayList<Enemy> enemyList;

    public EnemyList(JComponent superComp) {
        super(superComp);
        setSize(Constants.mainFrameWidth, Constants.mainFrameHeight);
        setBounds(0, 0);
        enemyList = new ArrayList<>();
        add();

    }

    public void add() {
        enemyList.add(new Enemy(this));
        add(enemyList.get(enemyList.size() - 1));

    }

    public void remove(int index) {
        remove(enemyList.get(index));
        enemyList.remove(index);
    }

    public void update(Coordinate referencePoint) {
        for(int i = enemyList.size() - 1; i >= 0; i--) {
            if(enemyList.get(i).getState() == Entity.State.DEAD) {
                remove(i);
            } else enemyList.get(i).update(referencePoint);
        }

    }

}
