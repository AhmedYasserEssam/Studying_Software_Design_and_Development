# Chapter 6 Architectural Design — MCQ Question Bank with Answers

Based on the Chapter 6 lecture on Architectural Design and the final exam structure.  
Focus areas: architectural design, architectural decisions, architectural views, architectural patterns, application architectures, transaction processing systems, information systems, and language processing systems.

---

### Q1. What is architectural design mainly concerned with?
A. Organizing the overall structure of a software system  
B. Writing detailed method implementations  
C. Choosing variable names  
D. Testing individual classes  

**Answer: A**  
**Justification:** Architectural design defines the overall system organization, including major components and relationships.

---

### Q2. Architectural design is considered the critical link between:
A. Coding and debugging  
B. Testing and deployment  
C. Requirements engineering and design  
D. Maintenance and retirement  

**Answer: C**  
**Justification:** Architectural design connects requirements to the system’s structural design.

---

### Q3. The output of the architectural design process is usually:
A. An architectural model  
B. Source code  
C. A test report  
D. A user manual  

**Answer: A**  
**Justification:** The architectural model describes how the system is organized as communicating components.

---

### Q4. Why is architecture usually designed early in agile processes?
A. Because architectural refactoring is often expensive  
B. Because agile does not allow refactoring  
C. Because architecture never changes  
D. Because coding cannot start without UML diagrams  

**Answer: A**  
**Justification:** Refactoring architecture affects many components, so it is usually costly.

---

### Q5. Which statement best describes architecture-level uncertainty?
A. Architecture manages uncertainty related to scalability, integration, technology choices, and future changes  
B. Architecture only deals with method names  
C. Architecture avoids all uncertainty completely  
D. Architecture ignores non-functional requirements  

**Answer: A**  
**Justification:** Architecture accepts and manages uncertainty by structuring the system for change and unknown future conditions.

---

### Q6. Software design is more concerned with:
A. Hardware procurement  
B. Enterprise-wide distributed structures only  
C. Network ownership  
D. Classes, methods, detailed logic, and design patterns  

**Answer: D**  
**Justification:** Detailed software design works at the class, method, and interaction level.

---

### Q7. Architecture in the small focuses on:
A. The architecture of individual programs  
B. Hardware-only design  
C. Enterprise systems distributed across companies  
D. National IT infrastructure  

**Answer: A**  
**Justification:** Architecture in the small concerns decomposition of individual programs into components.

---

### Q8. Architecture in the large focuses on:
A. Complex enterprise systems with multiple systems and components  
B. Individual algorithms only  
C. One class only  
D. Only graphical user interfaces  

**Answer: A**  
**Justification:** Architecture in the large deals with complex enterprise systems distributed across computers and organizations.

---

### Q9. Informal box-and-line diagrams are commonly used because they are:
A. Useful for communication and planning  
B. Always mathematically precise  
C. Required by Java  
D. Executable by compilers  

**Answer: A**  
**Justification:** Box-and-line diagrams are useful for stakeholder communication and project planning.

---

### Q10. A major weakness of informal box-and-line architectural diagrams is that they:
A. Lack precise semantics and relationship types  
B. Are impossible to understand  
C. Are always too detailed  
D. Cannot show any components  

**Answer: A**  
**Justification:** Informal diagrams often do not define exact relationship meanings or visible component properties.

---

### Q11. UML component and deployment diagrams are examples of:
A. Semi-formal standardized notations  
B. Source code templates  
C. Purely mathematical formal languages  
D. Informal natural language descriptions  

**Answer: A**  
**Justification:** UML provides standardized visual notation but may still allow ambiguity.

---

### Q12. Z and Petri nets are examples of:
A. Formal languages  
B. Informal sketches  
C. Programming languages only  
D. User interface frameworks  

**Answer: A**  
**Justification:** Formal languages have mathematically precise semantics and support rigorous analysis.

---

### Q13. Formal architectural languages are useful mainly because they:
A. Support rigorous analysis and formal verification  
B. Replace all source code  
C. Avoid all documentation  
D. Are always easier for stakeholders than informal diagrams  

**Answer: A**  
**Justification:** Formal languages are mathematically precise and can be analyzed rigorously.

---

### Q14. A high-level architectural view is useful for stakeholders because it:
A. Allows discussion without excessive technical detail  
B. Includes every method implementation  
C. Avoids all abstraction  
D. Replaces the need for requirements  

**Answer: A**  
**Justification:** Abstract architectural views help stakeholders discuss the system as a whole.

---

### Q15. Which is an advantage of explicit architecture?
A. It supports system analysis against non-functional requirements  
B. It eliminates all testing  
C. It guarantees zero defects  
D. It prevents stakeholder communication  

**Answer: A**  
**Justification:** Explicit architecture helps analyze whether the system can satisfy quality attributes.

---

### Q16. Explicit architecture supports large-scale reuse because:
A. Source code is never reused  
B. Every system must use the same architecture  
C. Architecture can sometimes be reused across similar systems  
D. Reuse applies only to user interfaces  

**Answer: C**  
**Justification:** Product-line and reference architectures can be reused across related systems.

---

### Q17. Architectural models may be used for:
A. Both discussion and documentation  
B. Discussion only  
C. Documentation only  
D. Coding only  

