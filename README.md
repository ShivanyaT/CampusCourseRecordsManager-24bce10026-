# Campus Course Records Manager (CCRM)

## 📚 Project Summary
The Campus Course Records Manager (CCRM) is a **Java SE console application** designed to showcase **Object-Oriented Programming (OOP) principles** and advanced Java functionalities. It facilitates management of:
- **Students**: Add, view, modify, or deactivate student records.
- **Courses**: Create, list, search, and assign instructors to courses.
- **Enrollments & Grades**: Track student enrollments, record grades, compute GPAs, and generate transcripts.
- **File Operations**: Support for data import/export and backup with recursive utilities.

This project was developed as part of the **Java Programming course** requirements.

---

## ▶️ Getting Started
To run the application:
1. Compile the Java source files:
   ```bash
   javac -d out src/edu/ccrm/**/*.java

java -cp out edu.ccrm.cli.Main

👉 If you are using VS Code, right-click on Main.java → Run Java.

🖥️ Features Implemented
Student Management (add, list, deactivate students)
Course Management (create, list, search courses)
Enrollment & GPA (enroll students, assign grades, calculate GPA)
Transcripts (print student transcripts with grades & GPA)
Import/Export data (CSV/JSON-like simulation)
Backup System (timestamped folder creation using NIO.2)
Recursion Utilities (calculate folder size recursively)
Menu-Driven CLI (user-friendly interface)

📘 Java Basics (as required in project)
Evolution of Java
1995 – Java 1.0 (Sun Microsystems, applets & portability)
2004 – Java 5 (Generics, Enums, Annotations)
2014 – Java 8 (Streams, Lambdas)
2017 – Java 9+ (Modules, JShell)
Present – Java 17/21 (LTS, Records, Switch enhancements)

| Edition                          | Use Case                      |
| -------------------------------- | ----------------------------- |
| **Java ME (Micro Edition)**      | Mobile/embedded devices       |
| **Java SE (Standard Edition)**   | Desktop & console apps        |
| **Java EE (Enterprise Edition)** | Web servers & enterprise apps |

JDK vs JRE vs JVM
JDK (Java Development Kit) → Includes tools for development (compiler, debugger, libraries).
JRE (Java Runtime Environment) → Runs Java applications, includes JVM and libraries.
JVM (Java Virtual Machine) → Executes Java bytecode.

🛠️ Project Setup
Installation
1.Install JDK 17 or later → verify:
java -version
2.Install VS Code + Extension Pack for Java.
3.Clone this repo:
git clone <your-repo-link>
cd CampusCourseRecordsManager

Screenshots
✅ java -version output
✅ VS Code folder structure
✅ Running CLI menu in terminal
✅ Backup folder created

🏗️ OOP & Advanced Concepts Mapping
| Concept                           | Where Implemented                                        |
| --------------------------------- | -------------------------------------------------------- |
| **Encapsulation**                 | `Person.java`, `Student.java`                            |
| **Inheritance**                   | `Student`, `Instructor` extend `Person`                  |
| **Abstraction**                   | `Person` (abstract class)                                |
| **Polymorphism**                  | Transcript printing (`TranscriptServiceImpl`)            |
| **Method Overloading/Overriding** | Services, domain classes                                 |
| **Interfaces**                    | `StudentService`, `CourseService`, etc.                  |
| **Immutability**                  | `CourseCode.java`                                        |
| **Nested Classes**                | (Add inner/static class if required)                     |
| **Enums**                         | `Grade.java`, `Semester.java`                            |
| **Lambdas & Streams**             | Filtering/searching courses                              |
| **Singleton**                     | `AppConfig.java`                                         |
| **Builder Pattern**               | `CourseBuilder.java`                                     |
| **Exception Handling**            | Custom exceptions (e.g., `DuplicateEnrollmentException`) |
| **Assertions**                    | Data validation                                          |
| **Recursion**                     | `RecursionUtils.java`                                    |
| **NIO.2**                         | `BackupService.java`, `ImportExportService.java`         |

📂 Repository Structure
src/edu/ccrm/
 ├─ cli/        → Main.java (menu-driven UI)
 ├─ domain/     → Entities (Student, Instructor, Course, etc.)
 ├─ service/    → Business logic (StudentService, CourseService)
 ├─ io/         → Import/Export, Backup handling
 ├─ util/       → Validators, Comparators, Recursion
 └─ config/     → Singleton & Builder classes

 📷 Sample Screenshots
<img width="689" height="120" alt="Screenshot 2025-09-09 221300" src="https://github.com/user-attachments/assets/c137cd6a-c204-4b5a-ba1d-d10931fc7d0b" />

<img width="1920" height="1080" alt="Screenshot 2025-09-09 222553" src="https://github.com/user-attachments/assets/ecf7d338-7ea7-4d6f-bdf1-ded9e327e5b2" />

 

 <img width="1920" height="1080" alt="Screenshot 2025-09-09 221356" src="https://github.com/user-attachments/assets/b58a9c68-8a4b-4636-8005-0c8517f96d6e" />


 
<img width="735" height="805" alt="Screenshot 2025-09-17 215721" src="https://github.com/user-attachments/assets/1e40d55b-139f-495c-b7d9-a6bc5888f9a0" />
<img width="1920" height="1080" alt="Screenshot 2025-09-17 221035" src="https://github.com/user-attachments/assets/f3bc9cc4-e549-440f-abef-e9411ab1b1eb" />


 <img width="1920" height="1080" alt="Screenshot 2025-09-17 221707" src="https://github.com/user-attachments/assets/1dde0e6b-a2d9-4a43-aa86-e5c2cedffe6a" />







