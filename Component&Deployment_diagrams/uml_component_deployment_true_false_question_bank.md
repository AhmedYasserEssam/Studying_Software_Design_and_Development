# UML Component & Deployment Diagrams — True/False Question Bank

Source lecture: **Week #10 UML Component & Deployment Diagrams**.

## How to use this bank
For each question, answer **True** or **False** and provide a justification.  
For false statements, the corrected statement is included.

---

## Section 1 — Architectural Design Basics

1. **Statement:** Architectural design is concerned with understanding how a software system should be organized.
   - **Answer:** True
   - **Justification:** Architectural design focuses on the overall organization and structure of the system.

2. **Statement:** Architectural design is unrelated to requirements engineering.
   - **Answer:** False
   - **Correct statement:** Architectural design is a critical link between requirements engineering and software design.
   - **Justification:** Architecture identifies the main structural components needed to satisfy system requirements.

3. **Statement:** The output of architectural design is an architectural model.
   - **Answer:** True
   - **Justification:** The architectural model describes the system as communicating components.

4. **Statement:** Architectural design focuses mainly on individual method implementation details.
   - **Answer:** False
   - **Correct statement:** Architectural design focuses on the overall system structure, components, and relationships.
   - **Justification:** Method implementation is a lower-level software design concern.

5. **Statement:** In agile processes, an overall system architecture is commonly designed early.
   - **Answer:** True
   - **Justification:** The lecture states that an early agile stage generally includes designing the overall system architecture.

6. **Statement:** Refactoring system architecture is usually inexpensive.
   - **Answer:** False
   - **Correct statement:** Refactoring system architecture is usually expensive.
   - **Justification:** Architectural changes affect many components.

7. **Statement:** Software design avoids uncertainty by making detailed decisions clear and deterministic.
   - **Answer:** True
   - **Justification:** Design works with classes, methods, patterns, and detailed logic after major decisions are made.

8. **Statement:** Software architecture avoids all uncertainty before implementation begins.
   - **Answer:** False
   - **Correct statement:** Software architecture manages uncertainty rather than avoiding it.
   - **Justification:** Architecture deals with scalability, future changes, technology choices, and integrations.

9. **Statement:** Architecture includes decisions about technology choices and integration.
   - **Answer:** True
   - **Justification:** These are architectural-level concerns because they affect the system structure and future evolution.

10. **Statement:** Software design and software architecture are identical activities.
   - **Answer:** False
   - **Correct statement:** Software architecture focuses on high-level structure, while software design focuses on detailed classes, methods, and logic.
   - **Justification:** The lecture distinguishes design from architecture by their level of abstraction.

---

## Section 2 — Architectural Representations

11. **Statement:** Simple box-and-line diagrams are frequently used to document software architectures.
   - **Answer:** True
   - **Justification:** The lecture identifies informal block diagrams as the most frequently used architectural documentation method.

12. **Statement:** Informal block diagrams always have precise semantics.
   - **Answer:** False
   - **Correct statement:** Informal block diagrams often lack precise semantics.
   - **Justification:** They may not show exact relationship types or visible properties.

13. **Statement:** Box-and-line diagrams are useful for stakeholder communication.
   - **Answer:** True
   - **Justification:** Their simplicity makes them useful for communication and planning.

14. **Statement:** Informal architectural diagrams always show the exact nature of component relationships.
   - **Answer:** False
   - **Correct statement:** Informal diagrams may not show the nature of component relationships.
   - **Justification:** They are abstract and may omit relationship semantics.

15. **Statement:** The required level of model semantics depends on how the architectural model will be used.
   - **Answer:** True
   - **Justification:** More formal uses require more precise semantics.

16. **Statement:** Very abstract diagrams are useless in software architecture.
   - **Answer:** False
   - **Correct statement:** Very abstract diagrams can be useful for communication and project planning.
   - **Justification:** They help stakeholders discuss the system without excessive detail.

17. **Statement:** Semi-formal architectural representations use standardized notations.
   - **Answer:** True
   - **Justification:** UML Component and Deployment diagrams are examples of semi-formal standardized notations.

18. **Statement:** UML Component Diagrams and Deployment Diagrams are examples of formal mathematical languages.
   - **Answer:** False
   - **Correct statement:** UML Component and Deployment diagrams are semi-formal standardized notations.
   - **Justification:** They are easier to understand but may allow ambiguity.

19. **Statement:** Formal languages have mathematically precise semantics.
   - **Answer:** True
   - **Justification:** Formal languages such as Z and Petri nets support rigorous analysis.

20. **Statement:** Petri nets are an example of an informal box-and-line notation.
   - **Answer:** False
   - **Correct statement:** Petri nets are an example of a formal language.
   - **Justification:** They have mathematical semantics and can support formal verification.

21. **Statement:** Formal languages can support formal verification.
   - **Answer:** True
   - **Justification:** Their mathematical precision allows rigorous verification.

22. **Statement:** Semi-formal languages always remove all ambiguity.
   - **Answer:** False
   - **Correct statement:** Semi-formal languages reduce ambiguity through standard notation but may still allow some ambiguity.
   - **Justification:** They do not have strict mathematical semantics.

23. **Statement:** UML diagrams are generally easier to understand than fully formal mathematical specifications.
   - **Answer:** True
   - **Justification:** UML provides visual standard notation that is accessible to designers and stakeholders.

24. **Statement:** Formal languages are mainly used because they are visually simpler than UML diagrams.
   - **Answer:** False
   - **Correct statement:** Formal languages are used because they provide precise, unambiguous semantics and support rigorous analysis.
   - **Justification:** Their main benefit is precision, not visual simplicity.

25. **Statement:** Architectural representations can differ depending on the intended audience.
   - **Answer:** True
   - **Justification:** Stakeholder communication may need abstract diagrams, while verification may need formal models.

---

## Section 3 — Architectural Views and UML Mapping

26. **Statement:** Each architectural model usually shows only one view or perspective of a system.
   - **Answer:** True
   - **Justification:** Different views represent different concerns such as processes, development, or deployment.

27. **Statement:** One architectural diagram is always enough to document a complex system.
   - **Answer:** False
   - **Correct statement:** Multiple architectural views are usually needed to document a complex system.
   - **Justification:** Different stakeholders and concerns require different views.

28. **Statement:** The 4+1 view model includes a logical or conceptual view.
   - **Answer:** True
   - **Justification:** The logical/conceptual view shows key abstractions such as objects or classes.