**Answer: A**  
**Justification:** Architectural models support stakeholder discussion and complete documentation of components and connections.

---

### Q18. A complete architectural documentation model should usually show:
A. Components, interfaces, and connections  
B. Only source-code comments  
C. Only variable names  
D. Only the login screen  

**Answer: A**  
**Justification:** Documentation models identify components, interfaces, and their connections.

---

### Q19. Architectural design decisions affect mainly:
A. Font size in reports only  
B. Non-functional characteristics of the system  
C. The number of comments in code only  
D. Local variable names only  

**Answer: B**  
**Justification:** Architectural choices strongly influence performance, security, availability, safety, and maintainability.

---

### Q20. Choosing MVC, layered architecture, repository, client-server, or pipe-and-filter is a decision about:
A. Architectural patterns or styles  
B. Programming syntax  
C. Unit test names  
D. Keyboard shortcuts  

**Answer: A**  
**Justification:** These are architectural patterns or styles used to structure systems.

---

### Q21. The question “Who controls whom?” in architecture is mainly about:
A. Component control strategy  
B. Database indexing only  
C. Variable scope  
D. Font selection  

**Answer: A**  
**Justification:** Control strategy defines how components coordinate and execute work.

---

### Q22. A centralized control strategy means:
A. One component coordinates or controls other components  
B. No component controls anything  
C. Every component has a separate database  
D. Data always flows sequentially through filters  

**Answer: A**  
**Justification:** Centralized control uses a controller or orchestrator to coordinate system behavior.

---

### Q23. A possible disadvantage of centralized control is:
A. It can become a bottleneck  
B. It is impossible to understand  
C. It removes all system structure  
D. It never supports coordination  

**Answer: A**  
**Justification:** A central controller may limit scalability or become a single point of congestion.

---

### Q24. Event-driven decentralized control is characterized by:
A. No communication between components  
B. Only one controller executing all tasks  
C. Data always being stored in one repository  
D. Components reacting to events rather than being controlled by one central component  

**Answer: D**  
**Justification:** Event-driven systems coordinate through emitted and handled events.

---

### Q25. Pipeline or sequential control is best described as:
A. Components never communicating  
B. All data stored in one user interface  
C. Every component controlling every other component  
D. Components executing in a defined order  

**Answer: D**  
**Justification:** Pipeline control processes tasks step by step, such as Step 1 → Step 2 → Step 3.

---

### Q26. Peer-to-peer distributed control usually means:
A. Only one database exists  
B. Components communicate directly with one another  
C. A single central controller controls all components  
D. The user interface stores all business data  

**Answer: B**  
**Justification:** In peer-to-peer control, components coordinate directly without a single central controller.

---

### Q27. To improve performance, an architecture may:
A. Localize critical operations and minimize communication  
B. Remove all components  
C. Increase communication between all small components  
D. Avoid considering system structure  

**Answer: A**  
**Justification:** Performance benefits from reducing communication overhead and localizing critical operations.

---

### Q28. To improve security, an architecture may:
A. Avoid separation of concerns  
B. Put all data in the user interface  
C. Remove authentication  
D. Put critical assets in inner layers  

**Answer: D**  
**Justification:** Layered architecture can isolate critical assets inside protected layers.

---

### Q29. To improve safety, an architecture may:
A. Localize safety-critical features in a small number of subsystems  
B. Spread safety-critical features randomly across all components  
C. Remove error checking  
D. Maximize coupling  

**Answer: A**  
**Justification:** Localizing safety-critical features makes them easier to analyze and control.

---

### Q30. To improve availability, an architecture may include:
A. Redundant components and fault-tolerance mechanisms  
B. One irreplaceable component only  
C. No backup mechanisms  
D. User interface duplication only  

**Answer: A**  
**Justification:** Redundancy and fault tolerance help the system continue operating during failures.

---

### Q31. To improve maintainability, an architecture may use:
A. One huge component containing all behavior  
B. Fine-grained replaceable components  
C. Maximum dependency between components  
D. No interfaces  

**Answer: B**  
**Justification:** Smaller replaceable components are easier to modify and maintain.

---

### Q32. Which pair of non-functional requirements may conflict?
A. Hardware and keyboard layout  
B. Syntax and indentation  
C. Performance and maintainability  
D. Comments and variable names  

**Answer: C**  
**Justification:** Performance may favor larger components and less communication, while maintainability may favor smaller replaceable components.

---

### Q33. Security differs from safety because security focuses on:
A. Intentional attacks and malicious threats  
B. Accidental harm only  
C. Compiler syntax  
D. User interface colors  

**Answer: A**  
**Justification:** Security protects against deliberate malicious actions.

---

### Q34. Safety focuses mainly on:
A. Accidental failures that may harm people or the system  
B. Database indexing only  
C. Malicious attacks  
D. Presentation logic  

**Answer: A**  
**Justification:** Safety protects against unintended harm caused by failures or accidents.

---

### Q35. Functional decomposition means decomposing the system based on:
A. Random file names  
B. Processor brands  
C. Font sizes  
D. Features, responsibilities, or use cases  

**Answer: D**  
**Justification:** Functional decomposition separates components by responsibility or business function.

---

