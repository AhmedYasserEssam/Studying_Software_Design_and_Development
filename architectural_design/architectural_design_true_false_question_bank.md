# Chapter 6 Architectural Design — True/False Question Bank

Source basis: Week 11 / Chapter 6 Architectural Design lecture and the final exam structure.  
Format: **Statement → Answer → Justification**.  
For **False** statements, the corrected statement is included.

---

## Section 1 — Architectural Design Basics

1. **Architectural design is concerned with the overall organization and structure of a software system.**  
   **Answer:** True  
   **Justification:** Architecture identifies the main structural components of a system and their relationships.

2. **Architectural design focuses only on classes, methods, and detailed algorithms.**  
   **Answer:** False  
   **Correct statement:** Detailed classes, methods, and algorithms belong more to software design; architectural design focuses on system structure, components, distribution, and major design decisions.  
   **Justification:** Architecture works at a higher level of abstraction than detailed design.

3. **Architectural design links requirements engineering and design.**  
   **Answer:** True  
   **Justification:** It translates system requirements, especially non-functional requirements, into a high-level system structure.

4. **The output of architectural design is an architectural model.**  
   **Answer:** True  
   **Justification:** The architectural model describes how the system is organized as communicating components.

5. **Software architecture and software design are exactly the same thing.**  
   **Answer:** False  
   **Correct statement:** Software architecture focuses on high-level system organization, while software design focuses on lower-level details such as classes, methods, and logic.  
   **Justification:** Architecture manages uncertainty; design reduces or avoids uncertainty through detailed decisions.

6. **Architecture manages uncertainty because it deals with scalability, integration, future changes, and technology choices.**  
   **Answer:** True  
   **Justification:** These concerns are usually not fully predictable early in development.

7. **Software design manages uncertainty more than software architecture.**  
   **Answer:** False  
   **Correct statement:** Software architecture manages uncertainty; software design aims to make implementation details clear and deterministic.  
   **Justification:** Architectural decisions are made while many future conditions are still uncertain.

8. **An early stage of agile development often includes designing an overall system architecture.**  
   **Answer:** True  
   **Justification:** Even agile processes usually need an initial architectural direction.

9. **Refactoring a system architecture is usually inexpensive.**  
   **Answer:** False  
   **Correct statement:** Refactoring architecture is usually expensive because it affects many components.  
   **Justification:** Architecture defines system-wide structure and relationships.

10. **Architecture in the small is concerned with the architecture of individual programs.**  
    **Answer:** True  
    **Justification:** It focuses on decomposition inside a single program.

11. **Architecture in the large is concerned with complex enterprise systems distributed over several computers or organizations.**  
    **Answer:** True  
    **Justification:** It deals with systems composed of multiple systems, programs, and components.

12. **Architecture in the small focuses mainly on enterprise-wide distributed systems.**  
    **Answer:** False  
    **Correct statement:** Architecture in the small focuses on individual programs; architecture in the large focuses on enterprise-wide distributed systems.  
    **Justification:** The two terms describe different scales of architecture.

13. **A software architecture describes how a software system is organized.**  
    **Answer:** True  
    **Justification:** This is one of the key definitions of software architecture.

14. **Architecture decisions affect only functional requirements.**  
    **Answer:** False  
    **Correct statement:** Architectural decisions strongly affect non-functional requirements such as performance, security, availability, safety, and maintainability.  
    **Justification:** Many quality attributes depend on architecture.

15. **Architectural design is a creative process, so the exact process may vary between systems.**  
    **Answer:** True  
    **Justification:** Different system types require different architectural decisions.

---

## Section 2 — Architectural Representations and Models

16. **Informal box-and-line diagrams are commonly used to document software architectures.**  
    **Answer:** True  
    **Justification:** They are frequently used because they are simple and easy for stakeholders to understand.

17. **Box-and-line diagrams always have precise and unambiguous semantics.**  
    **Answer:** False  
    **Correct statement:** Box-and-line diagrams are often criticized because they lack precise semantics.  
    **Justification:** They may not show relationship types or externally visible properties.

18. **Informal architectural diagrams can be useful for stakeholder communication.**  
    **Answer:** True  
    **Justification:** Their simplicity helps stakeholders discuss the system without being overloaded by detail.

19. **Informal diagrams are always sufficient for complete architectural documentation.**  
    **Answer:** False  
    **Correct statement:** Informal diagrams may support communication, but complete documentation may require more precise models showing components, interfaces, and connections.  
    **Justification:** Informal diagrams often omit important semantic details.

20. **Semi-formal architectural languages include standardized notations such as UML component and deployment diagrams.**  
    **Answer:** True  
    **Justification:** UML provides standardized visual representations.

21. **Semi-formal notations have strict mathematical semantics.**  
    **Answer:** False  
    **Correct statement:** Semi-formal notations are standardized and easier to understand, but they may still allow ambiguity.  
    **Justification:** Strict mathematical semantics belong to formal languages.

22. **Formal architectural languages are mathematically precise.**  
    **Answer:** True  
    **Justification:** They have unambiguous semantics and can support rigorous analysis.

23. **Formal languages are mainly used because they are easier for all stakeholders to understand than informal diagrams.**  
    **Answer:** False  
    **Correct statement:** Formal languages are used for precision and rigorous analysis, not mainly for stakeholder simplicity.  
    **Justification:** They are usually harder for non-technical stakeholders.

24. **Architectural models can be used to support discussion about system design.**  
    **Answer:** True  
    **Justification:** High-level models help stakeholders reason about the system.

25. **Architectural models can also document an architecture after it has been designed.**  
    **Answer:** True  
    **Justification:** Documentation models show components, interfaces, and connections.

26. **The same architectural model always shows every useful perspective of the system.**  
    **Answer:** False  
    **Correct statement:** Each architectural model usually shows one view or perspective, so multiple views may be needed.  
    **Justification:** Different stakeholders need different architectural information.

27. **A high-level architectural view is useful because it is not cluttered with excessive detail.**  
    **Answer:** True  
    **Justification:** It helps stakeholders understand and discuss the system as a whole.

28. **Complete architectural documentation should normally show components, interfaces, and connections.**  
    **Answer:** True  
    **Justification:** These are essential architectural elements.

