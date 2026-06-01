# Architectural Design Scenario-Based Questions

Based on **Chapter 6: Architectural Design** and the final exam structure.

The final architectural-design scenario question usually expects you to:

1. Identify the most suitable architectural pattern or combination of patterns.
2. Justify why the selected pattern(s) fit the scenario.
3. Mention disadvantages, risks, or trade-offs.
4. Draw or describe a high-level architecture diagram.

Relevant patterns from the lecture:

- Model-View-Controller (MVC)
- Layered architecture
- Repository architecture
- Client-server architecture
- Pipe-and-filter architecture

---

# Easy Scenarios

## Easy Scenario 1 — Online Grade Viewer

A university wants a small web application where students can log in, view their grades, and see instructor feedback. Admins can update grades. The system uses one central database. Students access it using a browser.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage, and sketch the architecture.

### Model Answer

**Suitable patterns:**

- **Client-server architecture**
- **MVC**
- **Repository architecture**

**Justification:**

- **Client-server** fits because students and admins access the system remotely through a browser, while the server provides grade-management services.
- **MVC** fits because the system has a user interface, user interactions, and grade data that should be separated.
- **Repository** fits because all grades, feedback, users, and courses are stored in one central database.

**Risks / disadvantages:**

- The central database may become a **single point of failure**.
- MVC may add unnecessary complexity if the system remains very small.
- Client-server performance depends on the network and server availability.

**High-level diagram:**

```text
Student/Admin Browser (Client)
        |
        v
Web/Application Server
        |
        v
Controller ---------------> View / Response Page
        |
        v
Grade Model / Service
        |
        v
Central Grade Repository
```

---

## Easy Scenario 2 — Invoice Processing System

A company receives invoice files every night. The system validates each invoice, calculates tax, checks payment status, generates a summary report, and stores the final results. No user interaction is needed during processing.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage, and sketch the architecture.

### Model Answer

**Suitable patterns:**

- **Pipe-and-filter architecture**
- **Repository architecture**

**Justification:**

- **Pipe-and-filter** fits because invoices pass through a sequence of transformations: validation, tax calculation, payment checking, and report generation.
- **Repository** fits because processed invoices and reports must be stored for later access.

**Risks / disadvantages:**

- Pipe-and-filter requires filters to agree on a common data format.
- Each filter may need to parse and reformat data, increasing overhead.
- The repository may become a single point of failure.

**High-level diagram:**

```text
Invoice Files
     |
     v
Validate Invoice --> Calculate Tax --> Check Payment --> Generate Report
        |                |                 |                  |
        v                v                 v                  v
              Processed Invoice / Report Repository
```

---

# Medium Scenarios

## Medium Scenario 1 — E-Commerce Website

An online store allows customers to browse products, add items to a cart, place orders, and pay online. Admins can update product information and view sales reports. Customers use browsers and mobile apps. The system stores products, orders, payments, and customer data in a database.

### Required

Select suitable architectural pattern(s), justify your answer, mention trade-offs, and sketch the architecture.

### Model Answer

**Suitable patterns:**

- **Client-server architecture**
- **Layered architecture**
- **MVC**
- **Repository architecture**

**Justification:**

- **Client-server** fits because customers and admins access services remotely.
- **Layered architecture** fits because the system can be divided into presentation, business logic, data access, and database layers.
- **MVC** fits because the product and order data should be separated from the user interface.
- **Repository** fits because product, order, customer, and payment data must be centrally stored and consistently managed.

**Risks / trade-offs:**

- Layered architecture may reduce performance because requests pass through several layers.
- The repository/database can become a single point of failure.
- MVC may increase code structure and complexity.
- Client-server performance depends on network quality and server capacity.

**High-level diagram:**

```text
Browser / Mobile App (Client)
        |
        v
Web/API Server
        |
        v
Presentation / Controller Layer
        |
        v
Business Logic Layer
        |
        v
Data Access Layer
        |
        v
Product / Order / Payment Repository
```

---

## Medium Scenario 2 — Hospital Patient Information System

