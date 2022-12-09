# Maintenance Monitor

### Project Description

Our customer is a small hydro-power electricity supplier near Vienna. Electricity around the clock with a very high service level agreement. Service times are crucial to the operation. The company installed monitors that should show the current service message.
"Everything operates as expected" is the default message. But a service operaator can set the message manually to something else (e.g., "Service checks: No power until 5:00 pm"). A service operator can also reset the message to its default message.
To best accommodate our customers’ needs we use a REST-based application in Java (via Spring Boot API integration). The service manages the message system stored on our server. It has the following features:
•	delivers the message
•	can be set manually to any specific message (not limited to alphanumerical characters)
•	resets the message to the default of our client´s choice
The technology used to create our maintenance monitor was the Java SDK 17 within the Spring framework and the use of the Spring Boot tool as well as the Postman API development tool which served as the REST interface client. Before its release it was tested with the JUnit 5 framework.

### (1)	Getting Started
To run the application, you need a functional JVM environment as well as a RESTful client. 

### (2)	Functionality 
The program maps a default message to the host server by the use of a Spring Controller via the GetMapping request and stores it centrally. The message can be accessed by a REST client at any time while the application interface is running. The function returns the default message itself.
The user can provide input to store any message of his choosing by accessing the “m” key and overwriting its value. The function stores the new message on the server and returns an affirmative String. A PostMapping request is used to set the message.
The message can be restored to default using the reset function. The function accesses and stores the default message on the mapped server and returns an affirmative String. 

### (3)	Java package
The Java package for this project includes a developer created .java pack with the classes MaintenanceMonitorApplication MaintenanceMonitorController and their defined attributes. The JUnit configuration includes all unit tests. 

### (4)	Contributors and work processes
The following team members were involved with the project:<br>
i.	Caraet Sean<br>
ii.	Nagel Anna

The team used Github as its VCS. A Basic Kanban board was used to track and record progress and assign and reassign issues. The code was migrated with the use of Intellij IDEA Git SCM and SourceTree.   


### (5)	License
MIT license © 2022	

### (6)	Tests

The application includes tests for each of the three functions that the software performs as well as a Spring Initializer performance test. Each was configured with the use of JUnit 5. Please consult the dependencies library for the exact version details. The initial test checks if a default message was mapped and stored by comparing the message String value with the value of the stored input. An additional test checks if a manually set message was stored correctly using the same String comparison method. The test generates a random String and inputs it as sample. A final test checks the reset function which restores the mapped message to default. Am automatically generated test checks if the Spring context was loaded successfully.
