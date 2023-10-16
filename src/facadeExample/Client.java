package facadeExample;

import facadeExample.email.Email;
import facadeExample.email.Mailer;
import facadeExample.email.Stationary;
import facadeExample.email.StationaryFactory;
import facadeExample.email.Template;
import facadeExample.email.Template.TemplateType;
import facadeExample.email.TemplateFactory;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);

		boolean result = sendOrderEmailWithoutFacade(order);

		System.out.println("Order Email " + (result ? "sent!" : "NOT sent..."));

	}

	private static boolean sendOrderEmailWithoutFacade(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder().withTemplate(template).withStationary(stationary).forObject(order).build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}

}