### Q36. Separation of concerns means:
A. Every component should contain every responsibility  
B. All code should be placed in one class  
C. Components should be randomly grouped  
D. Each component should do one focused responsibility well  

**Answer: D**  
**Justification:** Separation of concerns reduces complexity by keeping responsibilities distinct.

---

### Q37. High cohesion means:
A. A component contains closely related functionality  
B. A component depends on every other component  
C. Every feature is split randomly  
D. Components have no responsibilities  

**Answer: A**  
**Justification:** Cohesion measures how closely related the responsibilities inside a component are.

---

### Q38. Low coupling means:
A. One component controls all others  
B. Every component stores duplicate data  
C. Components cannot communicate at all  
D. Components depend less on one another  

**Answer: D**  
**Justification:** Low coupling reduces dependency between components and improves maintainability.

---

### Q39. Components that change together should usually be:
A. Deleted  
B. Always separated into different machines  
C. Kept together  
D. Placed only in the user interface  

**Answer: C**  
**Justification:** Grouping related changes reduces unnecessary cross-component modifications.

---

### Q40. A reusable logging module should usually be:
A. Made a separate component  
B. Removed from the architecture  
C. Mixed into every unrelated component manually  
D. Stored only in the database schema  

**Answer: A**  
**Justification:** Reusable functionality should be separated so it can be shared across the system.

---

### Q41. Each architectural model usually shows:
A. Only database rows  
B. One view or perspective of the system  
C. Only source code  
D. Every possible detail of the system  

**Answer: B**  
**Justification:** Architectural models represent particular perspectives, such as modules, processes, or deployment.

---

### Q42. The logical/conceptual view in the 4+1 model shows:
A. Key abstractions as objects or object classes  
B. Hardware nodes only  
C. Developer team salaries  
D. Network cables only  

**Answer: A**  
**Justification:** The logical view represents key abstractions and conceptual structure.

---

### Q43. The process view shows:
A. Only source-code folders  
B. Only hardware distribution  
C. How the system is composed of interacting processes at runtime  
D. Only class names  

**Answer: C**  
**Justification:** The process view focuses on runtime processes and interactions.

---

### Q44. The development view shows:
A. How users click buttons  
B. How software is decomposed for development  
C. Where hardware is located  
D. Only database backups  

**Answer: B**  
**Justification:** The development view organizes the system for implementation and development work.

---

### Q45. The physical view shows:
A. Only source-code comments  
B. Hardware and distribution of software components across processors  
C. Only business rules  
D. Only variable names  

**Answer: B**  
**Justification:** The physical view maps software components to hardware infrastructure.

---

### Q46. Which UML model is commonly used for the development view?
A. Entity relationship diagram only  
B. Component diagram  
C. Use case diagram only  
D. Deployment diagram  

**Answer: B**  
**Justification:** Component diagrams show software components and their organization for development.

---

### Q47. Which UML model is commonly used for the physical view?
A. Package import list  
B. State diagram only  
C. Deployment diagram  
D. Class diagram only  

**Answer: C**  
**Justification:** Deployment diagrams show hardware nodes and software distribution.

---

### Q48. Which UML models can represent process behavior?
A. CSS files  
B. Deployment diagrams only  
C. Database schemas only  
D. Activity or sequence diagrams  

**Answer: D**  
**Justification:** Activity and sequence diagrams can show runtime behavior and interactions.

---

### Q49. Architectural patterns are mainly used to:
A. Avoid all design decisions  
B. Replace all requirements  
C. Generate random code  
D. Represent, share, and reuse architectural design knowledge  

**Answer: D**  
**Justification:** Patterns capture proven architectural solutions for reuse.

---

### Q50. A good architectural pattern description should include:
A. When it is useful, when it is not useful, advantages, and disadvantages  
B. Only the name of the pattern  
C. Only source code  
D. Only hardware prices  

**Answer: A**  
**Justification:** Architectural patterns should include context, usage, strengths, and weaknesses.

---

### Q51. MVC stands for:
A. Model-View-Controller  
B. Main-View-Code  
C. Machine-Variable-Class  
D. Module-Version-Compiler  

**Answer: A**  
**Justification:** MVC means Model-View-Controller.

---

### Q52. In MVC, the Model is responsible for:
A. Handling only mouse clicks  
B. Managing system data and operations on that data  
C. Deploying software to hardware  
D. Drawing only buttons  

**Answer: B**  
**Justification:** The Model manages data and associated data operations.

---

### Q53. In MVC, the View is responsible for:
A. Managing how data is presented to the user  
B. Storing all database records permanently  
C. Handling network routing only  
D. Managing server hardware  

**Answer: A**  
**Justification:** The View defines and manages the presentation of data.

---

### Q54. In MVC, the Controller is responsible for:
A. Compiler optimization only  
B. User interaction and passing interactions to the View and Model  
C. Hardware deployment only  
D. Physical database storage only  

**Answer: B**  
**Justification:** The Controller handles inputs such as key presses and mouse clicks.

---

### Q55. MVC is especially useful when:
A. The system contains only one simple calculation  
B. The system has no user interface  
C. Data never changes  
D. There are multiple ways to view and interact with data  

**Answer: D**  
**Justification:** MVC supports multiple presentations and interactions for the same data.

