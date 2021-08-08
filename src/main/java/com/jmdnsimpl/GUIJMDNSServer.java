package com.jmdnsimpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import dsca.project.*;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class GUIJMDNSServer {

    public static void main(String[] args) throws IOException {
        int port = 50051;
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

        // Register a service
        ServiceInfo serviceInfo = ServiceInfo.create("_gui._tcp.local.", "GUI", port, "This server will display the CSV GUI");
        jmdns.registerService(serviceInfo);
        System.out.println("Starting the Date Server loop ");

       
        ServerSocket listener = new ServerSocket(50051);
        try {
            while (true) {
                Socket socket = listener.accept();
                try {
                	CSVDisplayGUI csv = new CSVDisplayGUI();
                	csv.createAndShowGUI();
                } finally {
                    socket.close();
                }
            }
        } finally {
            listener.close();
        }
    }
}
