package com.dsproject;

import javax.swing.JFrame;

import com.dsproject.displayCSVGrpc.displayCSVImplBase;

import dsca.project.CSVDisplayGUI;
import io.grpc.stub.StreamObserver;

public class CSVDisplayService extends displayCSVImplBase {

	@Override
	public void display(displayRequest request, StreamObserver<displayResponse> responseObserver) {
		
		System.out.println("Display in progress!");
		
		String display = request.getDisplay();
		display = "Display";
		
		displayResponse.Builder response = displayResponse.newBuilder();
		
		if (display == "Display") {
			
			response.setDrResponseCode(0).setDrResponse("SUCCESS");
			System.out.println(response.setDrResponse("SUCCESS"));
			CSVDisplayGUI dp = new CSVDisplayGUI();
			dp.createAndShowGUI();
			
		} else {
			System.out.println("Display unsuccessful, use keyword 'Display' to display the process");
		}
	}

	@Override
	public void terminateDisplay(tdRequest request, StreamObserver<tdResponse> responseObserver) {
		
		System.out.println("Display termination in progress...");
		
		String terminate = request.getTerminate();
		terminate = "Terminate";
		tdResponse.Builder trresponse = tdResponse.newBuilder();
		
		if (terminate == "Terminate") {
			
			trresponse.setTrResponseCode(0).setTerResponse("SUCCESS");
			System.exit(0);
			
		} else {
			System.out.println("Display termination unsuccessful, use keyword 'Terminate' to terminate the process");
		}
	} 
	

	
	
}
