package com.dsproject;

import javax.swing.JFrame;

import com.dsproject.PollutantGUIGrpc.PollutantGUIImplBase;

import dsca.project.PollutantGUI;
import io.grpc.stub.StreamObserver;

public class PollutantGUIService extends PollutantGUIImplBase {

	@Override
	public void displayGUI(displayGUIRequest request, StreamObserver<displayGUIResponse> responseObserver) {
		System.out.println("Display in progress!");
		
		String display = request.getDgmessage();
		display = "Display";
		
		displayGUIResponse.Builder response = displayGUIResponse.newBuilder();
		
		if (display == "Display") {
			
			response.setDgresponsecode(0).setDgresponse("SUCCESS");
			System.out.println(response.setDgresponse("SUCCESS"));
			PollutantGUI pg = new PollutantGUI();
			pg.main(null);
			
		} else {
			System.out.println("Display unsuccessful, use keyword 'Display' to display the process");
		}
	}

	@Override
	public void terminateGUI(terminateGUIRequest request, StreamObserver<terminateGUIResponse> responseObserver) {
		
		System.out.println("Display termination in progress...");
		
		String terminate = request.getTgmessage();
		terminate = "Terminate";
		terminateGUIResponse.Builder tgresponse = terminateGUIResponse.newBuilder();
		
		if (terminate == "Terminate") {
			
			tgresponse.setTgresponsecode(0).setTgresponse("SUCCESS");
			System.exit(0);
			
		} else {
			System.out.println("Display termination unsuccessful, use keyword 'Terminate' to terminate the process");
		}
	}

	

}

