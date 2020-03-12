package com.app.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest {

	public static void main(String[] args) {
		String url="http://localhost:3030/ProviderApp/rest/provider/msg";
		Client c=Client.create();
		WebResource wr=c.resource(url);
		ClientResponse cr=wr.get(ClientResponse.class);
		String str=cr.getEntity(String.class);
		System.out.println(str);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	}
}
