package game.entity.enemy;

import types.graphics.BLabel;

import javax.swing.*;
import java.util.ArrayList;

public class EnemyList extends BLabel {

    private ArrayList<Enemy> enemyList;

    public EnemyList(JComponent superComp) {
        super(superComp);
        enemyList = new ArrayList<>();

    }

}