29. **Statement:** The logical view shows only physical hardware devices.
   - **Answer:** False
   - **Correct statement:** The logical view shows key system abstractions, such as objects or object classes.
   - **Justification:** Hardware deployment belongs to the physical view.

30. **Statement:** The process view shows how the system is composed of interacting processes at run time.
   - **Answer:** True
   - **Justification:** It focuses on runtime process interactions.

31. **Statement:** The process view is best represented using deployment diagrams.
   - **Answer:** False
   - **Correct statement:** The process view may be represented using activity diagrams.
   - **Justification:** Deployment diagrams correspond to the physical view.

32. **Statement:** The development view shows how software is decomposed for development.
   - **Answer:** True
   - **Justification:** It focuses on implementation and component organization.

33. **Statement:** Component diagrams are associated with the development view.
   - **Answer:** True
   - **Justification:** The lecture maps development view to component diagrams.

34. **Statement:** Deployment diagrams are associated with the logical view.
   - **Answer:** False
   - **Correct statement:** Deployment diagrams are associated with the physical view.
   - **Justification:** Deployment diagrams show hardware nodes and component distribution.

35. **Statement:** The physical view shows system hardware and software distribution across processors.
   - **Answer:** True
   - **Justification:** It explains where software components are deployed physically.

36. **Statement:** Block diagrams may be used to represent the logical or conceptual view.
   - **Answer:** True
   - **Justification:** The lecture maps logical/conceptual view to block diagrams.

37. **Statement:** Activity diagrams may represent the process view.
   - **Answer:** True
   - **Justification:** Activity diagrams can show runtime workflows and interactions.

38. **Statement:** Component diagrams are mainly used to show exact memory usage of hardware nodes.
   - **Answer:** False
   - **Correct statement:** Component diagrams show how software components are arranged and related.
   - **Justification:** Hardware/resource details are deployment-diagram concerns.

39. **Statement:** Deployment diagrams help visualize how software operates across devices.
   - **Answer:** True
   - **Justification:** They map software components to hardware or virtual nodes.

40. **Statement:** The physical view ignores hardware and focuses only on classes.
   - **Answer:** False
   - **Correct statement:** The physical view focuses on hardware and software distribution across processors or devices.
   - **Justification:** Classes belong more naturally to logical/development views.

---

## Section 4 — Other UML Diagram Types Mentioned

41. **Statement:** A UML Composite Structure Diagram describes the internal structure of a class, component, or collaboration.
   - **Answer:** True
   - **Justification:** The lecture defines it as showing internal structure.

42. **Statement:** A UML Profile Diagram is used to execute source code.
   - **Answer:** False
   - **Correct statement:** A UML Profile Diagram extends standard UML with custom stereotypes, tagged values, and constraints.
   - **Justification:** It customizes UML for a domain or platform.

43. **Statement:** A UML Profile Diagram allows UML customization without changing the UML standard itself.
   - **Answer:** True
   - **Justification:** Profiles extend UML through stereotypes, tagged values, and constraints.

44. **Statement:** Interaction Overview Diagrams combine elements from activity diagrams and interaction diagrams.
   - **Answer:** True
   - **Justification:** They show high-level control flow between interactions.

45. **Statement:** Timing Diagrams focus on how objects or components change state or value over time.
   - **Answer:** True
   - **Justification:** Timing diagrams emphasize time-related behavioral changes.

46. **Statement:** Timing Diagrams are primarily used to show package dependencies.
   - **Answer:** False
   - **Correct statement:** Timing Diagrams show how objects or components change state/value over time and interact based on timing.
   - **Justification:** Package dependencies are not the focus of timing diagrams.

47. **Statement:** Interaction Overview Diagrams are purely structural diagrams.
   - **Answer:** False
   - **Correct statement:** Interaction Overview Diagrams are behavioral diagrams.
   - **Justification:** They show control flow between interactions.

48. **Statement:** Sequence or communication diagrams may be part of interaction modeling.
   - **Answer:** True
   - **Justification:** The lecture mentions interaction diagrams such as sequence and communication diagrams.

49. **Statement:** UML Profile Diagrams can include custom stereotypes.
   - **Answer:** True
   - **Justification:** Stereotypes are one mechanism used by UML profiles.

50. **Statement:** Tagged values are unrelated to UML profiles.
   - **Answer:** False
   - **Correct statement:** Tagged values are part of UML profiles.
   - **Justification:** They help extend UML elements with domain-specific information.

---

## Section 5 — Component Diagram Fundamentals

51. **Statement:** A UML Component Diagram is a structural diagram.
   - **Answer:** True
   - **Justification:** It shows how system components are arranged and related.

52. **Statement:** Component diagrams are also called component-based diagrams.
   - **Answer:** True
   - **Justification:** The lecture uses both terms.

53. **Statement:** Component diagrams show how components are wired together to form larger systems.
   - **Answer:** True
   - **Justification:** They illustrate component dependencies and interactions.

54. **Statement:** Component diagrams are mainly used to model user emotions during interaction.
   - **Answer:** False
   - **Correct statement:** Component diagrams model software components, interfaces, dependencies, and interactions.
   - **Justification:** User emotions are outside the scope of component diagrams.

55. **Statement:** Components are modular units that offer interfaces and encapsulate implementation.
   - **Answer:** True
   - **Justification:** This is the lecture definition of system components.

56. **Statement:** Component diagrams help promote modularity.
   - **Answer:** True
   - **Justification:** They represent system parts as encapsulated modules.

57. **Statement:** Component diagrams make architecture harder to understand by hiding all relationships.
   - **Answer:** False
   - **Correct statement:** Component diagrams enhance understanding by showing components and their relationships.
   - **Justification:** Their purpose is to clarify structure and interaction.

58. **Statement:** Components can represent software classes, collections of classes, or subsystems.
   - **Answer:** True
   - **Justification:** The lecture identifies these as possible component forms.

59. **Statement:** Components are represented as circles in component diagrams.
   - **Answer:** False
   - **Correct statement:** Components are represented as rectangles with the component stereotype «component».
   - **Justification:** Circles are used for provided interfaces.

60. **Statement:** The stereotype «component» can be used to label component symbols.
   - **Answer:** True
   - **Justification:** The component symbol is a rectangle with the component stereotype.

61. **Statement:** Components should encapsulate functionality.
   - **Answer:** True
   - **Justification:** Encapsulation supports modularity and reusability.

