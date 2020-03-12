package com.app.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class ClientTest3 {

	public static void main(String[] args) {
		String url="http://localhost:3030/ProviderApp/rest/home2/msg";
		Client c=Client.create();
		WebResource wr=c.resource(url);
		Form f=new Form();
		f.add("eid", 25);
		f.add("ename", "sovan singh");
		f.add("esal", 3.3);
		ClientResponse cr=wr.post(ClientResponse.class, f);
		System.out.println(cr.getEntity(String.class));
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	}
}
