package com.app.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest2 {

	public static void main(String[] args) {
		String url="http://localhost:3030/ProviderApp/rest/home1/msg;eid=101;ename=raju;esal=25000.0";
		Client c=Client.create();
		WebResource wr=c.resource(url);
		ClientResponse cr=wr.get(ClientResponse.class);
		System.out.println(cr.getEntity(String.class));
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	}
}
