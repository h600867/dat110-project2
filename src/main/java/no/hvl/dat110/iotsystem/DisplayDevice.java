package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to

		Client klient = new Client("display", Common.BROKERHOST, Common.BROKERPORT);

		// - connect to the broker - use "display" as the username

		klient.connect();

		// - create the temperature topic on the broker

		klient.createTopic(Common.TEMPTOPIC);

		// - subscribe to the topic

		klient.subscribe(Common.TEMPTOPIC);

		// - receive messages on the topic

		for(int i = 0; i < COUNT; i++){

			klient.receive();

		}

		// - unsubscribe from the topic

		klient.unsubscribe(Common.TEMPTOPIC);

		// - disconnect from the broker

		klient.disconnect();
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
	}
}