---

### Q56. A key advantage of MVC is that:
A. It removes all code complexity  
B. It eliminates the need for testing  
C. Data can change independently of its representation  
D. It guarantees no security problems  

**Answer: C**  
**Justification:** MVC separates data management from presentation.

---

### Q57. A disadvantage of MVC is that:
A. It prevents multiple views  
B. It cannot support web applications  
C. It may add unnecessary code and complexity for simple systems  
D. It requires all components to be hardware devices  

**Answer: C**  
**Justification:** MVC can be overkill for simple data models and interactions.

---

### Q58. MVC is best classified as:
A. A database type  
B. A sorting algorithm  
C. An architectural pattern  
D. A programming language  

**Answer: C**  
**Justification:** MVC is an architectural pattern for separating concerns in interactive systems.

---

### Q59. Layered architecture organizes the system into:
A. Separate physical computers only  
B. One global function only  
C. Random independent scripts  
D. A set of layers that provide services to layers above them  

**Answer: D**  
**Justification:** Each layer provides services to the layer above it.

---

### Q60. Layered architecture is useful when:
A. Building new facilities on top of existing systems  
B. The system has no subsystems  
C. All data must be processed by one filter only  
D. There is no structure at all  

**Answer: A**  
**Justification:** Layers support building higher-level services on lower-level existing services.

---

### Q61. Layered architecture is also useful when:
A. Only one developer writes all code without structure  
B. No interface exists between components  
C. Development is spread across teams responsible for different layers  
D. Data must never be protected  

**Answer: C**  
**Justification:** Teams can work on separate layers with defined interfaces.

---

### Q62. Which requirement can layered architecture support well?
A. Randomized control  
B. Multi-level security  
C. Removal of all interfaces  
D. Elimination of all databases  

**Answer: B**  
**Justification:** Critical assets can be placed in protected inner layers.

---

### Q63. A key advantage of layered architecture is:
A. It always has the best performance  
B. Entire layers can be replaced if interfaces are preserved  
C. It removes all dependencies automatically  
D. Layers never communicate  

**Answer: B**  
**Justification:** Layer replacement is possible when layer interfaces remain stable.

---

### Q64. A disadvantage of layered architecture is that:
A. It never supports replacement  
B. It cannot be used with teams  
C. Clean separation between layers may be difficult  
D. It cannot support security  

**Answer: C**  
**Justification:** Real systems sometimes require interactions that violate strict layer boundaries.

---

### Q65. Layered architecture may reduce performance because:
A. It requires no communication  
B. It cannot use databases  
C. It has no components  
D. Requests may pass through multiple levels of interpretation  

**Answer: D**  
**Justification:** Each layer may add processing overhead.

---

### Q66. Repository architecture is based on:
A. Hardware processors only  
B. A central data repository accessed by system components  
C. No shared data  
D. User interfaces only  

**Answer: B**  
**Justification:** Components share information through a central repository.

---

### Q67. In repository architecture, components usually communicate:
A. Through the repository rather than directly with each other  
B. Only through the user interface  
C. Only by handwritten letters  
D. Never  

**Answer: A**  
**Justification:** Repository architecture decouples components by using shared data storage.

---

### Q68. Repository architecture is suitable when:
A. No data is stored  
B. The system has no components  
C. Large volumes of long-term data must be shared  
D. Every component must hide all data from others  

**Answer: C**  
**Justification:** A central repository efficiently supports shared long-term information.

---

### Q69. A key advantage of repository architecture is:
A. It prevents consistent backup  
B. Components do not need to know about each other directly  
C. It eliminates all performance concerns  
D. The repository can never fail  

**Answer: B**  
**Justification:** Components are independent because they communicate through shared data.

---

### Q70. Another advantage of repository architecture is:
A. Every component must duplicate data  
B. No component can access data  
C. Data can be managed consistently in one place  
D. Backups are impossible  

**Answer: C**  
**Justification:** Centralized data management supports consistent backup and control.

---

### Q71. A key disadvantage of repository architecture is:
A. It cannot store long-term information  
B. Components become impossible to separate  
C. No data can be shared  
D. The repository may be a single point of failure  

**Answer: D**  
**Justification:** Failure of the repository may affect the entire system.

---

### Q72. Repository architecture may be inefficient because:
A. It cannot connect components  
B. All communication may need to pass through the repository  
C. It prevents backup  
D. It has no data  

**Answer: B**  
**Justification:** Routing communication through one data store can create overhead.

---

### Q73. Client-server architecture organizes functionality as:
A. A single user interface with no backend  
B. One local method only  
C. A compiler syntax tree only  
D. Services provided by servers and accessed by clients  

**Answer: D**  
**Justification:** Servers provide services, and clients request those services.

---

### Q74. A client-server architecture usually includes:
A. Only one method  
B. Only a symbol table  
C. Only filters  
D. Servers, clients, and a network  

**Answer: D**  
**Justification:** Clients access services from servers over a network.

---

### Q75. Client-server architecture is suitable when:
A. All processing is performed manually  
B. No services exist  
C. No users access the system remotely  
D. Shared data must be accessed from different locations  

**Answer: D**  
**Justification:** Client-server supports distributed access to shared services and data.

---