62. **Statement:** Component diagrams are unrelated to system design.
   - **Answer:** False
   - **Correct statement:** Component diagrams are widely used in system design.
   - **Justification:** They support modular architecture design and understanding.

63. **Statement:** Component diagrams can show dependencies among components.
   - **Answer:** True
   - **Justification:** Dependencies are one of the key relationships represented.

64. **Statement:** Component diagrams only show runtime object states.
   - **Answer:** False
   - **Correct statement:** Component diagrams show structural organization of system components.
   - **Justification:** Runtime state changes are more related to behavioral diagrams.

65. **Statement:** Component diagrams can help identify potential points of failure.
   - **Answer:** True
   - **Justification:** By showing dependencies and communication paths, they expose vulnerable connections.

---

## Section 6 — Interfaces in Component Diagrams

66. **Statement:** Interfaces specify operations that a component offers or requires.
   - **Answer:** True
   - **Justification:** Interfaces define contracts between components and their environments.

67. **Statement:** Interfaces help components communicate with each other.
   - **Answer:** True
   - **Justification:** Interfaces define how components interact.

68. **Statement:** A provided interface is commonly shown as a lollipop symbol.
   - **Answer:** True
   - **Justification:** The lecture states that circles/lollipops represent provided interfaces.

69. **Statement:** A required interface is commonly shown as a socket symbol.
   - **Answer:** True
   - **Justification:** The lecture states that half-circles/sockets represent required interfaces.

70. **Statement:** A lollipop symbol represents a required interface.
   - **Answer:** False
   - **Correct statement:** A lollipop symbol represents a provided interface.
   - **Justification:** Required interfaces are shown with socket notation.

71. **Statement:** A socket symbol represents a provided interface.
   - **Answer:** False
   - **Correct statement:** A socket symbol represents a required interface.
   - **Justification:** Provided interfaces use lollipop notation.

72. **Statement:** Interfaces serve as contracts between components.
   - **Answer:** True
   - **Justification:** They specify expected operations and communication points.

73. **Statement:** Interfaces make independent development and maintenance easier.
   - **Answer:** True
   - **Justification:** Components can be maintained separately if they respect interface contracts.

74. **Statement:** Interfaces require components to expose all internal implementation details.
   - **Answer:** False
   - **Correct statement:** Interfaces expose required/provided operations while allowing implementation to remain encapsulated.
   - **Justification:** Encapsulation is central to components.

75. **Statement:** Provided interfaces describe services a component offers to others.
   - **Answer:** True
   - **Justification:** A provided interface is what a component makes available.

76. **Statement:** Required interfaces describe services a component needs from others.
   - **Answer:** True
   - **Justification:** A required interface shows an external dependency.

77. **Statement:** Interfaces are irrelevant when components need to be replaced.
   - **Answer:** False
   - **Correct statement:** Interfaces are important for replacing components because replacements can work if they provide/require the same contracts.
   - **Justification:** Stable interfaces reduce coupling.

78. **Statement:** An interface can define operations included in a service contract.
   - **Answer:** True
   - **Justification:** The lecture step for creating component diagrams includes defining operations in interfaces.

79. **Statement:** Component communication can be shown through provided and required interfaces.
   - **Answer:** True
   - **Justification:** Provided and required interfaces show how components connect.

80. **Statement:** Component interfaces are only useful in deployment diagrams, not component diagrams.
   - **Answer:** False
   - **Correct statement:** Interfaces are key elements in component diagrams and may also appear in deployment contexts.
   - **Justification:** The component diagram section explicitly discusses interfaces.

---

## Section 7 — Relationships, Ports, Artifacts, and Nodes in Component Diagrams

81. **Statement:** Relationships in component diagrams may be shown using lines and arrows.
   - **Answer:** True
   - **Justification:** Lines and arrows represent associations, dependencies, and connectors.

82. **Statement:** A dependency is commonly shown using a dashed arrow.
   - **Answer:** True
   - **Justification:** The lecture identifies dashed arrows as dependency notation.

83. **Statement:** A dependency means one component relies on another.
   - **Answer:** True
   - **Justification:** Dependency indicates reliance.

84. **Statement:** A solid association line shows a more permanent relationship between components.
   - **Answer:** True
   - **Justification:** The lecture distinguishes association from dependency in this way.

85. **Statement:** An assembly connector connects a required interface to a provided interface.
   - **Answer:** True
   - **Justification:** It connects compatible service needs and service offers.

86. **Statement:** An assembly connector connects two required interfaces.
   - **Answer:** False
   - **Correct statement:** An assembly connector connects a required interface of one component to a provided interface of another.
   - **Justification:** Required-to-provided matching enables interaction.

87. **Statement:** Ports are specific interaction points on a component boundary.
   - **Answer:** True
   - **Justification:** Ports mark where interfaces are provided or required.

88. **Statement:** Ports are represented as small squares on the component boundary.
   - **Answer:** True
   - **Justification:** The lecture gives this symbol.

89. **Statement:** Ports are used only to represent physical servers.
   - **Answer:** False
   - **Correct statement:** Ports represent interaction points on a component boundary.
   - **Justification:** Servers are represented as nodes in deployment diagrams.

90. **Statement:** Ports allow more precise specification of interaction points.
   - **Answer:** True
   - **Justification:** They support detailed design and implementation.

91. **Statement:** Artifacts represent physical files or data deployed on nodes.
   - **Answer:** True
   - **Justification:** Artifacts include executables, data files, and similar physical items.

92. **Statement:** Artifacts are represented with the stereotype «artifact».
   - **Answer:** True
   - **Justification:** The lecture gives rectangles with «artifact» as artifact notation.

93. **Statement:** A JAR file can be considered an artifact.
   - **Answer:** True
   - **Justification:** The lecture explains that a JAR file packages and distributes a Java application or library.

94. **Statement:** Artifacts are imaginary user roles in UML diagrams.
   - **Answer:** False
   - **Correct statement:** Artifacts are physical files or data used, produced, or deployed in the software system.
   - **Justification:** User roles are not artifacts.

95. **Statement:** Nodes can represent physical or virtual execution environments.
   - **Answer:** True
   - **Justification:** Nodes show where components are deployed.

96. **Statement:** Nodes are represented by 3D boxes in component/deployment contexts.
   - **Answer:** True
   - **Justification:** The lecture identifies 3D boxes as node notation.

97. **Statement:** Nodes provide deployment context for where components reside and execute.
   - **Answer:** True
   - **Justification:** Nodes show execution environments.

