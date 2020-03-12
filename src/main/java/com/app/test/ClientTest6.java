package com.app.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest6 {

	public static void main(String[] args) {
		String url="http://localhost:3030/ProviderConsumerAnnotation/rest/hello1/msg1";
		Client c=Client.create();
		WebResource wr=c.resource(url);
		ClientResponse cr=wr.get(ClientResponse.class);
		System.out.println(cr.getEntity(String.class));
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		System.out.println(cr.getType());
	}
}
