# University Management System

The University Management System is a comprehensive Java-based application designed to streamline the administrative tasks of a university. This system provides a centralized platform to manage students, professors, academic curriculums, and student groups efficiently.

## About

The University Management System aims to simplify various administrative processes within a university environment. It offers a user-friendly interface for university staff to manage student enrollment, faculty details, academic curriculums, and more. By automating routine tasks and providing robust data management capabilities, this system enhances the overall efficiency and productivity of university operations.

## Features

- **Student Management**: Easily add, remove, and update student records, including personal details, contact information, and enrollment status.
- **Professor Management**: Manage faculty information, including name, gender, academic qualifications, teaching assignments, and salary details.
- **Curriculum Management**: Create and customize academic curriculums for different study fields, assign subjects to semesters, and track curriculum progress.
- **Group Management**: Organize students into groups based on their academic term, curriculum type, and other criteria.
- **Excel Integration**: Import and export student, faculty, and curriculum data using Excel files for seamless data exchange and management.

## Technologies Used

- **Java**: Core programming language used for backend development.
- **Apache POI**: Library for Excel integration, facilitating data import and export functionalities.
- **Maven**: Build automation tool for managing project dependencies and configuration.
- **Object-Oriented Design**: Utilizes object-oriented programming principles for modular and scalable code architecture.

## Installation

1. Clone the repository: `git clone <repository-url>`
2. Navigate to the project directory: `cd UniversityManagementSystem`
3. Build the project: `mvn clean install`
4. Run the application: `java -jar target/university-management-system.jar`

## Usage

1. Launch the application.
2. Navigate through the available options using the command-line interface.
3. Use the provided functionalities to manage students, professors, curriculums, and groups.
4. Import data from Excel sheets or export data to Excel files as needed.

## Downloading the Project
To download the University Management System project to your local machine, follow these steps:
1. Navigate to the GitHub repository: [University Management System](https://github.com/rzyczu/university-management-system).
2. Click on the green "Code" button and copy the repository URL.
3. Open Git Bash or Terminal on your computer.
4. Navigate to the directory where you want to download the project.
5. Use the `git clone` command followed by the repository URL:
   ```bash git clone https://github.com/your-username/university-management-system.git```
6. Press Enter to download the project.
7. Access the downloaded project in your file explorer or terminal.


## Data Files
The project includes Excel files in the `data` folder to facilitate importing data into the system. These files contain sample data for students, personnel, and professors.

### StudentList.xlsx
- Contains data for students enrolled in the university.
- Columns: name, surname, gender, personalCode, birthDate, email, phone, address, city, country, studentID.

### PersonnelList.xlsx
- Contains data for administrative personnel working at the university.
- Columns: name, surname, gender, personalCode, birthDate, email, phone, address, city, country, salary, field.

### ProfessorList.xlsx
- Contains data for professors employed by the university.
- Columns: name, surname, gender, personalCode, birthDate, email, phone, address, city, country, salary, professorship, degree.

