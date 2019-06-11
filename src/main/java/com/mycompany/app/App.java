package com.mycompany.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) throws IOException {
        //System.out.println(new App().getMessage());
    	
//    	HttpServer server = HttpServer.create(new InetSocketAddress(8000));
//    	server.createContext("/applications/myapp", new MyHandler());
//    	server.setExecutor(null); // creates a default executor
//    	server.start();
    	
	    ServerSocket listener = new ServerSocket(8002);
	    while(true){
	      Socket sock = listener.accept();
	      new PrintWriter(sock.getOutputStream(), true).
	                println("Hola a Todos y Todas!");
	      sock.close();
	    }

    }

    private final String getMessage() {
        return message;
    }

}