29. **Architectural diagrams are useful only for developers, not for other stakeholders.**  
    **Answer:** False  
    **Correct statement:** Architectural diagrams can support communication among many stakeholders, including developers, managers, customers, and maintainers.  
    **Justification:** Architecture is a shared discussion tool.

30. **The required semantics of an architectural model depend on how the model will be used.**  
    **Answer:** True  
    **Justification:** Communication models may be informal, while verification models may require precision.

---

## Section 3 — Advantages of Explicit Architecture

31. **Explicit architecture supports stakeholder communication.**  
    **Answer:** True  
    **Justification:** Architecture can be used as a focus of discussion by system stakeholders.

32. **Explicit architecture makes it possible to analyze whether non-functional requirements can be met.**  
    **Answer:** True  
    **Justification:** Architecture affects quality attributes such as security, performance, and availability.

33. **Explicit architecture prevents any need for later system analysis.**  
    **Answer:** False  
    **Correct statement:** Explicit architecture supports system analysis, but it does not eliminate the need for analysis.  
    **Justification:** Architectural decisions still need evaluation and trade-off analysis.

34. **Explicit architecture can support large-scale reuse.**  
    **Answer:** True  
    **Justification:** Architectures may be reusable across a range of related systems.

35. **Product-line architectures are architectures designed for reuse across related products.**  
    **Answer:** True  
    **Justification:** They provide a shared core architecture with product-specific variations.

36. **Stakeholder communication is unrelated to architecture.**  
    **Answer:** False  
    **Correct statement:** Stakeholder communication is one of the major advantages of explicit architecture.  
    **Justification:** Architecture gives stakeholders a shared view for discussion.

37. **Architecture can be reused only at the class level.**  
    **Answer:** False  
    **Correct statement:** Architecture can be reused at a large scale across related systems.  
    **Justification:** Architectural reuse is broader than code or class reuse.

38. **System analysis through architecture is especially useful for evaluating non-functional requirements.**  
    **Answer:** True  
    **Justification:** Quality attributes are strongly influenced by structural decisions.

39. **A reusable architecture may reduce effort when building similar systems.**  
    **Answer:** True  
    **Justification:** Common structures and decisions can be reused instead of redesigned.

40. **Explicit architecture is useful only after implementation is complete.**  
    **Answer:** False  
    **Correct statement:** Explicit architecture is useful before and during implementation for planning, analysis, communication, and reuse.  
    **Justification:** Architecture guides development decisions.

---

## Section 4 — Architectural Design Decisions

41. **Architectural design decisions include choosing architectural styles or patterns.**  
    **Answer:** True  
    **Justification:** Selecting patterns such as MVC, layered, repository, client-server, and pipe-and-filter is a common architectural decision.

42. **Architectural decisions include deciding how components will be controlled and coordinated.**  
    **Answer:** True  
    **Justification:** Control strategies include centralized, event-driven, sequential, and distributed control.

43. **Centralized control means one component controls or coordinates the operation of other components.**  
    **Answer:** True  
    **Justification:** A controller or orchestrator directs system behavior.

44. **Centralized control can never become a bottleneck.**  
    **Answer:** False  
    **Correct statement:** Centralized control is easy to manage but may become a bottleneck.  
    **Justification:** Too much coordination through one component can reduce scalability.

45. **Event-driven control is decentralized because components react to events rather than waiting for one central controller.**  
    **Answer:** True  
    **Justification:** Components emit and respond to events independently.

46. **Event-driven systems are always easier to trace and debug than centralized systems.**  
    **Answer:** False  
    **Correct statement:** Event-driven systems can be flexible and scalable, but they may be harder to trace and debug.  
    **Justification:** Control flow may be distributed across many event handlers.

47. **Pipeline or sequential control executes components in a defined order.**  
    **Answer:** True  
    **Justification:** Processing flows from one step to the next.

48. **Peer-to-peer control has a single central point of control.**  
    **Answer:** False  
    **Correct statement:** Peer-to-peer control allows components to communicate directly without a single central controller.  
    **Justification:** Coordination is distributed among peers.

49. **Architectural decisions include how structural components are decomposed into sub-components.**  
    **Answer:** True  
    **Justification:** Decomposition determines system modules and responsibilities.

50. **Functional decomposition breaks the system into parts based on features or responsibilities.**  
    **Answer:** True  
    **Justification:** Examples include order management, customer management, and product catalog.

51. **Separation of concerns means mixing unrelated responsibilities into one component.**  
    **Answer:** False  
    **Correct statement:** Separation of concerns means each component should focus on one clear responsibility.  
    **Justification:** It reduces complexity and improves maintainability.

52. **High cohesion means related functionality is kept together.**  
    **Answer:** True  
    **Justification:** Cohesive components have strongly related responsibilities.

53. **Low coupling means components depend heavily on each other.**  
    **Answer:** False  
    **Correct statement:** Low coupling means components have minimal dependencies on each other.  
    **Justification:** This improves maintainability and changeability.

54. **Components that change together may reasonably be kept together.**  
    **Answer:** True  
    **Justification:** Grouping by change reduces ripple effects.

55. **Reusable functionality may be separated into its own component.**  
    **Answer:** True  
    **Justification:** A logging module is an example of reusable functionality.

56. **Architectural organization should ignore non-functional requirements.**  
    **Answer:** False  
    **Correct statement:** Architectural organization should be chosen partly to satisfy non-functional requirements.  
    **Justification:** Quality attributes are architecture-sensitive.

57. **The fundamental approach used to structure a system may be layered, service-based, microservices-based, or data-centered.**  
    **Answer:** True  
    **Justification:** These are common organizing principles.

58. **Systems in the same domain often have similar architectures.**  
    **Answer:** True  
    **Justification:** Common domain concepts lead to similar structures.

59. **Application product lines use a core architecture with variants for different customers.**  
    **Answer:** True  
    **Justification:** This supports reuse across related systems.

60. **Architectural patterns prevent the need for any system-specific design decisions.**  
    **Answer:** False  
    **Correct statement:** Architectural patterns provide reusable templates, but they still must be adapted to system-specific requirements.  
    **Justification:** Patterns capture general solutions, not complete final designs.