### Q76. Client-server architecture may support variable load because:
A. Networks are never used  
B. Servers can be replicated  
C. Services cannot be separated  
D. Clients cannot send requests  

**Answer: B**  
**Justification:** Replicating servers can help handle changing load.

---

### Q77. A key advantage of client-server architecture is:
A. It prevents remote access  
B. Servers can be distributed across a network  
C. It requires all clients to store all data  
D. It removes all services  

**Answer: B**  
**Justification:** Server functionality can be placed across networked machines.

---

### Q78. A disadvantage of client-server architecture is:
A. It cannot support remote clients  
B. It prevents service reuse  
C. Services may become single points of failure  
D. It has no network dependency  

**Answer: C**  
**Justification:** Failure or attack on a server may affect service availability.

---

### Q79. Client-server performance may be unpredictable because it depends on:
A. Only method names  
B. Both the system and the network  
C. Only comments  
D. Only UML notation  

**Answer: B**  
**Justification:** Network delays and server behavior affect response time.

---

### Q80. Pipe-and-filter architecture organizes processing as:
A. A sequence or network of transformations connected by data flows  
B. A single central database only  
C. A user interface only  
D. Hardware nodes only  

**Answer: A**  
**Justification:** Filters transform data, and pipes pass data between filters.

---

### Q81. In pipe-and-filter architecture, each filter should:
A. Store all users permanently  
B. Replace all other filters  
C. Manage all system responsibilities  
D. Perform one type of data transformation  

**Answer: D**  
**Justification:** Each filter performs a discrete transformation.

---

### Q82. Pipe-and-filter architecture is commonly used in:
A. User authentication only  
B. Data processing applications  
C. Hardware manufacturing only  
D. Purely interactive drawing tools only  

**Answer: B**  
**Justification:** Data processing often follows a staged transformation workflow.

---

### Q83. When transformations are sequential, pipe-and-filter may be called:
A. Peer-only model  
B. Batch sequential model  
C. MVC model  
D. Deployment model  

**Answer: B**  
**Justification:** Sequential transformations form a batch sequential pipeline.

---

### Q84. A key advantage of pipe-and-filter architecture is:
A. It requires no input or output  
B. It is easy to understand and supports transformation reuse  
C. It is always best for interactive systems  
D. It eliminates all data format issues  

**Answer: B**  
**Justification:** Independent transformations are easier to understand and reuse.

---

### Q85. Another advantage of pipe-and-filter architecture is:
A. Filters must all be merged into one component  
B. It cannot be concurrent  
C. New transformations can be added relatively easily  
D. It prevents workflow-style processing  

**Answer: C**  
**Justification:** Evolution is straightforward by adding or replacing transformations.

---

### Q86. A disadvantage of pipe-and-filter architecture is:
A. It cannot be sequential  
B. Communicating filters must agree on data format  
C. It cannot process data  
D. It cannot be understood  

**Answer: B**  
**Justification:** Filters need compatible input and output formats.

---

### Q87. Pipe-and-filter is not very suitable for:
A. Batch processing  
B. Compiler pipelines  
C. Interactive systems requiring frequent user interaction  
D. Invoice processing  

**Answer: C**  
**Justification:** Interactive systems often need immediate feedback rather than staged batch transformations.

---

### Q88. A generic application architecture is also called a:
A. Local variable  
B. Syntax rule  
C. Runtime exception  
D. Reference architecture  

**Answer: D**  
**Justification:** A reference architecture provides a reusable template for a class of systems.

---

### Q89. Application architectures are useful as:
A. A way to avoid components  
B. Starting points for architectural design  
C. Replacements for all requirements  
D. Proof that testing is unnecessary  

**Answer: B**  
**Justification:** Generic application architectures help start system-specific architecture design.

---

### Q90. Application architectures may also be used as:
A. Random code generators  
B. Substitutes for all user interfaces  
C. Design checklists and a way of organizing development work  
D. Alternatives to programming languages  

**Answer: C**  
**Justification:** They help guide design, reuse decisions, and team organization.

---

### Q91. Data processing applications are applications that:
A. Process data in batches without explicit user intervention during processing  
B. Always require real-time user interaction  
C. Never store data  
D. Only compile source code  

**Answer: A**  
**Justification:** Data processing applications process batches of data automatically.

---

### Q92. Transaction processing applications are:
A. Applications that never use databases  
B. Applications with no users  
C. Data-centered applications that process user requests and update system information  
D. Applications that only transform programming languages  

**Answer: C**  
**Justification:** Transaction systems retrieve or update information in response to user requests.

---

### Q93. Event processing systems are applications where:
A. Only batch reports are generated once a year  
B. System actions depend on interpreting events from the environment  
C. Users write Java classes only  
D. No input is accepted  

**Answer: B**  
**Justification:** Event-processing systems react to events from their environment.

---

### Q94. Language processing systems are applications where:
A. The system only manages users  
B. No input language exists  
C. The system only stores invoices  
D. User intentions are specified in a formal language that is processed and interpreted  

**Answer: D**  
**Justification:** Language processors interpret or translate formal language input.

---

### Q95. Examples of transaction processing systems include:
A. Lexical analyzers only  
B. E-commerce and reservation systems  
C. Syntax trees only  
D. Compilers only  