98. **Statement:** Nodes are the same thing as provided interfaces.
   - **Answer:** False
   - **Correct statement:** Nodes are execution environments; provided interfaces are services offered by components.
   - **Justification:** They represent different UML concepts.

99. **Statement:** Relationships help visualize communication paths between components.
   - **Answer:** True
   - **Justification:** Component relationships show interactions and dependencies.

100. **Statement:** A component dependency can expose a potential point of failure.
   - **Answer:** True
   - **Justification:** If one component depends on another, failure of the depended-on component can affect it.

---

## Section 8 — Steps for Creating Component Diagrams

101. **Statement:** The first step in creating a component diagram is identifying system scope and requirements.
   - **Answer:** True
   - **Justification:** The lecture lists scope and requirements identification as Step 1.

102. **Statement:** Identifying components should happen before defining system boundaries.
   - **Answer:** False
   - **Correct statement:** The system scope and requirements should be identified first, then the components should be identified.
   - **Justification:** Boundaries define what should be included.

103. **Statement:** Each component should have defined responsibilities and functionality.
   - **Answer:** True
   - **Justification:** Component identification includes detailing each component’s responsibilities.

104. **Statement:** Components should encapsulate a specific set of functionalities.
   - **Answer:** True
   - **Justification:** Encapsulation is part of good component design.

105. **Statement:** Provided interfaces show what a component offers to others.
   - **Answer:** True
   - **Justification:** This is part of identifying provided and required interfaces.

106. **Statement:** Required interfaces show what a component requires from other components.
   - **Answer:** True
   - **Justification:** They identify external services needed by a component.

107. **Statement:** Interface operations do not need to be defined in component diagrams.
   - **Answer:** False
   - **Correct statement:** Interface operations should be clearly defined.
   - **Justification:** The lecture includes defining operations in the interface-identification step.

108. **Statement:** Relationships and dependencies should be identified when creating component diagrams.
   - **Answer:** True
   - **Justification:** They show how components connect and rely on each other.

109. **Statement:** Artifacts should never be considered when creating component diagrams.
   - **Answer:** False
   - **Correct statement:** Physical pieces of information such as files, documents, and executables should be identified as artifacts.
   - **Justification:** Artifact identification is one of the creation steps.

110. **Statement:** Nodes can be identified after artifacts when creating a component-based diagram.
   - **Answer:** True
   - **Justification:** The lecture lists identifying artifacts followed by identifying nodes.

111. **Statement:** Execution environments should be considered when identifying nodes.
   - **Answer:** True
   - **Justification:** Nodes represent physical or virtual execution environments.

112. **Statement:** A UML tool may be used to draw the final component diagram.
   - **Answer:** True
   - **Justification:** The lecture includes drawing the diagram using a UML tool.

113. **Statement:** Reviewing and refining the component diagram is unnecessary after drawing it.
   - **Answer:** False
   - **Correct statement:** The diagram should be reviewed and refined.
   - **Justification:** Review improves accuracy and clarity.

114. **Statement:** Component diagrams should include every small method in the system.
   - **Answer:** False
   - **Correct statement:** Component diagrams should focus on major components, interfaces, dependencies, artifacts, and deployment context as needed.
   - **Justification:** Method-level detail belongs to detailed design, not high-level component architecture.

115. **Statement:** Defining system boundaries helps decide what parts are included in the diagram.
   - **Answer:** True
   - **Justification:** Scope definition determines diagram content.

---

## Section 9 — Online Store Component Diagram Example

116. **Statement:** In the example, OnlineStore is the main component encapsulating the entire system.
   - **Answer:** True
   - **Justification:** The lecture describes OnlineStore as the main enclosing component.

117. **Statement:** The OnlineStore component contains Order, Customer, and Product as internal components.
   - **Answer:** True
   - **Justification:** These are listed as internal components.

118. **Statement:** The Order component handles order-related operations.
   - **Answer:** True
   - **Justification:** That is its responsibility in the example.

119. **Statement:** The Product component manages customer account passwords.
   - **Answer:** False
   - **Correct statement:** The Product component manages product-related functions.
   - **Justification:** Customer/account responsibilities are separate.

120. **Statement:** The Customer component manages customer-related data and activities.
   - **Answer:** True
   - **Justification:** The lecture assigns customer-related responsibilities to Customer.

121. **Statement:** The Account component is inside the OnlineStore boundary.
   - **Answer:** False
   - **Correct statement:** The Account component is outside the OnlineStore boundary.
   - **Justification:** The lecture describes Account as external to OnlineStore.

122. **Statement:** The Account component may represent a separate system or module.
   - **Answer:** True
   - **Justification:** Its position outside OnlineStore suggests separation.

123. **Statement:** The «delegate» notation indicates that a component forwards a request from an external interface to an internal component.
   - **Answer:** True
   - **Justification:** The lecture explicitly defines «delegate» this way.

124. **Statement:** «delegate» means that a component deletes its internal components.
   - **Answer:** False
   - **Correct statement:** «delegate» means that a request is forwarded from an external interface to an internal component.
   - **Justification:** Delegation is about routing requests, not deletion.

125. **Statement:** The Order component may connect to Product to reference products in an order.
   - **Answer:** True
   - **Justification:** Orders need product information.

126. **Statement:** The Order component may connect to Customer to associate orders with customers.
   - **Answer:** True
   - **Justification:** Orders belong to customers.

127. **Statement:** The Product component is unrelated to Order in the online store example.
   - **Answer:** False
   - **Correct statement:** Product is linked to Order so orders can reference available products.
   - **Justification:** Product information is necessary for order handling.

128. **Statement:** The Customer component can be connected to Account through delegation.
   - **Answer:** True
   - **Justification:** The example shows account-related functions delegated externally.

129. **Statement:** The external Account component suggests that all functionality must be inside one component.
   - **Answer:** False
   - **Correct statement:** The external Account component suggests that some functionality may be provided by a separate system or module.
   - **Justification:** Component diagrams can show external dependencies.

130. **Statement:** The OnlineStore example illustrates component encapsulation and internal component relationships.
   - **Answer:** True
   - **Justification:** It shows a main component containing and connecting smaller components.

---

## Section 10 — Deployment Diagram Fundamentals

131. **Statement:** A Deployment Diagram is a structural UML diagram.
   - **Answer:** True
   - **Justification:** It shows physical deployment structure.