---

## Section 5 — Non-Functional Requirements and Architecture

61. **Performance can be improved by localizing critical operations and minimizing communication.**  
    **Answer:** True  
    **Justification:** Less communication overhead can improve performance.

62. **Performance usually favors fine-grained components with many interactions.**  
    **Answer:** False  
    **Correct statement:** Performance may favor larger components and reduced communication.  
    **Justification:** Fine-grained components can increase communication overhead.

63. **Security can be supported by layered architecture with critical assets in inner layers.**  
    **Answer:** True  
    **Justification:** Layers can isolate and protect sensitive assets.

64. **Safety is concerned mainly with malicious attacks.**  
    **Answer:** False  
    **Correct statement:** Safety is concerned with preventing accidental harm or failures; security is concerned with protection from intentional attacks.  
    **Justification:** The lecture distinguishes safety from security.

65. **Security protects the system from intentional attacks.**  
    **Answer:** True  
    **Justification:** Security addresses malicious threats.

66. **Safety-critical features may be localized in a small number of sub-systems.**  
    **Answer:** True  
    **Justification:** Localizing safety-critical behavior makes it easier to analyze and protect.

67. **Availability can be improved using redundancy and fault-tolerance mechanisms.**  
    **Answer:** True  
    **Justification:** Redundant components allow service continuity after failures.

68. **Maintainability is usually improved by using fine-grained, replaceable components.**  
    **Answer:** True  
    **Justification:** Smaller replaceable components are easier to modify independently.

69. **Performance and maintainability requirements can conflict.**  
    **Answer:** True  
    **Justification:** Performance may favor larger components, while maintainability may favor smaller components.

70. **If performance and maintainability conflict, no architectural compromise is possible.**  
    **Answer:** False  
    **Correct statement:** A compromise may be found, possibly by using different patterns for different parts of the system.  
    **Justification:** Architecture often involves trade-offs.

71. **Security is now often a critical architectural concern.**  
    **Answer:** True  
    **Justification:** Modern systems commonly need security while satisfying other requirements.

72. **Using different architectural patterns in separate parts of a system can help balance conflicting requirements.**  
    **Answer:** True  
    **Justification:** Different subsystems may optimize for different quality attributes.

73. **Availability and fault tolerance are unrelated.**  
    **Answer:** False  
    **Correct statement:** Fault-tolerance mechanisms can improve availability.  
    **Justification:** Systems remain available when components fail.

74. **Critical assets should usually be left exposed in the outermost system layer for security.**  
    **Answer:** False  
    **Correct statement:** Critical assets should be protected in inner layers.  
    **Justification:** Layering can provide controlled access.

75. **Non-functional requirements may shape the choice of architectural pattern.**  
    **Answer:** True  
    **Justification:** Patterns have different strengths and weaknesses for quality attributes.

---

## Section 6 — Architectural Views

76. **An architectural view presents one perspective of a system architecture.**  
    **Answer:** True  
    **Justification:** Different views show different architectural concerns.

77. **Architectural documentation usually needs multiple views.**  
    **Answer:** True  
    **Justification:** One model cannot show all useful architectural information.

78. **The logical view shows key abstractions such as objects or object classes.**  
    **Answer:** True  
    **Justification:** The logical/conceptual view focuses on main system abstractions.

79. **The process view shows how the system is composed of interacting runtime processes.**  
    **Answer:** True  
    **Justification:** It focuses on runtime behavior and process interaction.

80. **The development view shows how software is decomposed for development.**  
    **Answer:** True  
    **Justification:** It is useful for development organization.

81. **The physical view shows hardware and software deployment across processors.**  
    **Answer:** True  
    **Justification:** It describes distribution across physical nodes.

82. **The physical view is best represented using a deployment diagram.**  
    **Answer:** True  
    **Justification:** Deployment diagrams show hardware nodes and deployed software.

83. **The development view is commonly represented using component diagrams.**  
    **Answer:** True  
    **Justification:** Component diagrams show software components and their organization.

84. **The process view may be represented using activity or sequence diagrams.**  
    **Answer:** True  
    **Justification:** These diagrams show behavior, flow, and interaction.

85. **The logical/conceptual view may be represented using block diagrams.**  
    **Answer:** True  
    **Justification:** Block diagrams can show key abstractions and relationships.

86. **A deployment diagram is mainly used to show class inheritance.**  
    **Answer:** False  
    **Correct statement:** A deployment diagram shows physical hardware nodes and how software components are deployed across them.  
    **Justification:** Class inheritance belongs to class diagrams.

87. **A component diagram is more related to development structure than physical deployment.**  
    **Answer:** True  
    **Justification:** It shows software decomposition into components.

88. **The 4+1 view model contains only one architectural view.**  
    **Answer:** False  
    **Correct statement:** The 4+1 view model contains multiple views, including logical, process, development, and physical views, plus scenarios/use cases.  
    **Justification:** The model is specifically multi-view.

89. **Different architectural views can be useful for different stakeholders.**  
    **Answer:** True  
    **Justification:** Developers, deployers, testers, and managers need different architectural information.

90. **Architectural views are unrelated to documentation.**  
    **Answer:** False  
    **Correct statement:** Architectural views are central to documenting architecture from different perspectives.  
    **Justification:** Documentation often requires several views.

---

## Section 7 — Architectural Patterns in General

91. **Architectural patterns represent reusable knowledge about system organization.**  
    **Answer:** True  
    **Justification:** Patterns describe proven architectural solutions.

92. **An architectural pattern is a stylized description of good design practice.**  
    **Answer:** True  
    **Justification:** Patterns capture tried-and-tested solutions.

93. **Patterns should include when they are useful and when they are not useful.**  
    **Answer:** True  
    **Justification:** Applicability and limitations are part of pattern knowledge.

94. **Patterns can be represented using tables and graphical descriptions.**  
    **Answer:** True  
    **Justification:** The lecture presents pattern descriptions in tabular and visual forms.

95. **Architectural patterns guarantee that a system will satisfy all requirements.**  
    **Answer:** False  
    **Correct statement:** Architectural patterns provide reusable solutions but must be evaluated against the system’s requirements.  
    **Justification:** Every pattern has trade-offs and disadvantages.

