package game.entity.enemy;

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

    public void update(Coordinate referencePoint) {
        for(int i = 0; i < enemyList.size(); i++) enemyList.get(i).update(referencePoint);

    }

}