A hospital needs a system for doctors, nurses, and receptionists. Doctors view medical records and add diagnoses. Nurses update treatment notes. Receptionists manage appointments. Patient data must be protected, and different users should access only the information they are allowed to see.

### Model Answer

**Suitable patterns:**

- **Layered architecture**
- **Repository architecture**
- **Client-server architecture**
- **MVC**

**Justification:**

- **Layered architecture** fits because security can be enforced across layers, with sensitive medical data protected in inner layers.
- **Repository** fits because all patient records must be stored consistently in a central database.
- **Client-server** fits because different hospital staff access the system from different locations.
- **MVC** fits because user interfaces for doctors, nurses, and receptionists can differ while using the same patient data model.

**Risks / trade-offs:**

- Repository failure could affect the entire hospital system.
- Layered architecture may make emergency access slower if security checks are too heavy.
- Client-server systems may suffer if the network fails.

**High-level diagram:**

```text
Doctor UI     Nurse UI     Receptionist UI
    |            |               |
    v            v               v
       Presentation / Controller Layer
              |
              v
      Security / Access Layer
              |
              v
      Medical Business Logic
              |
              v
        Data Access Layer
              |
              v
      Patient Records Repository
```

---

## Medium Scenario 3 — Online Banking System

A bank wants a system where customers can view balances, transfer money, pay bills, and download statements. Employees can approve suspicious transactions. The system must be secure, reliable, and available through web and mobile interfaces.

### Model Answer

**Suitable patterns:**

- **Layered architecture**
- **Client-server architecture**
- **MVC**
- **Repository architecture**

**Justification:**

- **Layered architecture** fits because security is critical; sensitive account data can be placed in protected inner layers.
- **Client-server** fits because customers access banking services remotely.
- **MVC** fits because web and mobile interfaces can display the same account data differently.
- **Repository** fits because account, transaction, and customer data must be stored centrally and consistently.

**Risks / trade-offs:**

- Client-server architecture may be vulnerable to denial-of-service attacks.
- A central repository is a single point of failure unless redundancy is added.
- Layered security may increase processing overhead.

**High-level diagram:**

```text
Web UI / Mobile UI / Employee Portal
        |
        v
Controller Layer
        |
        v
Authentication & Authorization Layer
        |
        v
Banking Services Layer
        |
        v
Data Access Layer
        |
        v
Transaction Repository / Account Database
```

---

## Medium Scenario 4 — Compiler for a New Programming Language

A software company is building a compiler for a new programming language. The compiler must tokenize source code, check syntax, build a syntax tree, perform semantic analysis, and generate intermediate code. Several stages need access to shared information about variables and classes.

### Model Answer

**Suitable patterns:**

- **Pipe-and-filter architecture**
- **Repository architecture**

**Justification:**

- **Pipe-and-filter** fits because compilation happens through a sequence of transformation stages.
- **Repository** fits because the symbol table and syntax tree can be shared by different compiler components.

**Risks / trade-offs:**

- Pipe-and-filter requires agreement on the format passed between compiler stages.
- A shared repository can create dependency on central data structures.
- If the repository becomes corrupted, later stages may generate incorrect code.

**High-level diagram:**

```text
Source Code
    |
    v
Lexical Analyzer --> Syntax Analyzer --> Semantic Analyzer --> Code Generator
        |                  |                  |                  |
        v                  v                  v                  v
             Shared Compiler Repository
        (tokens, symbol table, syntax tree, intermediate code)
                                      |
                                      v
                                Target Code
```

---

## Medium Scenario 5 — Video Streaming Platform

A company wants a platform where users can browse videos, watch content, search by category, and receive recommendations. Admins upload and manage videos. The platform must support many users and multiple user interfaces.

### Model Answer

**Suitable patterns:**

- **Client-server architecture**
- **MVC**
- **Repository architecture**
- **Layered architecture**

**Justification:**