132. **Statement:** Deployment diagrams show the physical deployment of software components on hardware nodes.
   - **Answer:** True
   - **Justification:** This is the core purpose of deployment diagrams.

133. **Statement:** Deployment diagrams map software components onto physical resources.
   - **Answer:** True
   - **Justification:** They show where components run in the infrastructure.

134. **Statement:** Deployment diagrams are mainly used to show inheritance between classes.
   - **Answer:** False
   - **Correct statement:** Deployment diagrams show how software components are deployed on hardware or virtual nodes.
   - **Justification:** Class inheritance is typically shown in class diagrams.

135. **Statement:** Deployment diagrams can include servers, processors, storage devices, and network infrastructure.
   - **Answer:** True
   - **Justification:** These are examples of physical resources.

136. **Statement:** Deployment diagrams help visualize how software operates across different devices.
   - **Answer:** True
   - **Justification:** They show distribution of software across nodes.

137. **Statement:** A node in a deployment diagram represents a physical or computational resource.
   - **Answer:** True
   - **Justification:** Nodes include servers, workstations, and computing resources.

138. **Statement:** Nodes are represented as plain circles in deployment diagrams.
   - **Answer:** False
   - **Correct statement:** Nodes are represented as boxes with rounded corners or 3D-style boxes.
   - **Justification:** Circles are used for interfaces in other UML contexts.

139. **Statement:** A component in a deployment diagram represents a modular and reusable software part.
   - **Answer:** True
   - **Justification:** Components encapsulate behavior and data and may be deployed independently.

140. **Statement:** A deployment artifact may be an executable file or configuration file.
   - **Answer:** True
   - **Justification:** Artifacts include executables, scripts, databases, libraries, and configuration files.

141. **Statement:** An artifact represents a physical piece of information used or produced during software development.
   - **Answer:** True
   - **Justification:** The lecture defines artifact this way.

142. **Statement:** Artifacts cannot include databases.
   - **Answer:** False
   - **Correct statement:** Artifacts can include databases, executables, scripts, libraries, configuration files, and documents.
   - **Justification:** The lecture lists databases among artifact examples.

143. **Statement:** An interface represents a contract specifying methods or operations a component must implement.
   - **Answer:** True
   - **Justification:** Interfaces define points of interaction.

144. **Statement:** Deployment diagrams cannot show dependencies.
   - **Answer:** False
   - **Correct statement:** Deployment diagrams can show dependencies between nodes, components, or other deployment elements.
   - **Justification:** Dependencies are listed as key elements.

145. **Statement:** Communication paths represent channels or connections between nodes and components.
   - **Answer:** True
   - **Justification:** They show how parts communicate.

146. **Statement:** A communication path can include network connections and communication protocols.
   - **Answer:** True
   - **Justification:** The lecture states this explicitly.

147. **Statement:** A straight line may represent communication between two device nodes.
   - **Answer:** True
   - **Justification:** The lecture describes communication paths this way.

148. **Statement:** Dashed lines in deployment diagrams may represent dependencies.
   - **Answer:** True
   - **Justification:** Dashed lines can indicate related or dependent elements.

149. **Statement:** Deployment specification outlines setup and characteristics of nodes and components.
   - **Answer:** True
   - **Justification:** It can include hardware specifications, software settings, and communication protocols.

150. **Statement:** Deployment specifications are used only for drawing icons and have no technical meaning.
   - **Answer:** False
   - **Correct statement:** Deployment specifications describe setup details such as hardware specifications, software settings, and communication protocols.
   - **Justification:** They provide deployment-relevant technical information.

---

## Section 11 — Use Cases and Benefits of Deployment Diagrams

151. **Statement:** Deployment diagrams help plan how software systems will be set up on devices.
   - **Answer:** True
   - **Justification:** They support deployment planning.

152. **Statement:** Deployment diagrams help design hardware needed to support software.
   - **Answer:** True
   - **Justification:** They show which software parts run on which devices.

153. **Statement:** Deployment diagrams can help determine required devices and networks.
   - **Answer:** True
   - **Justification:** Mapping software to hardware exposes infrastructure needs.

154. **Statement:** Deployment diagrams cannot help with performance considerations.
   - **Answer:** False
   - **Correct statement:** Deployment diagrams can help teams find ways to make software run faster and smoother.
   - **Justification:** They show deployment structure and resource allocation.

155. **Statement:** Deployment diagrams can help ensure each software part has enough resources.
   - **Answer:** True
   - **Justification:** They support planning for memory, processing power, and other resources.

156. **Statement:** Deployment diagrams hide dependencies between software and hardware.
   - **Answer:** False
   - **Correct statement:** Deployment diagrams show dependencies between software parts and hardware nodes.
   - **Justification:** This is one of their intended uses.

157. **Statement:** Deployment diagrams can support reliability and scalability planning.
   - **Answer:** True
   - **Justification:** Deployment patterns address scalability, reliability, and performance.

158. **Statement:** Deployment diagrams are only useful after the system has already been deployed.
   - **Answer:** False
   - **Correct statement:** Deployment diagrams are useful during planning and design before deployment.
   - **Justification:** They help plan setup and infrastructure.

159. **Statement:** Deployment diagrams can help identify network communication paths.
   - **Answer:** True
   - **Justification:** Communication paths show connections and protocols.

160. **Statement:** Deployment diagrams are unrelated to infrastructure decisions.
   - **Answer:** False
   - **Correct statement:** Deployment diagrams directly support infrastructure decisions.
   - **Justification:** They show hardware, networks, nodes, and deployed components.

---

## Section 12 — Steps for Creating Deployment Diagrams

161. **Statement:** One step in creating a deployment diagram is identifying components.
   - **Answer:** True
   - **Justification:** Component identification is Step 1.

162. **Statement:** Understanding relationships is part of creating a deployment diagram.
   - **Answer:** True
   - **Justification:** Relationships determine how nodes and components are linked.

163. **Statement:** Hardware and network requirements should be gathered before drawing the deployment diagram.
   - **Answer:** True
   - **Justification:** Deployment design requires infrastructure details.

164. **Statement:** Deployment diagrams should ignore special deployment rules.
   - **Answer:** False
   - **Correct statement:** Special rules for deployment should be gathered as requirements.
   - **Justification:** These rules affect node and component placement.

165. **Statement:** Nodes and components should be drawn using standard symbols.
   - **Answer:** True
   - **Justification:** Standard UML notation improves readability.

