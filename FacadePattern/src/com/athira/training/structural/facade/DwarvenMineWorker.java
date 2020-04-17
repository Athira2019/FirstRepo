
package com.cerner.training.structural.facade;


/**
 * 
 * DwarvenMineWorker is one of the goldmine subsystems.
 *
 */
public abstract class DwarvenMineWorker {

 

  public void goToSleep() {
    System.out.println("{} goes to sleep."+ name());
  }

  public void wakeUp() {
	  System.out.println("{} wakes up."+ name());
  }

  public void goHome() {
	  System.out.println("{} goes home."+ name());
  }

  public void goToMine() {
	  System.out.println("{} goes to the mine."+ name());
  }

  private void action(Action action) {
    switch (action) {
      case GO_TO_SLEEP:
        goToSleep();
        break;
      case WAKE_UP:
        wakeUp();
        break;
      case GO_HOME:
        goHome();
        break;
      case GO_TO_MINE:
        goToMine();
        break;
      case WORK:
        work();
        break;
      default:
    	  System.out.println("Undefined action");
        break;
    }
  }

  /**
   * Perform actions
   */
  public void action(Action... actions) {
    for (Action action : actions) {
      action(action);
    }
  }

  public abstract void work();

  public abstract String name();

  enum Action {
    GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
  }
}