- **Client-server** fits because users stream videos from remote servers.
- **MVC** fits because web, TV, and mobile interfaces can present the same video data differently.
- **Repository** fits because video metadata, user profiles, watch history, and recommendations must be stored.
- **Layered architecture** fits because concerns can be separated into UI, recommendation logic, video management, and data layers.

**Risks / trade-offs:**

- Client-server performance may be unpredictable because streaming depends on network conditions.
- Central repositories may become bottlenecks.
- Layered architecture may add latency.

**High-level diagram:**

```text
Web / Mobile / TV Client
          |
          v
API / Streaming Server
          |
          v
View / Controller Layer
          |
          v
Video Service / Recommendation Service / Account Service
          |
          v
Data Access Layer
          |
          v
Video Metadata Repository / User Repository / Content Store
```

---

## Medium Scenario 6 — Library Management System

A public library needs a system to manage books, borrowers, loans, reservations, and fines. Users can search for books online. Librarians can update records. Several branches need access to the same book and borrower information.

### Model Answer

**Suitable patterns:**

- **Repository architecture**
- **Client-server architecture**
- **Layered architecture**

**Justification:**

- **Repository** fits because all branches need shared access to book, borrower, and loan data.
- **Client-server** fits because users and librarians access the system from different locations.
- **Layered architecture** fits because the system can separate user interface, library rules, and data management.

**Risks / trade-offs:**

- The repository may become a single point of failure.
- Network failure may prevent branches from accessing the system.
- Layered design can introduce extra processing overhead.

**High-level diagram:**

```text
User Browser / Librarian Terminal
              |
              v
Presentation / Controller Layer
              |
              v
Library Services Layer
              |
              v
Data Access Layer
              |
              v
Book / Borrower / Loan Repository
```

---

## Medium Scenario 7 — Weather Data Processing System

A meteorological center receives raw data from sensors every hour. The system cleans the data, removes errors, calculates averages, generates forecasts, and publishes reports. The system has little direct user interaction during processing.

### Model Answer

**Suitable patterns:**

- **Pipe-and-filter architecture**
- **Repository architecture**

**Justification:**

- **Pipe-and-filter** fits because weather data passes through sequential transformations.
- **Repository** fits because historical sensor data, cleaned data, and forecasts need to be stored and reused.

**Risks / trade-offs:**

- Filters must agree on data formats.
- Parsing and reformatting between stages may increase overhead.
- A central repository can become a bottleneck.

**High-level diagram:**

```text
Sensor Data
    |
    v
Clean Data --> Validate Data --> Calculate Averages --> Generate Forecast
    |              |                    |                    |
    v              v                    v                    v
              Weather Data / Forecast Repository
```

---

## Medium Scenario 8 — Social Media Dashboard

A company wants a dashboard that collects posts, comments, likes, and analytics from different social media platforms. The system displays charts to marketing users and stores historical analytics. Reports are generated daily.

### Model Answer

**Suitable patterns:**

- **Repository architecture**
- **MVC**
- **Pipe-and-filter architecture**
- **Client-server architecture**

**Justification:**

- **Repository** fits because posts, comments, metrics, and historical analytics are stored centrally.
- **MVC** fits because the same analytics data can be displayed as tables, charts, or reports.
- **Pipe-and-filter** fits because data collection, cleaning, analysis, and report generation happen in stages.
- **Client-server** fits because users access the dashboard remotely.

**Risks / trade-offs:**

- Repository bottlenecks may slow analytics.
- Pipe-and-filter stages require compatible data formats.
- MVC may increase complexity in simple dashboards.

**High-level diagram:**

```text
Social Media APIs
        |
        v
Collect Data --> Clean Data --> Analyze Data --> Generate Reports
        |              |              |                 |
        v              v              v                 v
              Social Analytics Repository
                          |
                          v
              Dashboard Controller / Views
```

---

## Medium Scenario 9 — Restaurant Ordering System

A restaurant wants a system where customers order from tablets, kitchen staff receive orders, cashiers handle payments, and managers view sales reports. Orders and payments must be stored. The kitchen screen should update when new orders arrive.

### Model Answer

