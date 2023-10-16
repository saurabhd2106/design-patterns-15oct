package factoryMethod;

import factoryMethod.message.Message;

/**
 * This is our abstract "creator". The abstract method createMessage() has to be
 * implemented by its subclasses.
 */
public abstract class MessageCreator {

	public abstract Message createMessage();

	public Message getMessage() {

		Message msg = createMessage();

		msg.encrypt();

		msg.addDefaultHeaders();

		return msg;

	}

}
