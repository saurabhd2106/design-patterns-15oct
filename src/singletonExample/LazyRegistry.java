package singletonExample;

public class LazyRegistry {
	
	
	private LazyRegistry() {
	
	}

	private static LazyRegistry INSTANCE;
	
	public static LazyRegistry getInstance() {
		
		if(INSTANCE == null) {
			synchronized (LazyRegistry.class) {
				
				if(INSTANCE == null) {
					INSTANCE = new LazyRegistry();
				}
				
			}
		}
		
		return INSTANCE;
		
	}
}