**Suitable patterns:**

- **Client-server architecture**
- **Repository architecture**
- **MVC**
- **Layered architecture**

**Justification:**

- **Client-server** fits because tablets, cashier terminals, and kitchen screens are clients using shared services.
- **Repository** fits because orders, menu items, and payments must be centrally stored.
- **MVC** fits because customer, kitchen, cashier, and manager interfaces present the same order data differently.
- **Layered architecture** fits because payment logic, order logic, and data storage should be separated.

**Risks / trade-offs:**

- Server failure may stop ordering.
- Repository failure may affect all terminals.
- Layered processing may add delay if not designed efficiently.

**High-level diagram:**

```text
Customer Tablet / Kitchen Screen / Cashier Terminal
                         |
                         v
              Presentation / Controller Layer
                         |
                         v
              Order & Payment Services
                         |
                         v
                  Data Access Layer
                         |
                         v
                 Order Repository
```

---

## Medium Scenario 10 — Exam Marking and Reporting System

A university wants to process student exam results. The system imports marks from spreadsheets, validates student IDs, calculates final grades, detects failing students, produces statistics, and generates reports for departments.

### Model Answer

**Suitable patterns:**

- **Pipe-and-filter architecture**
- **Repository architecture**
- **Layered architecture**

**Justification:**

- **Pipe-and-filter** fits because marks go through clear processing stages.
- **Repository** fits because student records, marks, grades, and reports must be stored.
- **Layered architecture** fits if the system includes separate layers for import, validation, grading rules, and data access.

**Risks / trade-offs:**

- Filters must agree on a common format for student records.
- Repository failure can affect grade processing.
- Layered design may be excessive if the system is very small.

**High-level diagram:**

```text
Marks Spreadsheet
       |
       v
Import Marks --> Validate IDs --> Calculate Grades --> Generate Statistics --> Generate Reports
      |              |                  |                    |                  |
      v              v                  v                    v                  v
                         Student Marks / Reports Repository
```

---

# Hard Scenarios

## Hard Scenario 1 — National E-Government Services Platform

A government wants a platform where citizens can apply for national ID renewal, tax services, business licenses, and social-support services. Each service has its own rules, but all services need citizen identity data. Citizens access the platform from web and mobile apps. The system must be secure, available, maintainable, and able to add new services later.

### Model Answer

**Suitable patterns:**

- **Layered architecture**
- **Client-server architecture**
- **Repository architecture**
- **MVC**

**Justification:**

- **Layered architecture** is suitable because the system needs strong separation between user interface, authentication, service rules, and data access. It also supports security by protecting critical assets in inner layers.
- **Client-server** is suitable because citizens access government services remotely through web and mobile clients.
- **Repository** is suitable because citizen identity data, applications, licenses, and service records must be shared and managed consistently.
- **MVC** is suitable because the same government data may be shown through different interfaces, such as mobile apps, web dashboards, and employee portals.

**Major risks / trade-offs:**

- The central citizen repository is a high-risk single point of failure unless replicated and protected.
- Layered architecture may harm performance if each request passes through many security and validation layers.
- Client-server systems are vulnerable to server overload and denial-of-service attacks.
- MVC and layered architecture together may increase design complexity.

**High-level diagram:**

```text
Citizen Web App / Mobile App / Employee Portal
                    |
                    v
              Client-Server Entry Point
                    |
                    v
          Presentation / Controller Layer
                    |
                    v
        Authentication & Authorization Layer
                    |
                    v
      ID Service | Tax Service | License Service | Support Service
                    |
                    v
             Data Access Layer
                    |
                    v
        Citizen / Application / Service Repository
```

**Exam note:**

A weak answer would choose only repository architecture. Repository alone explains shared data, but it does not explain remote access, security layering, multiple interfaces, or maintainability.

---

## Hard Scenario 2 — Smart City Traffic Management System

A city wants a traffic-management system that receives data from road sensors, cameras, and traffic lights. It analyzes congestion, changes traffic-light timing, alerts operators, and stores historical traffic data. Operators view live dashboards, while automated components react to sensor events.