**Answer: B**  
**Justification:** E-commerce and reservation systems process user transactions involving stored data.

---

### Q96. Examples of language processing systems include:
A. Web browsers only  
B. Shopping carts only  
C. Compilers and command interpreters  
D. Reservation databases only  

**Answer: C**  
**Justification:** Compilers and command interpreters process formal language input.

---

### Q97. A transaction processing system processes:
A. Only hardware signals  
B. Only source-code indentation  
C. Only graphical animations  
D. User requests for information or updates to a database  

**Answer: D**  
**Justification:** Transaction systems process database queries and updates.

---

### Q98. From a user perspective, a transaction is:
A. A syntax error  
B. A UML diagram only  
C. A coherent sequence of operations that satisfies a goal  
D. A hardware device  

**Answer: C**  
**Justification:** A transaction is a meaningful sequence of operations, such as finding flight times.

---

### Q99. Transaction processing systems may be organized using:
A. No architecture  
B. Only deployment diagrams  
C. Only class inheritance  
D. Pipe-and-filter architecture  

**Answer: D**  
**Justification:** Components may be responsible for input, processing, and output stages.

---

### Q100. Information systems are often organized as:
A. Compiler-only pipelines  
B. Random scripts  
C. No database systems  
D. Layered architectures  

**Answer: D**  
**Justification:** Information systems can be layered into UI, communication, retrieval, and database layers.

---

### Q101. Typical layers in an information system include:
A. User interface, user communications, information retrieval, and system database  
B. Only client screens  
C. Only lexical analysis and code generation  
D. Only filters and pipes  

**Answer: A**  
**Justification:** These are the common layers listed for information systems.

---

### Q102. Web-based information systems usually implement the user interface using:
A. A syntax tree  
B. A compiler symbol table  
C. A web browser  
D. A hardware switch only  

**Answer: C**  
**Justification:** Web-based systems commonly use browsers for user interaction.

---

### Q103. In a multi-tier web-based information system, the web server is usually responsible for:
A. User communications  
B. Syntax analysis  
C. Physical file backup only  
D. Code generation  

**Answer: A**  
**Justification:** The web server handles communication with browser-based clients.

---

### Q104. In a multi-tier web-based information system, the application server is usually responsible for:
A. Only displaying HTML buttons  
B. Application-specific logic and information storage/retrieval requests  
C. Only lexical analysis  
D. Only storing physical disks  

**Answer: B**  
**Justification:** The application server implements business logic and coordinates access to data.

---

### Q105. In a multi-tier web-based information system, the database server is usually responsible for:
A. Moving information to and from the database and handling transaction management  
B. Compiling source code  
C. Handling mouse clicks directly  
D. Drawing the user interface  

**Answer: A**  
**Justification:** Database servers manage persistent data and database transactions.

---

### Q106. A language processing system accepts:
A. Only user profile images  
B. Only database transactions  
C. Only server logs  
D. Natural or artificial language input and generates another representation  

**Answer: D**  
**Justification:** Language processors translate or interpret language input.

---

### Q107. A lexical analyzer converts:
A. User clicks into database backups  
B. Object code into invoices  
C. Input language tokens into an internal form  
D. Servers into clients  

**Answer: C**  
**Justification:** Lexical analysis identifies tokens and converts them to internal representations.

---

### Q108. A symbol table stores:
A. Only hardware addresses  
B. Information about names of entities used in the text being translated  
C. Only user passwords  
D. Only report layouts  

**Answer: B**  
**Justification:** The symbol table stores identifiers such as variable names, class names, and object names.

---

### Q109. A syntax analyzer checks:
A. User permissions only  
B. Network speed only  
C. The syntax of the language being translated  
D. Physical deployment only  

**Answer: C**  
**Justification:** Syntax analysis validates grammar and structure.

---

### Q110. A syntax tree represents:
A. User interface colors  
B. A network topology only  
C. A database backup plan  
D. The internal structure of the program being compiled  

**Answer: D**  
**Justification:** A syntax tree is an internal representation of program structure.

---

### Q111. A semantic analyzer checks:
A. Server location  
B. Hardware temperature  
C. Visual layout only  
D. Semantic correctness using the syntax tree and symbol table  

**Answer: D**  
**Justification:** Semantic analysis validates meaning, not just syntax.

---

### Q112. A code generator:
A. Stores users in a database  
B. Walks the syntax tree and generates abstract machine code  
C. Handles server replication only  
D. Draws buttons  

**Answer: B**  
**Justification:** Code generation produces target or abstract machine code from the analyzed structure.

---

### Q113. A compiler can be represented using repository architecture because:
A. It never shares information  
B. Components may share information through structures such as a symbol table or syntax tree  
C. It cannot store internal representations  
D. It has no components  

**Answer: B**  
**Justification:** Compiler components may share intermediate information through central structures.

---

### Q114. A compiler can be represented using pipe-and-filter architecture because:
A. It cannot transform data  
B. It has no sequential processing  
C. Compilation can proceed through stages such as lexical analysis, syntax analysis, semantic analysis, and code generation  
D. It is always only a user interface  

**Answer: C**  
**Justification:** Compilation naturally fits staged transformation.

---