96. **The architecture of a system may use more than one pattern.**  
    **Answer:** True  
    **Justification:** Different parts of a system may use different patterns.

97. **Using multiple patterns is always incorrect because one system must have only one architecture style.**  
    **Answer:** False  
    **Correct statement:** A system may combine patterns when different parts have different needs.  
    **Justification:** Combining patterns can help satisfy conflicting non-functional requirements.

98. **Architectural patterns describe advantages and disadvantages.**  
    **Answer:** True  
    **Justification:** Pattern descriptions include trade-offs.

99. **An architectural pattern is the same as finished source code.**  
    **Answer:** False  
    **Correct statement:** An architectural pattern is a high-level reusable design structure, not a complete implementation.  
    **Justification:** Patterns must be instantiated in a specific system.

100. **Patterns support sharing and reusing architectural knowledge.**  
     **Answer:** True  
     **Justification:** That is one of their main purposes.

---

## Section 8 — MVC Pattern

101. **MVC stands for Model-View-Controller.**  
     **Answer:** True  
     **Justification:** It separates data, presentation, and user interaction.

102. **In MVC, the Model manages system data and operations on that data.**  
     **Answer:** True  
     **Justification:** The Model represents data and business-related operations.

103. **In MVC, the View manages how data is presented to the user.**  
     **Answer:** True  
     **Justification:** The View defines presentation.

104. **In MVC, the Controller handles user interactions such as clicks or key presses.**  
     **Answer:** True  
     **Justification:** The Controller receives user input and coordinates with Model and View.

105. **MVC combines presentation, interaction, and data into one component.**  
     **Answer:** False  
     **Correct statement:** MVC separates presentation, interaction, and data into View, Controller, and Model components.  
     **Justification:** Separation is the main purpose of MVC.

106. **MVC is useful when there are multiple ways to view and interact with data.**  
     **Answer:** True  
     **Justification:** The same data can be presented in different ways.

107. **MVC is useful when future requirements for interaction and presentation are uncertain.**  
     **Answer:** True  
     **Justification:** It allows presentation and interaction to change independently from data.

108. **MVC is best when the data model and interactions are extremely simple and no presentation changes are expected.**  
     **Answer:** False  
     **Correct statement:** MVC can add unnecessary complexity when the data model and interactions are simple.  
     **Justification:** MVC may require additional code.

109. **MVC allows data to change independently of its representation.**  
     **Answer:** True  
     **Justification:** Model and View are separated.

110. **MVC supports presenting the same data in different ways.**  
     **Answer:** True  
     **Justification:** Multiple Views can represent the same Model.

111. **A disadvantage of MVC is that it can introduce extra code and complexity.**  
     **Answer:** True  
     **Justification:** Separating components may be overkill for simple systems.

112. **In MVC, the View is responsible for long-term database storage.**  
     **Answer:** False  
     **Correct statement:** The Model is responsible for system data; the View is responsible for presentation.  
     **Justification:** MVC assigns separate responsibilities.

113. **In MVC, the Controller directly represents the system’s persistent data.**  
     **Answer:** False  
     **Correct statement:** The Controller manages user interaction; the Model manages data.  
     **Justification:** Controllers coordinate input, not persistent data representation.

114. **MVC can be used in web-based application systems.**  
     **Answer:** True  
     **Justification:** The lecture gives a web application as an MVC example.

115. **MVC and layered architecture are identical patterns.**  
     **Answer:** False  
     **Correct statement:** MVC separates model, view, and controller responsibilities; layered architecture organizes the system into service-providing layers.  
     **Justification:** They solve different structural problems.

---

## Section 9 — Layered Architecture

116. **Layered architecture organizes a system into layers with related functionality in each layer.**  
     **Answer:** True  
     **Justification:** Each layer groups related services.

117. **In layered architecture, a layer provides services to the layer above it.**  
     **Answer:** True  
     **Justification:** Lower layers provide services used by higher layers.

118. **The lowest layers usually represent core services used throughout the system.**  
     **Answer:** True  
     **Justification:** Core services are placed lower in the architecture.

119. **Layered architecture is used to model the interfacing of subsystems.**  
     **Answer:** True  
     **Justification:** Layers define controlled interfaces between levels.

120. **Layered architecture prevents incremental development.**  
     **Answer:** False  
     **Correct statement:** Layered architecture can support incremental development of subsystems in different layers.  
     **Justification:** Teams may work on separate layers.

121. **When a layer interface changes, only adjacent layers may be affected.**  
     **Answer:** True  
     **Justification:** Layering can limit change propagation.

122. **Layered architecture is useful when building new facilities on top of existing systems.**  
     **Answer:** True  
     **Justification:** New layers can be added above existing functionality.

123. **Layered architecture is useful when development is divided among teams responsible for different layers.**  
     **Answer:** True  
     **Justification:** Layer boundaries support team separation.

124. **Layered architecture can be useful for multi-level security.**  
     **Answer:** True  
     **Justification:** Security controls can be placed across layers, with critical assets protected inside.

125. **Layered architecture always gives perfect separation between layers.**  
     **Answer:** False  
     **Correct statement:** Clean separation between layers is often difficult in practice.  
     **Justification:** Higher layers may sometimes need direct access to lower layers.

126. **Layered architecture can cause performance problems.**  
     **Answer:** True  
     **Justification:** Requests may pass through multiple layers, increasing overhead.

127. **A major advantage of layered architecture is that entire layers can be replaced if their interfaces are maintained.**  
     **Answer:** True  
     **Justification:** Stable interfaces allow layer replacement.

128. **Layered architecture is always unsuitable for security-critical systems.**  
     **Answer:** False  
     **Correct statement:** Layered architecture can be useful for security-critical systems, especially where multi-level security is required.  
     **Justification:** Layers can isolate critical assets.

129. **In layered architecture, high-level layers should always bypass lower adjacent layers.**  
     **Answer:** False  
     **Correct statement:** Ideally, a high-level layer uses the services of the adjacent layer below it, though bypassing may occur in practice.  
     **Justification:** Layer discipline is part of the pattern.