166. **Statement:** Nodes and components should never be connected in a deployment diagram.
   - **Answer:** False
   - **Correct statement:** Nodes and components should be connected to show deployment links, dependencies, and communication paths.
   - **Justification:** Connections are central to deployment diagrams.

167. **Statement:** Labels should be added to deployment diagram elements.
   - **Answer:** True
   - **Justification:** Clear labels improve understanding.

168. **Statement:** Hardware specs and communication protocols may be included as extra details.
   - **Answer:** True
   - **Justification:** The lecture lists these details in the diagram creation steps.

169. **Statement:** Documentation of deployment assumptions is unnecessary.
   - **Answer:** False
   - **Correct statement:** Important decisions and assumptions should be documented.
   - **Justification:** Documentation supports communication and future maintenance.

170. **Statement:** Drawing the final diagram may involve refining an initial rough version.
   - **Answer:** True
   - **Justification:** The lecture suggests drawing roughly first, improvising, and then drawing the final version.

171. **Statement:** Deployment diagrams require knowledge of hardware, network setup, and software components.
   - **Answer:** True
   - **Justification:** These are all part of deployment modeling.

172. **Statement:** Deployment diagrams are created without considering relationships among components.
   - **Answer:** False
   - **Correct statement:** Relationships among components and nodes should be understood and shown.
   - **Justification:** Relationships define how the deployed system operates.

173. **Statement:** Communication paths should be represented when relevant.
   - **Answer:** True
   - **Justification:** They show how nodes communicate.

174. **Statement:** Deployment diagrams should avoid showing where software components run.
   - **Answer:** False
   - **Correct statement:** Deployment diagrams should show where software components are deployed and executed.
   - **Justification:** That is the main purpose of the diagram.

175. **Statement:** Deployment diagrams can include both physical and virtual nodes.
   - **Answer:** True
   - **Justification:** Nodes may represent physical or virtual execution environments.

---

## Section 13 — Deployment Patterns

176. **Statement:** Deployment patterns are standardized methods for installing software on hardware infrastructure.
   - **Answer:** True
   - **Justification:** The lecture defines deployment patterns this way.

177. **Statement:** Deployment patterns provide guidance for organizing and deploying software components.
   - **Answer:** True
   - **Justification:** They guide software placement on infrastructure.

178. **Statement:** Deployment patterns address scalability, reliability, and performance challenges.
   - **Answer:** True
   - **Justification:** These are explicitly listed as challenges addressed by deployment patterns.

179. **Statement:** Three-tier architecture is an example of a deployment pattern.
   - **Answer:** True
   - **Justification:** The lecture lists it as an example.

180. **Statement:** Microservices architecture is not related to deployment patterns.
   - **Answer:** False
   - **Correct statement:** Microservices architecture is an example of a deployment pattern.
   - **Justification:** It is listed among deployment-pattern examples.

181. **Statement:** Containerization using Docker is an example of a deployment pattern.
   - **Answer:** True
   - **Justification:** The lecture gives containerization using Docker as an example.

182. **Statement:** Cloud deployment is an example of a deployment pattern.
   - **Answer:** True
   - **Justification:** Cloud deployment is listed as a deployment-pattern example.

183. **Statement:** Deployment patterns are concerned only with user-interface colors.
   - **Answer:** False
   - **Correct statement:** Deployment patterns are concerned with installing and organizing software components on hardware infrastructure.
   - **Justification:** UI colors are unrelated to deployment structure.

184. **Statement:** Deployment patterns can help improve reliability.
   - **Answer:** True
   - **Justification:** Reliability is one of the challenges addressed by deployment patterns.

185. **Statement:** Deployment patterns cannot support scalability.
   - **Answer:** False
   - **Correct statement:** Deployment patterns can support scalability.
   - **Justification:** Scalability is one of the main deployment challenges they address.

---

## Section 14 — Mobile Banking Deployment Example

186. **Statement:** In the mobile banking deployment example, one node represents the client’s Android device.
   - **Answer:** True
   - **Justification:** The lecture explicitly states this.

187. **Statement:** The banking application is a component installed on the Android device.
   - **Answer:** True
   - **Justification:** The lecture identifies the banking app as the specific component on the Android device.

188. **Statement:** The mobile banking diagram shows the user connecting to the banking server through the web.
   - **Answer:** True
   - **Justification:** The example illustrates web-based communication between the app and server.

189. **Statement:** The Android banking app communicates with the application server online to perform tasks.
   - **Answer:** True
   - **Justification:** The lecture gives examples such as checking balances and transferring money.

190. **Statement:** The mobile banking deployment diagram shows that all processing happens only on paper forms.
   - **Answer:** False
   - **Correct statement:** The mobile banking deployment diagram shows software components deployed on devices and communicating with servers online.
   - **Justification:** The example is about deployed software, not paper forms.

191. **Statement:** Checking account balances can be an example task supported by the banking app and server.
   - **Answer:** True
   - **Justification:** The lecture mentions checking balances as an example operation.

192. **Statement:** Transferring money can be an example task supported by the banking app and server.
   - **Answer:** True
   - **Justification:** The lecture mentions transferring money as an example operation.

193. **Statement:** The mobile banking example illustrates how components interact to provide functions to the user.
   - **Answer:** True
   - **Justification:** The diagram shows software setup on hardware nodes and communication among them.

194. **Statement:** The client Android device is irrelevant in the mobile banking deployment diagram.
   - **Answer:** False
   - **Correct statement:** The Android device is an important node representing the client side.
   - **Justification:** It hosts the banking application component.

195. **Statement:** The web connection is part of the communication path between the Android app and banking server.
   - **Answer:** True
   - **Justification:** The lecture explains that the app connects to the server through the web.

---

## Section 15 — Mixed Exam-Style Questions

196. **Statement:** Component diagrams are more suitable than deployment diagrams for showing how software modules depend on each other.
   - **Answer:** True
   - **Justification:** Component diagrams focus on software components, interfaces, and dependencies.

197. **Statement:** Deployment diagrams are more suitable than component diagrams for showing where components run physically.
   - **Answer:** True
   - **Justification:** Deployment diagrams map software to hardware or virtual nodes.

198. **Statement:** A component diagram and a deployment diagram can both be useful for documenting architecture.
   - **Answer:** True
   - **Justification:** They represent different architectural views: development and physical.

199. **Statement:** A component diagram should replace all deployment diagrams because both show the same view.
   - **Answer:** False
   - **Correct statement:** Component diagrams and deployment diagrams show different views and can complement each other.
   - **Justification:** Component diagrams support development view; deployment diagrams support physical view.

