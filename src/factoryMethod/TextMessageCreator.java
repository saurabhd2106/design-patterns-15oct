package factoryMethod;

import factoryMethod.message.Message;
import factoryMethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		
		return new TextMessage();
	}

}