130. **Layered architecture and MVC can be combined in a web application.**  
     **Answer:** True  
     **Justification:** MVC may structure presentation logic while layers organize broader system services.

---

## Section 10 — Repository Architecture

131. **Repository architecture uses a central repository accessible to system components.**  
     **Answer:** True  
     **Justification:** Components share data through the repository.

132. **In repository architecture, components usually interact directly with one another rather than through shared data.**  
     **Answer:** False  
     **Correct statement:** In repository architecture, components do not interact directly; they interact through the central repository.  
     **Justification:** The repository is the communication medium.

133. **Repository architecture is useful when large amounts of information must be stored for a long time.**  
     **Answer:** True  
     **Justification:** The lecture identifies long-term large-volume information as a repository use case.

134. **Repository architecture is useful in data-driven systems where data insertion can trigger actions.**  
     **Answer:** True  
     **Justification:** Adding data to the repository can activate tools or processes.

135. **Repository architecture makes components independent because they do not need to know about one another.**  
     **Answer:** True  
     **Justification:** Components communicate indirectly through shared data.

136. **Repository architecture prevents consistent data management such as backup.**  
     **Answer:** False  
     **Correct statement:** Repository architecture can support consistent data management because all data is in one place.  
     **Justification:** Centralization simplifies backup and consistency policies.

137. **A repository is a possible single point of failure.**  
     **Answer:** True  
     **Justification:** If the repository fails, the whole system may be affected.

138. **Repository architecture may be inefficient because all communication goes through the repository.**  
     **Answer:** True  
     **Justification:** Centralized data access can create overhead.

139. **Distributing a repository across several computers may be difficult.**  
     **Answer:** True  
     **Justification:** Distributed data consistency and coordination can be complex.

140. **Repository architecture is never used in IDE-like systems.**  
     **Answer:** False  
     **Correct statement:** Repository architecture can be used in IDE-like systems where tools share design information.  
     **Justification:** The lecture gives an IDE repository example.

141. **Repository architecture is appropriate when components must share common persistent data.**  
     **Answer:** True  
     **Justification:** A shared repository supports common access.

142. **Repository architecture completely eliminates the need for data consistency mechanisms.**  
     **Answer:** False  
     **Correct statement:** Repository architecture can help centralize consistency management, but consistency still requires proper mechanisms and policies.  
     **Justification:** Centralization does not automatically guarantee correctness.

143. **A repository pattern may be combined with client-server architecture.**  
     **Answer:** True  
     **Justification:** Clients and servers may access shared central data.

144. **A repository pattern is always the best choice for small systems with no shared persistent data.**  
     **Answer:** False  
     **Correct statement:** Repository architecture is most useful when there is significant shared data.  
     **Justification:** A central repository may be unnecessary overhead for small independent systems.

145. **Repository architecture can make changes made by one component available to other components.**  
     **Answer:** True  
     **Justification:** Shared data allows propagation of changes.

---

## Section 11 — Client-Server Architecture

146. **Client-server architecture organizes functionality into services delivered by servers and used by clients.**  
     **Answer:** True  
     **Justification:** Clients request services from servers.

147. **Client-server architecture is a distributed system model.**  
     **Answer:** True  
     **Justification:** It shows how data and processing are distributed across components.

148. **Client-server architecture can be implemented only across multiple physical machines.**  
     **Answer:** False  
     **Correct statement:** Client-server architecture can be implemented on a single computer, although it is commonly distributed over a network.  
     **Justification:** The pattern is logical, not necessarily physically distributed.

149. **A client-server system includes clients, servers, and a network connecting them.**  
     **Answer:** True  
     **Justification:** These are the basic components of the pattern.

150. **Servers provide services such as printing, data management, or application functionality.**  
     **Answer:** True  
     **Justification:** Servers provide specialized services to clients.

151. **Clients provide services to servers in the standard client-server pattern.**  
     **Answer:** False  
     **Correct statement:** Servers provide services; clients request and use those services.  
     **Justification:** This is the defining relationship of the pattern.

152. **Client-server architecture is useful when a shared database must be accessed from multiple locations.**  
     **Answer:** True  
     **Justification:** Remote clients can access server-side data services.

153. **Client-server architecture can be useful when system load is variable because servers can be replicated.**  
     **Answer:** True  
     **Justification:** Replication can help handle changing demand.

154. **A benefit of client-server architecture is that general functionality can be available to all clients.**  
     **Answer:** True  
     **Justification:** Shared services avoid reimplementing common functionality in every client.

155. **In client-server architecture, each service may become a single point of failure.**  
     **Answer:** True  
     **Justification:** Failure of a server can make its service unavailable.

156. **Client-server architecture is immune to denial-of-service attacks.**  
     **Answer:** False  
     **Correct statement:** Client-server architecture may be susceptible to denial-of-service attacks against services.  
     **Justification:** Servers are exposed service endpoints.

157. **Performance in client-server systems may be unpredictable because it depends on the network.**  
     **Answer:** True  
     **Justification:** Network latency and reliability affect performance.

158. **Management problems may occur if servers are owned by different organizations.**  
     **Answer:** True  
     **Justification:** Distributed ownership complicates administration and coordination.

159. **Client-server architecture is unsuitable for web-based information systems.**  
     **Answer:** False  
     **Correct statement:** Web-based information systems are often implemented as multi-tier client-server architectures.  
     **Justification:** Browsers, web servers, application servers, and database servers form a client-server structure.

160. **A client-server architecture can be combined with layered architecture.**  
     **Answer:** True  
     **Justification:** Multi-tier systems often use both distribution and layers.

---

## Section 12 — Pipe-and-Filter Architecture

161. **Pipe-and-filter architecture organizes processing as a sequence of transformations.**  
     **Answer:** True  
     **Justification:** Filters transform input data into output data.

162. **In pipe-and-filter architecture, data flows from one processing component to another.**  
     **Answer:** True  
     **Justification:** Pipes carry data between filters.

163. **A filter performs one type of data transformation.**  
     **Answer:** True  
     **Justification:** Each filter is a discrete processing component.

164. **Pipe-and-filter architecture is common in data-processing applications.**  
     **Answer:** True  
     **Justification:** It fits workflows with separate processing stages.

