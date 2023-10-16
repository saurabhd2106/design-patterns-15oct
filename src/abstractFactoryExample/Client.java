package abstractFactoryExample;

import abstractFactoryExample.Instance.Capacity;
import abstractFactoryExample.aws.AwsResourceFactory;
import abstractFactoryExample.gcp.GoogleResourceFactory;

public class Client {

	private ResourceFactory factory;

	public Client(ResourceFactory factory) {
		this.factory = factory;
	}

	public Instance createServer(Instance.Capacity cap, int storageInBytes) {

		Instance instance = factory.createInstance(cap);

		Storage storage = factory.createStorate(storageInBytes);

		instance.attachStorage(storage);

		return instance;
	}

	public static void main(String[] args) {

		Client aws = new Client(new AwsResourceFactory());

		Instance awsInstance = aws.createServer(Capacity.micro, 2048);

		awsInstance.start();

		awsInstance.stop();
		
		
		System.out.println("----------------------");
		
		Client gcp = new Client(new GoogleResourceFactory());
		
		Instance gcpInstance = gcp.createServer(Capacity.micro, 2048);

		gcpInstance.start();

		gcpInstance.stop();

	}

}
