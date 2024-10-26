The Singleton Design Pattern is a creational pattern that ensures a class has only one instance 
and provides a global point of access to it. Singleton is often used in scenarios 
where a single instance is required to coordinate actions across the system, 
such as logging, configuration management,and database connections.


Example: Database Connection Manager
In many applications, a single database connection pool is maintained to efficiently handle requests
without creating multiple connections for each operation. This DatabaseConnectionManager class can be
implemented as a singleton so that only one instance manages all database connections, 
optimizing resource usage and preventing connection overloads.

Example: Logger in Logging
Logging is another common real-world use case for the Singleton pattern.
 In an application, it’s usually desirable to have a single, centralized logger instance to ensure that 
 logs are written consistently to the same file or output, and to prevent resource waste by creating 
 multiple logger instances.