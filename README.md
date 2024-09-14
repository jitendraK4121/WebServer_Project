# WebServer_Project
 This repository contains Java-based web server implementations utilizing different concurrency models: Single-Threaded, Multithreaded, and ThreadPool. Each server is built using Java’s ServerSocket and Socket classes to handle client requests. Performance testing was conducted using JMeter to evaluate how each model handles varying loads. 
![image](https://github.com/user-attachments/assets/e233ddc0-9d62-4623-9de1-3b35d9bad0f5)
The web server models in this repository have undergone rigorous testing, with each model handling 600,000 requests. This comprehensive evaluation demonstrates their ability to perform reliably and efficiently under heavy load conditions.

# 1.**Single-Threaded Web Server:**

**Description**  
This is a basic web server that processes one client request at a time, using a single thread to handle requests sequentially. As a result, it struggles to handle heavy traffic, with slower response times and reduced performance. Testing with Apache JMeter reveals significant limitations under heavy load, demonstrating the server’s inefficiency in high-traffic scenarios, as depicted in the graph below.![Screenshot 2024-09-14 112937](https://github.com/user-attachments/assets/435aff14-de06-484f-aa69-24218600e9cf)

# 2.Multi-Threaded Web Server:

**Description**  
This server enhances its ability to handle multiple requests at once by launching a new thread for each client. While this allows for simultaneous handling of several clients, it results in high memory consumption and may lead to performance issues if too many threads are created. Performance testing with Apache JMeter confirms improved concurrency, though it comes with increased resource usage, as reflected in the graph below.![Screenshot 2024-09-14 113832](https://github.com/user-attachments/assets/3599d1de-df9d-48b8-bf55-e49649615295)

# 3.**ThreadPool Web Server**:
This advanced server utilizes a thread pool with a fixed size of 10 threads to handle client requests efficiently through thread reuse. While performance testing with Apache JMeter demonstrates excellent scalability and resource management, increasing the number of threads can further enhance performance. 
![image](https://github.com/user-attachments/assets/2d47f3fb-15af-4f46-b8ac-690968d5d916)

# To see the web servers in action with JMeter, follow these steps:

Open JMeter by typing jmeter in the terminal.
Compile the server code: 
javac Server.java
Run the server:
java Server
In a new terminal window, compile the client code:
javac Client.java.
Run the client:
java Client.
