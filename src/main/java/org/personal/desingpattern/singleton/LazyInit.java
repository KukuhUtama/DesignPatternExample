package org.personal.desingpattern.singleton;

public class LazyInit {
	private static LazyInit instance;

	private LazyInit() {
	}

	public static LazyInit getInstance() {
		if (instance == null) {
			synchronized(LazyInit.class){
				if(instance == null){
					instance = new LazyInit();
				}
			}
		}
		return instance;
	}
}