### Q115. A web application must show the same data as a table, chart, and printable report. Which pattern is most suitable for separating data from presentation?
A. Repository only  
B. MVC  
C. Pipe and filter  
D. Client-server only  

**Answer: B**  
**Justification:** MVC supports multiple views of the same data.

---

### Q116. A hospital system stores patients, doctors, appointments, lab results, and prescriptions in one shared database accessed by many modules. Which pattern is most directly suggested?
A. Compiler architecture  
B. MVC only  
C. Repository  
D. Pipe and filter  

**Answer: C**  
**Justification:** Repository architecture fits shared long-term data accessed by many components.

---

### Q117. A system processes invoices through validation, tax calculation, discount calculation, and report generation. Which pattern is most suitable?
A. Peer-to-peer only  
B. MVC  
C. Layered only  
D. Pipe and filter  

**Answer: D**  
**Justification:** Each invoice-processing step is a transformation stage.

---

### Q118. A banking system separates presentation, business rules, security, and database access into different levels. Which architecture is most directly suggested?
A. Layered architecture  
B. Repository only  
C. Syntax tree architecture  
D. Pipe and filter only  

**Answer: A**  
**Justification:** Layered architecture organizes related functionality into service-providing layers.

---

### Q119. A video streaming system has mobile clients, web clients, and multiple backend servers accessed over a network. Which pattern is most directly suggested?
A. Syntax analyzer  
B. Local-only architecture  
C. Pipe and filter only  
D. Client-server  

**Answer: D**  
**Justification:** Clients access services provided by servers over a network.

---

### Q120. A university learning system has web/mobile clients, controllers for user interaction, models for grades/courses, views for screens, and a database. Which combination is most reasonable?
A. Pipe-and-filter only  
B. Client-server + MVC + repository  
C. Compiler-only architecture  
D. No architectural pattern  

**Answer: B**  
**Justification:** Remote access suggests client-server, interaction separation suggests MVC, and shared academic data suggests repository.

---

### Q121. A system must protect critical assets by isolating them behind several access-control levels. Which architecture helps most?
A. MVC only  
B. Syntax tree only  
C. Layered architecture  
D. Pipe and filter  

**Answer: C**  
**Justification:** Layered architecture can place critical assets in inner protected layers.

---

### Q122. A system has many independent tools that generate and consume shared design information through a central store. Which pattern best fits?
A. Peer-to-peer only  
B. Repository  
C. Client-only architecture  
D. MVC  

**Answer: B**  
**Justification:** A repository allows independent tools to share generated information.

---

### Q123. An online store lets users add several items to a shopping cart and pay for them in one transaction. This is an example of:
A. Pure compiler architecture  
B. Hardware deployment only  
C. Formal verification only  
D. Web-based transaction processing  

**Answer: D**  
**Justification:** E-commerce systems process database-related user transactions.

---

### Q124. A command interpreter accepts formal commands and executes them. What application type is this?
A. Data backup system only  
B. Reservation system  
C. Language processing system  
D. MVC view only  

**Answer: C**  
**Justification:** Command interpreters process formal language commands.

---

### Q125. A reservation system receives user requests to find and book flights by updating a database. What application type is this?
A. Pure batch-only data processing system  
B. Language processing system  
C. Compiler system  
D. Transaction processing system  

**Answer: D**  
**Justification:** Reservation systems process user transactions involving data retrieval and updates.

---

### Q126. A batch payroll system calculates salaries from timesheets without user intervention during the calculation. What application type is this?
A. Command interpreter  
B. Data processing application  
C. MVC-only system  
D. Deployment diagram  

**Answer: B**  
**Justification:** Batch payroll processing is data processing without explicit interaction during processing.

---

### Q127. A weather alert system reacts when sensors report dangerous conditions. What application type is most likely?
A. Repository-only compiler  
B. Static web page only  
C. Event processing system  
D. Batch-only payroll system  

**Answer: C**  
**Justification:** System actions depend on events from the environment.

---

### Q128. A team wants different groups to work independently on UI, business logic, and database access. Which architecture helps organize this work?
A. No architecture  
B. Layered architecture  
C. Syntax tree architecture  
D. One-component architecture  

**Answer: B**  
**Justification:** Teams can be assigned responsibility for separate layers.

---

### Q129. A reporting workflow must be extended by adding a new anonymization stage before publishing. Which pattern supports this kind of evolution most naturally?
A. Client-server only  
B. MVC only  
C. Pipe and filter  
D. Physical view only  

**Answer: C**  
**Justification:** Pipe-and-filter systems can evolve by adding transformations.

---

### Q130. A system has a simple fixed data display and very simple interactions. Which pattern may introduce unnecessary complexity?
A. Repository  
B. Layered security  
C. MVC  
D. Client-server  

**Answer: C**  
**Justification:** MVC may add extra code and complexity when the model and interactions are simple.

---

### Q131. Which pattern is most likely to create performance overhead due to repeated interpretation of requests across levels?
A. Repository  
B. Layered architecture  
C. MVC  
D. Client-server  

**Answer: B**  
**Justification:** Requests may be processed at several layers, adding overhead.

---

### Q132. Which pattern is most vulnerable if its central data store fails?
A. Logical view  
B. Pipe and filter  
C. MVC  
D. Repository  