### Model Answer

**Suitable patterns:**

- **Repository architecture**
- **Pipe-and-filter architecture**
- **Client-server architecture**
- **MVC**
- **Layered architecture**

**Justification:**

- **Pipe-and-filter** fits the data-processing pipeline: collect sensor data, clean it, analyze congestion, and generate recommendations.
- **Repository** fits because historical traffic data, sensor logs, and analysis results must be stored and shared.
- **Client-server** fits because operators access dashboards and control functions remotely.
- **MVC** fits because live traffic data can be presented through maps, charts, alerts, and reports.
- **Layered architecture** fits because safety-critical control logic should be separated from dashboards and data storage.

**Major risks / trade-offs:**

- Pipe-and-filter may introduce delay, which is dangerous for real-time traffic control.
- Repository failure may affect analytics and historical reporting.
- Client-server communication may be affected by network failures.
- Safety-critical features should be localized to reduce accidental harm.

**High-level diagram:**

```text
Sensors / Cameras / Traffic-Light Status Events
       |
       v
Collect Data --> Clean Data --> Analyze Congestion --> Recommend Actions
      |              |                 |                    |
      v              v                 v                    v
                    Traffic Data Repository
                              |
                              v
                     Control Logic Layer
                     /                  \
                    v                    v
        Traffic Light Controllers   Operator Dashboard Views
```

**Exam note:**

This scenario has both data-processing and interactive-control requirements. A strong answer combines patterns instead of forcing the whole system into only pipe-and-filter.

---

## Hard Scenario 3 — University Learning Management System

A university wants a web-based learning platform. Students view lectures, submit assignments, check grades, and receive announcements. Instructors upload materials, grade work, and create quizzes. Admins manage users, courses, semesters, and permissions. The system must support web, mobile, reports, and future dashboard interfaces. It stores large amounts of shared academic data.

### Model Answer

**Suitable patterns:**

- **Client-server architecture**
- **MVC**
- **Layered architecture**
- **Repository architecture**
- **Pipe-and-filter architecture** for report generation

**Justification:**

- **Client-server** fits because students, instructors, and admins access services remotely.
- **MVC** fits because the same course, assignment, and grade data can be shown through web, mobile, and dashboard interfaces.
- **Layered architecture** fits because presentation, course logic, grading logic, permissions, and data access should be separated.
- **Repository** fits because users, courses, submissions, grades, announcements, and logs are shared academic data.
- **Pipe-and-filter** fits specific workflows such as transcript generation, semester reports, plagiarism reports, or analytics pipelines.

**Major risks / trade-offs:**

- Layered architecture may reduce performance if every request goes through many layers.
- Repository failure may affect the whole system.
- MVC may add complexity if some screens are simple.
- Pipe-and-filter is not suitable for highly interactive features such as live quizzes unless carefully designed.

**High-level diagram:**

```text
Student App / Instructor Web / Admin Dashboard
                    |
                    v
          Presentation / Controller Layer
                    |
                    v
        Authentication / Permission Layer
                    |
                    v
 Course Service | Assignment Service | Grade Service | Quiz Service
                    |
                    v
              Academic Repository
                    |
                    v
       Report Pipeline: Extract --> Process --> Format --> Publish
```

**Exam note:**

A strong answer separates the main interactive LMS architecture from batch-style reporting workflows.

---

## Hard Scenario 4 — Enterprise Document Management System

A multinational company wants a document-management system. Employees upload, search, edit, and share documents. Legal documents require strict access control. The system must keep version history, allow multiple departments to access shared documents, generate audit reports, and support future integrations with other company systems.

### Model Answer

**Suitable patterns:**

- **Repository architecture**
- **Layered architecture**
- **Client-server architecture**
- **MVC**
- **Pipe-and-filter architecture** for audit/report generation

**Justification:**