165. **When transformations are sequential, pipe-and-filter may be called batch sequential.**  
     **Answer:** True  
     **Justification:** Sequential stages process data in order.

166. **Pipe-and-filter architecture is especially suitable for highly interactive systems.**  
     **Answer:** False  
     **Correct statement:** Pipe-and-filter architecture is not really suitable for interactive systems.  
     **Justification:** It fits staged data transformation better than interactive feedback.

167. **Pipe-and-filter architecture is easy to understand when the business process itself has a workflow structure.**  
     **Answer:** True  
     **Justification:** Workflow stages map naturally to filters.

168. **Pipe-and-filter architecture supports transformation reuse.**  
     **Answer:** True  
     **Justification:** Filters can potentially be reused in different pipelines.

169. **Adding new transformations to a pipe-and-filter system can be straightforward.**  
     **Answer:** True  
     **Justification:** New filters can be inserted into the workflow.

170. **Pipe-and-filter systems can be implemented only sequentially, never concurrently.**  
     **Answer:** False  
     **Correct statement:** Pipe-and-filter systems can be implemented sequentially or concurrently.  
     **Justification:** Filters may run in parallel if data flow allows.

171. **A disadvantage of pipe-and-filter architecture is that communicating transformations must agree on data format.**  
     **Answer:** True  
     **Justification:** Filters must parse and produce compatible data.

172. **Pipe-and-filter architecture has no overhead because filters never parse or unparse data.**  
     **Answer:** False  
     **Correct statement:** Pipe-and-filter architecture may have overhead because each transformation may need to parse input and unparse output.  
     **Justification:** Data format conversion can be costly.

173. **Incompatible data structures may limit reuse of pipe-and-filter transformations.**  
     **Answer:** True  
     **Justification:** Filters must use compatible formats to be connected.

174. **Invoice processing can be modeled using pipe-and-filter architecture.**  
     **Answer:** True  
     **Justification:** The lecture includes invoice/payment processing examples.

175. **Pipe-and-filter architecture is unrelated to compiler design.**  
     **Answer:** False  
     **Correct statement:** A compiler can be organized using a pipe-and-filter architecture.  
     **Justification:** Compiler stages can form a processing pipeline.

---

## Section 13 — Application Architectures

176. **Application systems are designed to meet organizational needs.**  
     **Answer:** True  
     **Justification:** Application systems support business or organizational goals.

177. **Businesses often have common application architectures because they share similar requirements.**  
     **Answer:** True  
     **Justification:** Similar domains lead to similar architectural structures.

178. **A generic application architecture is also called a reference architecture.**  
     **Answer:** True  
     **Justification:** It is a template for a type of software system.

179. **A reference architecture cannot be configured or adapted.**  
     **Answer:** False  
     **Correct statement:** A reference architecture can be configured and adapted to create a specific system.  
     **Justification:** It is a reusable template, not a fixed final system.

180. **Application architectures may be used as a starting point for architectural design.**  
     **Answer:** True  
     **Justification:** They provide a reusable structure.

181. **Application architectures can act as a design checklist.**  
     **Answer:** True  
     **Justification:** They help ensure major components and concerns are considered.

182. **Application architectures can help organize the work of the development team.**  
     **Answer:** True  
     **Justification:** Architectural structure can guide team responsibilities.

183. **Application architectures are useless for assessing reusable components.**  
     **Answer:** False  
     **Correct statement:** Application architectures can help assess components for reuse.  
     **Justification:** They identify common component roles.

184. **Application architectures provide a vocabulary for discussing application types.**  
     **Answer:** True  
     **Justification:** They give shared terms for system organization.

185. **Data processing applications process data in batches without explicit user intervention during processing.**  
     **Answer:** True  
     **Justification:** This is the lecture definition of data processing applications.

186. **Transaction processing applications process user requests and update information in a system database.**  
     **Answer:** True  
     **Justification:** They are data-centered interactive systems.

187. **Event processing systems depend on interpreting events from the system environment.**  
     **Answer:** True  
     **Justification:** System actions are triggered by events.

188. **Language processing systems accept a language as input and generate another representation.**  
     **Answer:** True  
     **Justification:** Compilers and interpreters are examples.

189. **E-commerce and reservation systems are examples of transaction processing systems.**  
     **Answer:** True  
     **Justification:** They process user transactions involving stored data.

190. **Compilers and command interpreters are examples of language processing systems.**  
     **Answer:** True  
     **Justification:** They process formal or command languages.

---

## Section 14 — Transaction Processing and Information Systems

191. **Transaction processing systems process user requests for information from a database or requests to update a database.**  
     **Answer:** True  
     **Justification:** This is the core role of transaction processing systems.

192. **From a user perspective, a transaction is any coherent sequence of operations that satisfies a goal.**  
     **Answer:** True  
     **Justification:** Example: finding flight times from one city to another.

193. **Users in transaction processing systems make asynchronous service requests.**  
     **Answer:** True  
     **Justification:** Requests are processed by a transaction manager.

194. **Transaction processing systems are never interactive.**  
     **Answer:** False  
     **Correct statement:** Transaction processing systems are interactive systems that allow database information to be accessed and modified by users.  
     **Justification:** Users submit requests and receive results.

195. **Transaction processing systems may be organized using pipe-and-filter architecture.**  
     **Answer:** True  
     **Justification:** Components may be responsible for input, processing, and output.

196. **An ATM system can be viewed as a transaction processing system.**  
     **Answer:** True  
     **Justification:** It processes user banking transactions.

197. **Information systems can have a generic layered architecture.**  
     **Answer:** True  
     **Justification:** The lecture describes layers such as user interface, communication, retrieval, and database.

198. **Information systems are unrelated to transactions.**  
     **Answer:** False  
     **Correct statement:** Information systems are often transaction-based because interactions usually involve database transactions.  
     **Justification:** Users retrieve and update stored information.

199. **Typical information system layers include user interface, user communications, information retrieval, and system database.**  
     **Answer:** True  
     **Justification:** These are the layers identified in the lecture.

200. **Web-based information systems usually implement user interfaces only through command-line tools.**  
     **Answer:** False  
     **Correct statement:** Web-based information systems usually implement user interfaces using a web browser.  
     **Justification:** The lecture describes browser-based interfaces for web systems.

