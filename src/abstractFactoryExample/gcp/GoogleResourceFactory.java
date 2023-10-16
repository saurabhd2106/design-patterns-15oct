package abstractFactoryExample.gcp;

import abstractFactoryExample.Instance;
import abstractFactoryExample.Instance.Capacity;
import abstractFactoryExample.ResourceFactory;
import abstractFactoryExample.Storage;

public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorate(int storage) {
		
		return new GoogleCloudStorage(storage);
	}

}