- **Repository** fits because documents, metadata, versions, permissions, and audit logs are shared central data.
- **Layered architecture** fits because access control and document rules must be separated from presentation and storage.
- **Client-server** fits because employees in different locations access document services remotely.
- **MVC** fits because documents and metadata can be displayed differently in search views, edit views, admin views, and audit views.
- **Pipe-and-filter** fits report generation: collect logs, filter by department/date, analyze access patterns, and generate audit reports.

**Major risks / trade-offs:**

- Repository failure could block access to all company documents.
- Repository architecture may create performance bottlenecks with large document files.
- Layered architecture may make permission checks complex.
- Client-server performance depends on network reliability across regions.

**High-level diagram:**

```text
Employee Browser / Admin Portal / Integration Client
                         |
                         v
              Presentation / Controller Layer
                         |
                         v
              Access Control & Policy Layer
                         |
                         v
          Document Service / Version Service / Search Service
                         |
                         v
              Document Repository + Metadata Repository
                         |
                         v
        Audit Pipeline: Collect Logs --> Filter --> Analyze --> Report
```

**Exam note:**

The key issue is that repository architecture is central, but security and maintainability require layered organization around it.

---

## Hard Scenario 5 — Online Travel Reservation System

A travel company wants a system where users can search flights, hotels, and car rentals, compare prices, make reservations, pay online, and receive confirmations. The system integrates with external providers. Availability and prices change frequently. Users access the system through web and mobile apps. The system must store bookings, payments, customers, and search history.

### Model Answer

**Suitable patterns:**

- **Client-server architecture**
- **Layered architecture**
- **MVC**
- **Repository architecture**
- **Pipe-and-filter architecture** for booking/report workflows

**Justification:**

- **Client-server** fits because users access reservation services remotely.
- **Layered architecture** fits because search, booking, payment, provider integration, and data access should be separated.
- **MVC** fits because web and mobile apps can present the same travel data differently.
- **Repository** fits because bookings, customers, payments, and search history must be stored.
- **Pipe-and-filter** can fit selected workflows such as booking confirmation: validate request, check availability, reserve item, process payment, generate confirmation.

**Major risks / trade-offs:**

- Client-server performance depends on networks and external provider response times.
- Repository failure can affect booking history and payment records.
- Pipe-and-filter may not be suitable for all interactive search features because users expect fast responses.
- Layered architecture may add latency to already time-sensitive booking operations.

**High-level diagram:**

```text
Web App / Mobile App
        |
        v
Presentation / Controller Layer
        |
        v
Search Service | Booking Service | Payment Service
      |               |                 |
      v               v                 v
External Providers   Booking Pipeline   Payment Gateway
 (flight/hotel/car)  Validate -> Reserve -> Pay -> Confirm
                      |
                      v
              Data Access Layer
                      |
                      v
      Booking / Customer / Payment Repository
```

**Exam note:**

A strong answer recognizes that some parts are interactive transaction processing, while other parts can be pipeline-style workflows.

---

# Summary of Common Pattern Choices

| Scenario Type | Common Suitable Pattern(s) |
|---|---|
| Remote users accessing services | Client-server |
| Multiple user interfaces over same data | MVC |
| Strong security and separation of concerns | Layered architecture |
| Large shared persistent data | Repository |
| Sequential data transformation | Pipe-and-filter |
| Transaction-based database system | Client-server + layered + repository |
| Compiler or language processor | Pipe-and-filter + repository |
| Batch report generation | Pipe-and-filter |

---

# Common Mistakes to Avoid

1. **Choosing only one pattern when the scenario clearly needs several.**
   Many real systems combine client-server, layered, MVC, and repository architecture.

2. **Using pipe-and-filter for highly interactive systems without qualification.**
   Pipe-and-filter is stronger for batch or staged processing.

3. **Ignoring non-functional requirements.**
   Security, availability, maintainability, and performance often determine the architecture.

4. **Saying repository means “database only.”**
   Repository architecture means components communicate through a shared central data store, not just that a database exists.

5. **Confusing MVC with layered architecture.**
   MVC separates model, view, and controller. Layered architecture organizes the whole system into layers that provide services to adjacent layers.
