package abstractFactoryExample.aws;

import abstractFactoryExample.Instance;
import abstractFactoryExample.Instance.Capacity;
import abstractFactoryExample.ResourceFactory;
import abstractFactoryExample.Storage;

public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorate(int storage) {
		
		return new S3Storage(storage);
	}

}
