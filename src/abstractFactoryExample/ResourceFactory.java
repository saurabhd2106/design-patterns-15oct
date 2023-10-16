package abstractFactoryExample;

public interface ResourceFactory {

	Instance createInstance(Instance.Capacity capacity);

	Storage createStorate(int storage);

}