201. **E-commerce systems are examples of Internet-based resource management systems.**  
     **Answer:** True  
     **Justification:** They accept electronic orders and arrange delivery of goods or services.

202. **A shopping cart in an e-commerce system allows users to place multiple items in separate transactions and pay together.**  
     **Answer:** True  
     **Justification:** This is the lecture’s e-commerce example.

203. **Multi-tier client-server architectures may include web server, application server, and database server.**  
     **Answer:** True  
     **Justification:** These are common server roles in web-based information systems.

204. **The web server is responsible for all user communications in a typical web-based information system.**  
     **Answer:** True  
     **Justification:** The browser communicates with the web server.

205. **The application server handles application-specific logic.**  
     **Answer:** True  
     **Justification:** It implements business/application logic and may handle information retrieval requests.

206. **The database server handles transaction management and moves information to and from the database.**  
     **Answer:** True  
     **Justification:** This is the role described in the lecture.

207. **In a multi-tier web system, the database server usually implements the browser user interface.**  
     **Answer:** False  
     **Correct statement:** The browser/web server handles user communication; the database server handles database access and transaction management.  
     **Justification:** Each tier has a distinct responsibility.

208. **A layered information system architecture can be combined with client-server deployment.**  
     **Answer:** True  
     **Justification:** Logical layers can be deployed across web, application, and database servers.

209. **Transaction processing systems always avoid databases.**  
     **Answer:** False  
     **Correct statement:** Transaction processing systems usually retrieve or update information in a database.  
     **Justification:** Database access is central to transaction processing.

210. **A transaction manager processes user service requests in transaction processing systems.**  
     **Answer:** True  
     **Justification:** The lecture identifies the transaction manager as responsible for processing requests.

---

## Section 15 — Language Processing Systems and Compilers

211. **Language processing systems accept natural or artificial language input.**  
     **Answer:** True  
     **Justification:** They process language specifications.

212. **Language processing systems generate another representation of the input language.**  
     **Answer:** True  
     **Justification:** A compiler generates internal or machine-code representations.

213. **A language processing system may include an interpreter to act on instructions.**  
     **Answer:** True  
     **Justification:** Interpreters execute instructions from the processed language.

214. **Language processing systems are useful when the easiest way to solve a problem is to describe an algorithm or system data.**  
     **Answer:** True  
     **Justification:** Languages allow users to specify algorithms or data descriptions.

215. **Meta-case tools process descriptions and generate tools.**  
     **Answer:** True  
     **Justification:** They process tool descriptions and method rules.

216. **A lexical analyzer converts input language tokens into an internal form.**  
     **Answer:** True  
     **Justification:** This is the lexical analyzer’s role.

217. **A symbol table stores information about names such as variables, classes, and objects.**  
     **Answer:** True  
     **Justification:** It records named entities in the source text.

218. **A syntax analyzer checks the syntax of the language being translated.**  
     **Answer:** True  
     **Justification:** It verifies grammatical structure.

219. **A syntax tree represents the program being compiled.**  
     **Answer:** True  
     **Justification:** It is an internal structural representation.

220. **A semantic analyzer checks semantic correctness using the syntax tree and symbol table.**  
     **Answer:** True  
     **Justification:** It verifies meaning-related correctness.

221. **A code generator walks the syntax tree and generates abstract machine code.**  
     **Answer:** True  
     **Justification:** This is the code generator’s role.

222. **The lexical analyzer is responsible for final code generation.**  
     **Answer:** False  
     **Correct statement:** The lexical analyzer converts input tokens to an internal form; the code generator generates abstract machine code.  
     **Justification:** These are different compiler stages.

223. **The symbol table is irrelevant to semantic analysis.**  
     **Answer:** False  
     **Correct statement:** The semantic analyzer uses the symbol table and syntax tree to check semantic correctness.  
     **Justification:** Name/type information is needed for semantic checks.

224. **A compiler can be represented using repository architecture.**  
     **Answer:** True  
     **Justification:** Compiler components may share a central repository such as a symbol table or intermediate representation.

225. **A compiler can be represented using pipe-and-filter architecture.**  
     **Answer:** True  
     **Justification:** Compiler stages can form a sequence of transformations.

226. **A repository compiler architecture and a pipe-and-filter compiler architecture are exactly the same.**  
     **Answer:** False  
     **Correct statement:** A repository compiler architecture centers on shared data, while a pipe-and-filter compiler architecture organizes compilation as a sequence of transformations.  
     **Justification:** They structure communication differently.

227. **A command interpreter is a language processing system.**  
     **Answer:** True  
     **Justification:** It accepts commands in a language and executes them.

228. **A compiler is unrelated to architectural patterns.**  
     **Answer:** False  
     **Correct statement:** A compiler can be described using architectural patterns such as repository or pipe-and-filter.  
     **Justification:** Compiler components can be architecturally organized.

229. **The syntax analyzer checks whether program statements follow the grammar of the language.**  
     **Answer:** True  
     **Justification:** Syntax analysis is grammar checking.

230. **The semantic analyzer checks only spelling errors in the source program.**  
     **Answer:** False  
     **Correct statement:** The semantic analyzer checks meaning-related correctness, such as valid use of names and constructs, using the syntax tree and symbol table.  
     **Justification:** Spelling/token recognition is closer to lexical processing.

---

## Section 16 — Combined Pattern and Scenario Questions

231. **A web-based learning system may combine client-server, layered, MVC, and repository patterns.**  
     **Answer:** True  
     **Justification:** Web/mobile access, separated UI/data logic, protected layers, and shared academic data can require multiple patterns.

232. **A system that has multiple user interfaces for the same data may benefit from MVC.**  
     **Answer:** True  
     **Justification:** MVC supports multiple presentations of the same model.

233. **A system with a central database shared by many subsystems may benefit from repository architecture.**  
     **Answer:** True  
     **Justification:** Repository architecture supports shared persistent data.

234. **A system with remote users accessing services over a network may benefit from client-server architecture.**  
     **Answer:** True  
     **Justification:** Clients can request services from distributed servers.