200. **Statement:** The same system may need both component and deployment diagrams.
   - **Answer:** True
   - **Justification:** Complex systems often need multiple views to show software structure and physical deployment.

201. **Statement:** A component diagram can show provided and required interfaces, while a deployment diagram can show nodes and communication paths.
   - **Answer:** True
   - **Justification:** These are key elements of the two diagram types.

202. **Statement:** UML Component Diagrams are mapped to the physical view in the lecture.
   - **Answer:** False
   - **Correct statement:** UML Component Diagrams are mapped to the development view.
   - **Justification:** Deployment diagrams are mapped to the physical view.

203. **Statement:** UML Deployment Diagrams are mapped to the physical view in the lecture.
   - **Answer:** True
   - **Justification:** They show hardware and software distribution.

204. **Statement:** Architectural representations must always be formal mathematical languages.
   - **Answer:** False
   - **Correct statement:** Architectural representations may be informal, semi-formal, or formal depending on their purpose.
   - **Justification:** The lecture describes all three levels.

205. **Statement:** Component diagrams can be used to promote modularity and reusability.
   - **Answer:** True
   - **Justification:** Components encapsulate functionality and expose interfaces.

206. **Statement:** Deployment diagrams can help allocate software parts to hardware nodes.
   - **Answer:** True
   - **Justification:** This is their primary purpose.

207. **Statement:** A required interface means the component provides a service to others.
   - **Answer:** False
   - **Correct statement:** A required interface means the component needs a service from another component.
   - **Justification:** A provided interface is what the component offers.

208. **Statement:** A provided interface means the component offers a service to others.
   - **Answer:** True
   - **Justification:** Provided interfaces expose available services.

209. **Statement:** Component diagrams should show communication paths between physical machines as their main purpose.
   - **Answer:** False
   - **Correct statement:** Deployment diagrams mainly show communication paths between physical or virtual nodes.
   - **Justification:** Component diagrams focus on software component structure.

210. **Statement:** A deployment diagram can show that a mobile app component is installed on a smartphone node.
   - **Answer:** True
   - **Justification:** This matches the mobile banking example.

211. **Statement:** A component can be deployed independently if it encapsulates behavior and data.
   - **Answer:** True
   - **Justification:** Components are modular deployable units.

212. **Statement:** A component must always be a single class.
   - **Answer:** False
   - **Correct statement:** A component may be a class, collection of classes, package, subsystem, or software module.
   - **Justification:** Components can represent different levels of modularity.

213. **Statement:** An artifact can implement a component.
   - **Answer:** True
   - **Justification:** The lecture states artifacts are files that implement components.

214. **Statement:** A JAR file packages and distributes a Java application or library in one file.
   - **Answer:** True
   - **Justification:** The lecture specifically mentions this.

215. **Statement:** Nodes cannot contain components or artifacts.
   - **Answer:** False
   - **Correct statement:** Nodes can contain deployed components or artifacts.
   - **Justification:** Deployment diagrams show software deployed on nodes.

216. **Statement:** Deployment diagrams can include nested nodes.
   - **Answer:** True
   - **Justification:** The lecture notes that nodes can include nested nodes to represent hierarchy.

217. **Statement:** A node can represent a workstation.
   - **Answer:** True
   - **Justification:** Workstations are listed as possible nodes.

218. **Statement:** A node can represent a router.
   - **Answer:** True
   - **Justification:** Routers are listed among deployment-diagram node examples.

219. **Statement:** Components in deployment diagrams are always hardware devices.
   - **Answer:** False
   - **Correct statement:** Components are software modules; nodes are hardware or computational resources.
   - **Justification:** The two concepts must not be confused.

220. **Statement:** Deployment diagrams can show software settings and communication protocols.
   - **Answer:** True
   - **Justification:** These may be included in deployment specifications or labels.

221. **Statement:** A component diagram can show how components are wired together.
   - **Answer:** True
   - **Justification:** Wiring is shown through interfaces, connectors, and relationships.

222. **Statement:** In component diagrams, relationships and dependencies are irrelevant because components are independent.
   - **Answer:** False
   - **Correct statement:** Relationships and dependencies are important because components often interact and rely on each other.
   - **Justification:** Component diagrams explicitly show these connections.

223. **Statement:** A component diagram can include an external component outside the system boundary.
   - **Answer:** True
   - **Justification:** The OnlineStore example shows Account outside the OnlineStore boundary.

224. **Statement:** System scope determines the boundary of a component diagram.
   - **Answer:** True
   - **Justification:** Scope identifies which parts are included.

225. **Statement:** If a component requires a service, it should use a provided interface symbol.
   - **Answer:** False
   - **Correct statement:** If a component requires a service, it should use a required interface/socket symbol.
   - **Justification:** Provided and required interfaces use different notations.

226. **Statement:** If a component offers a service, it should use a provided interface symbol.
   - **Answer:** True
   - **Justification:** Provided services are represented using lollipop notation.

227. **Statement:** Component diagrams and deployment diagrams are both UML structural diagrams.
   - **Answer:** True
   - **Justification:** Both describe structure rather than detailed algorithmic behavior.

228. **Statement:** Timing diagrams are structural diagrams.
   - **Answer:** False
   - **Correct statement:** Timing diagrams are behavioral diagrams.
   - **Justification:** They focus on changes in state or value over time.

229. **Statement:** Interaction Overview Diagrams show high-level flow of control between interactions.
   - **Answer:** True
   - **Justification:** They combine activity and interaction diagram ideas.

230. **Statement:** A Profile Diagram is used to extend UML for a particular domain or platform.
   - **Answer:** True
   - **Justification:** It uses stereotypes, tagged values, and constraints.

231. **Statement:** Deployment diagrams can support decisions about memory and processing power.
   - **Answer:** True
   - **Justification:** They help ensure software parts have enough resources.

232. **Statement:** Deployment diagrams make it impossible to identify performance issues.
   - **Answer:** False
   - **Correct statement:** Deployment diagrams can help identify performance issues by showing allocation and communication paths.
   - **Justification:** They expose infrastructure and network relationships.

233. **Statement:** The physical view is concerned with distributing software components across processors or devices.
   - **Answer:** True
   - **Justification:** This is the definition of the physical view.

