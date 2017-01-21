package org.personal.design.singleton;

public class EagerInit {
	private static volatile EagerInit instance = new EagerInit();

	private EagerInit() {
	}

	public static EagerInit getInstance() {
		return instance;
	}
}