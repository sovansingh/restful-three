package com.app.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class CientTest4 {
	public static void main(String[] args) {
		String url="http://localhost:3030/ProviderApp/rest/home4/msg";
		Client c=Client.create();
		WebResource wr=c.resource(url);
		ClientResponse cr=wr.header("user", "admin")
				.header("user", "sovan")
				.header("pwd", "abc")
				.header("pwd", "xyz")
				.get(ClientResponse.class);
		System.out.println(cr.getEntity(String.class));
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	}
}
