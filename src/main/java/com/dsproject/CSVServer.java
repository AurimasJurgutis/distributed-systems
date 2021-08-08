
package com.dsproject;

import io.grpc.ServerBuilder;

import java.io.IOException;

import io.grpc.Server;

public class CSVServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Server server = ServerBuilder.forPort(50051).addService(new CSVDisplayService()).build();
	
		server.start();
		
		System.out.println("Server has started!");
		
		server.awaitTermination();

	}

}
