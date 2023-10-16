package factoryMethod;

import factoryMethod.message.JSONMessage;
import factoryMethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JsonMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		
		JSONMessage jsonMessage = new JSONMessage();
		
		return jsonMessage;
	}

}