235. **A system that generates reports through several processing stages may benefit from pipe-and-filter architecture.**  
     **Answer:** True  
     **Justification:** Staged transformations match pipe-and-filter.

236. **A system that requires multi-level security may benefit from layered architecture.**  
     **Answer:** True  
     **Justification:** Layers can isolate critical assets.

237. **Using repository architecture automatically removes all availability risks.**  
     **Answer:** False  
     **Correct statement:** Repository architecture may create availability risks because the repository can become a single point of failure.  
     **Justification:** Centralization increases dependence on the repository.

238. **Using client-server architecture automatically guarantees predictable performance.**  
     **Answer:** False  
     **Correct statement:** Client-server architecture may have unpredictable performance because it depends on network conditions and server load.  
     **Justification:** Distributed communication introduces variability.

239. **Using layered architecture automatically guarantees high performance.**  
     **Answer:** False  
     **Correct statement:** Layered architecture may reduce performance because requests may pass through multiple layers.  
     **Justification:** Multiple interpretation levels add overhead.

240. **Using MVC automatically simplifies every system.**  
     **Answer:** False  
     **Correct statement:** MVC may add code and complexity when the data model and interactions are simple.  
     **Justification:** Separation has overhead.

241. **Using pipe-and-filter architecture requires agreement on data formats between filters.**  
     **Answer:** True  
     **Justification:** Filters must exchange compatible input and output.

242. **A scenario-based architectural-pattern answer should justify the selected pattern using system requirements.**  
     **Answer:** True  
     **Justification:** Pattern selection depends on functional and non-functional needs.

243. **A strong architectural answer may discuss disadvantages as well as advantages.**  
     **Answer:** True  
     **Justification:** Patterns involve trade-offs.

244. **For a system with both interactive user operations and batch report generation, different subsystems may use different patterns.**  
     **Answer:** True  
     **Justification:** Interactive operations and staged batch processing have different architectural needs.

245. **An online store can be modeled as a transaction processing system.**  
     **Answer:** True  
     **Justification:** Users submit orders and update database state.

246. **A reservation system is not a transaction processing system because users only search data.**  
     **Answer:** False  
     **Correct statement:** Reservation systems are transaction processing systems because they process user requests and may retrieve and update database information.  
     **Justification:** Reservation operations are database transactions.

247. **A language processing system can use a repository to share data such as a symbol table.**  
     **Answer:** True  
     **Justification:** Compiler components may share central information.

248. **A pipe-and-filter compiler can have stages such as lexical analysis, syntax analysis, semantic analysis, and code generation.**  
     **Answer:** True  
     **Justification:** These stages transform source text into another representation.

249. **An architectural pattern should be selected only because it is popular, not because it matches requirements.**  
     **Answer:** False  
     **Correct statement:** An architectural pattern should be selected because it matches the system’s functional and non-functional requirements.  
     **Justification:** Architecture must satisfy system needs.

250. **Combining architectural patterns is acceptable when each pattern solves a different architectural concern.**  
     **Answer:** True  
     **Justification:** Complex systems often use multiple patterns for different parts or concerns.

---

## Condensed Answer Key

1 T, 2 F, 3 T, 4 T, 5 F, 6 T, 7 F, 8 T, 9 F, 10 T  
11 T, 12 F, 13 T, 14 F, 15 T, 16 T, 17 F, 18 T, 19 F, 20 T  
21 F, 22 T, 23 F, 24 T, 25 T, 26 F, 27 T, 28 T, 29 F, 30 T  
31 T, 32 T, 33 F, 34 T, 35 T, 36 F, 37 F, 38 T, 39 T, 40 F  
41 T, 42 T, 43 T, 44 F, 45 T, 46 F, 47 T, 48 F, 49 T, 50 T  
51 F, 52 T, 53 F, 54 T, 55 T, 56 F, 57 T, 58 T, 59 T, 60 F  
61 T, 62 F, 63 T, 64 F, 65 T, 66 T, 67 T, 68 T, 69 T, 70 F  
71 T, 72 T, 73 F, 74 F, 75 T, 76 T, 77 T, 78 T, 79 T, 80 T  
81 T, 82 T, 83 T, 84 T, 85 T, 86 F, 87 T, 88 F, 89 T, 90 F  
91 T, 92 T, 93 T, 94 T, 95 F, 96 T, 97 F, 98 T, 99 F, 100 T  
101 T, 102 T, 103 T, 104 T, 105 F, 106 T, 107 T, 108 F, 109 T, 110 T  
111 T, 112 F, 113 F, 114 T, 115 F, 116 T, 117 T, 118 T, 119 T, 120 F  
121 T, 122 T, 123 T, 124 T, 125 F, 126 T, 127 T, 128 F, 129 F, 130 T  
131 T, 132 F, 133 T, 134 T, 135 T, 136 F, 137 T, 138 T, 139 T, 140 F  
141 T, 142 F, 143 T, 144 F, 145 T, 146 T, 147 T, 148 F, 149 T, 150 T  
151 F, 152 T, 153 T, 154 T, 155 T, 156 F, 157 T, 158 T, 159 F, 160 T  
161 T, 162 T, 163 T, 164 T, 165 T, 166 F, 167 T, 168 T, 169 T, 170 F  
171 T, 172 F, 173 T, 174 T, 175 F, 176 T, 177 T, 178 T, 179 F, 180 T  
181 T, 182 T, 183 F, 184 T, 185 T, 186 T, 187 T, 188 T, 189 T, 190 T  
191 T, 192 T, 193 T, 194 F, 195 T, 196 T, 197 T, 198 F, 199 T, 200 F  
201 T, 202 T, 203 T, 204 T, 205 T, 206 T, 207 F, 208 T, 209 F, 210 T  
211 T, 212 T, 213 T, 214 T, 215 T, 216 T, 217 T, 218 T, 219 T, 220 T  
221 T, 222 F, 223 F, 224 T, 225 T, 226 F, 227 T, 228 F, 229 T, 230 F  
231 T, 232 T, 233 T, 234 T, 235 T, 236 T, 237 F, 238 F, 239 F, 240 F  
241 T, 242 T, 243 T, 244 T, 245 T, 246 F, 247 T, 248 T, 249 F, 250 T

