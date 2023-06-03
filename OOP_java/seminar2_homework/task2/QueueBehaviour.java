package seminar2_homework.task2;

import seminar2_homework.task1.Actor;

public interface QueueBehaviour {

    void takeInQueue(Actor actor); // очередь

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

}
