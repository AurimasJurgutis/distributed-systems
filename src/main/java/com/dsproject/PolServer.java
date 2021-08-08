
package com.dsproject;

import io.grpc.ServerBuilder;

import java.io.IOException;

import io.grpc.Server;

public class PolServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Server server2 = ServerBuilder.forPort(50051).addService(new PollutantGUIService()).build();
		
		server2.start();
		
		System.out.println("Server has started!");
		
		server2.awaitTermination();
		
	}

}