234. **Statement:** The development view is unrelated to developers.
   - **Answer:** False
   - **Correct statement:** The development view shows how software is decomposed for development.
   - **Justification:** It directly supports development organization.

235. **Statement:** Component diagrams can be used as part of architectural documentation.
   - **Answer:** True
   - **Justification:** They document software modular structure and dependencies.

236. **Statement:** Deployment diagrams can be used as part of architectural documentation.
   - **Answer:** True
   - **Justification:** They document physical deployment and communication.

237. **Statement:** Block diagrams are mapped to the development view in the lecture.
   - **Answer:** False
   - **Correct statement:** Block diagrams are mapped to the logical/conceptual view.
   - **Justification:** Component diagrams are mapped to the development view.

238. **Statement:** Activity diagrams are mapped to the process view in the lecture.
   - **Answer:** True
   - **Justification:** They can model runtime process activities.

239. **Statement:** Deployment diagrams should be used to show where the database server runs.
   - **Answer:** True
   - **Justification:** Database servers are deployment nodes or deployed artifacts/components.

240. **Statement:** Component diagrams are best for showing exact CPU speed of each server.
   - **Answer:** False
   - **Correct statement:** Deployment diagrams are more suitable for showing hardware specifications such as CPU or server details.
   - **Justification:** Component diagrams focus on software components.

241. **Statement:** A component diagram can show a dependency from PaymentService to AccountService.
   - **Answer:** True
   - **Justification:** Dependencies between software components are valid in component diagrams.

242. **Statement:** A deployment diagram can show a mobile device connected to an application server through the Internet.
   - **Answer:** True
   - **Justification:** This matches the mobile banking example.

243. **Statement:** In deployment diagrams, communication paths are irrelevant if the system uses the Internet.
   - **Answer:** False
   - **Correct statement:** Communication paths are still relevant because they show how nodes communicate, including through the Internet.
   - **Justification:** Internet-based links are communication paths.

244. **Statement:** Component-based diagrams can highlight potential points of failure.
   - **Answer:** True
   - **Justification:** Dependencies and communication paths show where failures may propagate.

245. **Statement:** Deployment patterns help address deployment challenges but do not replace architectural thinking.
   - **Answer:** True
   - **Justification:** Patterns provide guidance, but design decisions still depend on requirements.

246. **Statement:** Containerization with Docker is unrelated to deploying software components.
   - **Answer:** False
   - **Correct statement:** Containerization with Docker is a deployment approach for packaging and running software components.
   - **Justification:** It is listed as a deployment pattern.

247. **Statement:** A three-tier architecture can separate presentation, application logic, and data storage across different nodes.
   - **Answer:** True
   - **Justification:** This is the common deployment meaning of three-tier architecture.

248. **Statement:** Cloud deployment means the system must run only on one local machine.
   - **Answer:** False
   - **Correct statement:** Cloud deployment places software on cloud infrastructure, often using distributed or virtualized resources.
   - **Justification:** Cloud deployment is a deployment pattern, not a single-machine restriction.

249. **Statement:** A deployment diagram can help compare different deployment alternatives.
   - **Answer:** True
   - **Justification:** It visualizes node allocation, communication, and resource distribution.

250. **Statement:** Component and deployment diagrams are useful because they represent different architectural concerns.
   - **Answer:** True
   - **Justification:** Component diagrams represent the development/software structure view, while deployment diagrams represent the physical view.

---

## Compact Answer Key

1 T, 2 F, 3 T, 4 F, 5 T, 6 F, 7 T, 8 F, 9 T, 10 F  
11 T, 12 F, 13 T, 14 F, 15 T, 16 F, 17 T, 18 F, 19 T, 20 F  
21 T, 22 F, 23 T, 24 F, 25 T, 26 T, 27 F, 28 T, 29 F, 30 T  
31 F, 32 T, 33 T, 34 F, 35 T, 36 T, 37 T, 38 F, 39 T, 40 F  
41 T, 42 F, 43 T, 44 T, 45 T, 46 F, 47 F, 48 T, 49 T, 50 F  
51 T, 52 T, 53 T, 54 F, 55 T, 56 T, 57 F, 58 T, 59 F, 60 T  
61 T, 62 F, 63 T, 64 F, 65 T, 66 T, 67 T, 68 T, 69 T, 70 F  
71 F, 72 T, 73 T, 74 F, 75 T, 76 T, 77 F, 78 T, 79 T, 80 F  
81 T, 82 T, 83 T, 84 T, 85 T, 86 F, 87 T, 88 T, 89 F, 90 T  
91 T, 92 T, 93 T, 94 F, 95 T, 96 T, 97 T, 98 F, 99 T, 100 T  
101 T, 102 F, 103 T, 104 T, 105 T, 106 T, 107 F, 108 T, 109 F, 110 T  
111 T, 112 T, 113 F, 114 F, 115 T, 116 T, 117 T, 118 T, 119 F, 120 T  
121 F, 122 T, 123 T, 124 F, 125 T, 126 T, 127 F, 128 T, 129 F, 130 T  
131 T, 132 T, 133 T, 134 F, 135 T, 136 T, 137 T, 138 F, 139 T, 140 T  
141 T, 142 F, 143 T, 144 F, 145 T, 146 T, 147 T, 148 T, 149 T, 150 F  
151 T, 152 T, 153 T, 154 F, 155 T, 156 F, 157 T, 158 F, 159 T, 160 F  
161 T, 162 T, 163 T, 164 F, 165 T, 166 F, 167 T, 168 T, 169 F, 170 T  
171 T, 172 F, 173 T, 174 F, 175 T, 176 T, 177 T, 178 T, 179 T, 180 F  
181 T, 182 T, 183 F, 184 T, 185 F, 186 T, 187 T, 188 T, 189 T, 190 F  
191 T, 192 T, 193 T, 194 F, 195 T, 196 T, 197 T, 198 T, 199 F, 200 T  
201 T, 202 F, 203 T, 204 F, 205 T, 206 T, 207 F, 208 T, 209 F, 210 T  
211 T, 212 F, 213 T, 214 T, 215 F, 216 T, 217 T, 218 T, 219 F, 220 T  
221 T, 222 F, 223 T, 224 T, 225 F, 226 T, 227 T, 228 F, 229 T, 230 T  
231 T, 232 F, 233 T, 234 F, 235 T, 236 T, 237 F, 238 T, 239 T, 240 F  
241 T, 242 T, 243 F, 244 T, 245 T, 246 F, 247 T, 248 F, 249 T, 250 T