**Answer: D**  
**Justification:** The repository may become a single point of failure.

---

### Q133. Which pattern is most affected by network reliability and speed?
A. MVC  
B. Client-server  
C. Logical view  
D. Compiler repository  

**Answer: B**  
**Justification:** Client-server performance depends on the network as well as the servers.

---

### Q134. Which pattern may suffer if filters use incompatible data structures?
A. MVC  
B. Layered architecture  
C. Pipe and filter  
D. Client-server  

**Answer: C**  
**Justification:** Filters must agree on data transfer formats.

---

### Q135. Which pattern best supports changing the user interface without changing core data management?
A. Pipe and filter  
B. MVC  
C. Symbol table  
D. Physical deployment  

**Answer: B**  
**Justification:** MVC separates presentation from model data.

---

### Q136. Which is the best architectural choice if the main concern is long-term shared data consistency?
A. Pipe and filter  
B. MVC only  
C. Activity diagram only  
D. Repository  

**Answer: D**  
**Justification:** A central repository enables consistent data management.

---

### Q137. Which pattern is best when workflow naturally matches business process stages?
A. Deployment diagram  
B. Physical view  
C. Pipe and filter  
D. MVC  

**Answer: C**  
**Justification:** Pipe-and-filter architecture maps well to staged workflows.

---

### Q138. Which architectural view is most relevant for deciding how components are distributed across processors?
A. Use-case view only  
B. Logical view  
C. Development view only  
D. Physical view  

**Answer: D**  
**Justification:** The physical view shows hardware and software distribution.

---

### Q139. Which architectural view is most relevant for deciding how runtime processes interact?
A. Physical view only  
B. Development view only  
C. Process view  
D. Database view only  

**Answer: C**  
**Justification:** The process view represents runtime process composition and interaction.

---

### Q140. Which architectural view is most relevant for assigning development teams to software modules?
A. Physical view only  
B. Runtime memory view only  
C. Development view  
D. Process view only  

**Answer: C**  
**Justification:** The development view shows software decomposition for development.

---

### Q141. Which architectural view is most relevant for identifying key object classes and abstractions?
A. Physical view  
B. Deployment view only  
C. Logical/conceptual view  
D. Database server view only  

**Answer: C**  
**Justification:** The logical/conceptual view shows core abstractions.

---

### Q142. A system requires strong maintainability. Which architectural choice is most consistent with this goal?
A. Maximum coupling  
B. Fine-grained, replaceable components  
C. One huge component for everything  
D. No interfaces  

**Answer: B**  
**Justification:** Maintainability improves when components can be replaced independently.

---

### Q143. A system requires high performance. Which architectural choice is most consistent with this goal?
A. Add unnecessary layers to every request  
B. Maximize communication between all components  
C. Split every operation into many remote calls  
D. Reduce communication and localize critical operations  

**Answer: D**  
**Justification:** Performance improves when communication overhead is minimized.

---

### Q144. A system requires high availability. Which architectural choice is most consistent with this goal?
A. One non-replicated server only  
B. No backup components  
C. No error handling  
D. Redundancy and fault tolerance  

**Answer: D**  
**Justification:** Availability improves when the system can tolerate failures.

---

### Q145. A system requires high security. Which architectural choice is most consistent with this goal?
A. Public access to every database table  
B. No authentication  
C. Layers that isolate critical assets  
D. Mixing all responsibilities in one UI component  

**Answer: C**  
**Justification:** Isolation and layered protection reduce security exposure.

---

### Q146. Which statement best compares MVC and layered architecture?
A. Layered architecture has only Model, View, and Controller  
B. MVC is only a hardware deployment pattern  
C. MVC and layered architecture are exactly the same  
D. MVC separates model, view, and controller; layered architecture separates the whole system into service-providing levels  

**Answer: D**  
**Justification:** MVC is focused on presentation, interaction, and data separation; layered architecture organizes services into levels.

---

### Q147. Which is the best combination for a web-based academic system with remote users, multiple interfaces, shared grades/courses database, and security layers?
A. Pipe-and-filter only  
B. No architectural structure  
C. Client-server + MVC + repository + layered architecture  
D. Compiler architecture only  

**Answer: C**  
**Justification:** The requirements imply remote access, UI separation, shared data, and protected layers.

---

### Q148. Which is the best combination for a compiler with separate analysis and generation stages?
A. Physical view only  
B. MVC only  
C. Client-server only  
D. Pipe-and-filter, possibly with repository/shared structures  

**Answer: D**  
**Justification:** Compiler stages fit pipe-and-filter, while shared structures can fit repository architecture.

---

### Q149. Which pattern would be least suitable as the main pattern for a highly interactive drawing application requiring immediate continuous user feedback?
A. Layered architecture  
B. Client-server  
C. MVC  
D. Pipe and filter  

**Answer: D**  
**Justification:** Pipe-and-filter is not very suitable for highly interactive systems.

---

### Q150. Which statement about architectural patterns is most accurate?
A. They remove the need for requirements analysis  
B. They capture proven design practices and can be instantiated in different ways  
C. They are exact source-code files copied into every system  
D. They apply only to compilers  

**Answer: B**  
**Justification:** Architectural patterns are reusable descriptions of good architectural practice.
