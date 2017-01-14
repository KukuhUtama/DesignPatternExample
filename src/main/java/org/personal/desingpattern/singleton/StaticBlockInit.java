package org.personal.desingpattern.singleton;

public class StaticBlockInit {
	private static StaticBlockInit instance;

	private StaticBlockInit() {
	}

	static {
		try {
			instance = new StaticBlockInit();
		} catch (Exception ex) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public StaticBlockInit getInstance() {
		return instance;
	}
}