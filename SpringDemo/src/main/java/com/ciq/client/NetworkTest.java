package com.ciq.client;

import com.ciq.springdemo.Airtel;
import com.ciq.springdemo.Container;
import com.ciq.springdemo.Network;

public class NetworkTest {
	public static void main(String[] args) {
	//	Network e=new Airtel();
		Airtel e=new Airtel();
		e.call();
		e.sms();
		e.data();
		Container c=new Container();
		Network n=(Network) c.getContainer("network");
		n.call();
		n.sms();
		n.data();
	}

}
