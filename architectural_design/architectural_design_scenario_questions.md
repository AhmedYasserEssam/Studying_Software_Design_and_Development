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


---

## Easy Scenario 2 — Invoice Processing System

A company receives invoice files every night. The system validates each invoice, calculates tax, checks payment status, generates a summary report, and stores the final results. No user interaction is needed during processing.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage, and sketch the architecture.

---

# Medium Scenarios
## Medium Scenario 1 — E-Commerce Website

An online store allows customers to browse products, add items to a cart, place orders, and pay online. Admins can update product information and view sales reports. Customers use browsers and mobile apps. The system stores products, orders, payments, and customer data in a database.

### Required

Select suitable architectural pattern(s), justify your answer, mention trade-offs, and sketch the architecture.


---

## Medium Scenario 2 — Hospital Patient Information System

A hospital needs a system for doctors, nurses, and receptionists. Doctors view medical records and add diagnoses. Nurses update treatment notes. Receptionists manage appointments. Patient data must be protected, and different users should access only the information they are allowed to see.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Medium Scenario 3 — Online Banking System

A bank wants a system where customers can view balances, transfer money, pay bills, and download statements. Employees can approve suspicious transactions. The system must be secure, reliable, and available through web and mobile interfaces.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Medium Scenario 4 — Compiler for a New Programming Language

A software company is building a compiler for a new programming language. The compiler must tokenize source code, check syntax, build a syntax tree, perform semantic analysis, and generate intermediate code. Several stages need access to shared information about variables and classes.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Medium Scenario 5 — Video Streaming Platform

A company wants a platform where users can browse videos, watch content, search by category, and receive recommendations. Admins upload and manage videos. The platform must support many users and multiple user interfaces.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Medium Scenario 6 — Library Management System

A public library needs a system to manage books, borrowers, loans, reservations, and fines. Users can search for books online. Librarians can update records. Several branches need access to the same book and borrower information.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Medium Scenario 7 — Weather Data Processing System

A meteorological center receives raw data from sensors every hour. The system cleans the data, removes errors, calculates averages, generates forecasts, and publishes reports. The system has little direct user interaction during processing.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Medium Scenario 8 — Social Media Dashboard

A company wants a dashboard that collects posts, comments, likes, and analytics from different social media platforms. The system displays charts to marketing users and stores historical analytics. Reports are generated daily.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Medium Scenario 9 — Restaurant Ordering System

A restaurant wants a system where customers order from tablets, kitchen staff receive orders, cashiers handle payments, and managers view sales reports. Orders and payments must be stored. The kitchen screen should update when new orders arrive.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Medium Scenario 10 — Exam Marking and Reporting System

A university wants to process student exam results. The system imports marks from spreadsheets, validates student IDs, calculates final grades, detects failing students, produces statistics, and generates reports for departments.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.

---

# Hard Scenarios
## Hard Scenario 1 — National E-Government Services Platform

A government wants a platform where citizens can apply for national ID renewal, tax services, business licenses, and social-support services. Each service has its own rules, but all services need citizen identity data. Citizens access the platform from web and mobile apps. The system must be secure, available, maintainable, and able to add new services later.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Hard Scenario 2 — Smart City Traffic Management System

A city wants a traffic-management system that receives data from road sensors, cameras, and traffic lights. It analyzes congestion, changes traffic-light timing, alerts operators, and stores historical traffic data. Operators view live dashboards, while automated components react to sensor events.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Hard Scenario 3 — University Learning Management System

A university wants a web-based learning platform. Students view lectures, submit assignments, check grades, and receive announcements. Instructors upload materials, grade work, and create quizzes. Admins manage users, courses, semesters, and permissions. The system must support web, mobile, reports, and future dashboard interfaces. It stores large amounts of shared academic data.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Hard Scenario 4 — Enterprise Document Management System

A multinational company wants a document-management system. Employees upload, search, edit, and share documents. Legal documents require strict access control. The system must keep version history, allow multiple departments to access shared documents, generate audit reports, and support future integrations with other company systems.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.


---

## Hard Scenario 5 — Online Travel Reservation System

A travel company wants a system where users can search flights, hotels, and car rentals, compare prices, make reservations, pay online, and receive confirmations. The system integrates with external providers. Availability and prices change frequently. Users access the system through web and mobile apps. The system must store bookings, payments, customers, and search history.

### Required

Choose the most suitable architectural pattern(s), justify your choice, mention one disadvantage or trade-off, and sketch the architecture.
