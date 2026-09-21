# Phase 1
Checking reference quality with == confirms that both variables retrieved from getInstance() refer to the same object in memory. This is important so that we meet the goal of only one instance of the class. THe constructor is private so other lasses cannot directly create it with new. The getInstance() method is static so it can be called without already having an instance.

# Phase 2
Eager initialization creates a singleton as soon as the class is loaded, even if its not ever used. Lazy loading is better for when you dont know if it will be used and if its expensive. So that you only load it when you know you will use it. The trade-off is it makes the getInstance method more complicated because it needs to see if it already exists. There could also be issues with synchronization when you account for multithreaded programs.

# Phase 3
The constructors of my subsystem classes do not show that they depend on ConfigurationManager. So AudioSystem can be created with a simple constructor and does not require a configuration object as a parameter. This is hidden dependency.The dependency exists inside the class because the methods directly call ConfigurationManager.getInstance(), but someone looking only at the constructor would not know that the class requires the configuration manager. Hidden dependencies can make testing dificult and should in general be avoided when possible.

# Phase 4
The Singleton made it easy for multiple subsystems to access the same configuration without passing it through constructors. Both systems can access the same shared settings. The downside is that it creates global state and hidden dependencies, which can make testing harder. A Singleton is useful when only one shared instance is needed, but Dependency Injection can be better when flexibility and easy testing are more important.