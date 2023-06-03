package seminar2_homework.task2;

import seminar2_homework.task1.Actor;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor); // доступ к маркет-плейсу

    void releaseFromMarket(List<Actor> actors);

    void update();

}
