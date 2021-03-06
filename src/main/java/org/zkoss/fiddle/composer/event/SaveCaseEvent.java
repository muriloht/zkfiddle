package org.zkoss.fiddle.composer.event;

import org.zkoss.zk.ui.event.Event;


public class SaveCaseEvent extends Event{

	/**
	 *
	 */
	private static final long serialVersionUID = -3824637295049138682L;
	private boolean fork = false;
	
	protected SaveCaseEvent(String name,boolean fork) {
		super(name);
		this.fork = fork;
	}

	public SaveCaseEvent(boolean fork) {
		this(FiddleEvents.ON_SAVE_CASE,fork);
	}

	public SaveCaseEvent() {
		this(false);
	}

	public boolean isFork() {
		return fork;
	}

	public void setFork(boolean fork) {
		this.fork = fork;
	}
}
