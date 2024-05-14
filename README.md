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

## Classes

### Curriculum

- **Description**: Represents an academic curriculum containing a list of subjects for a specific term and curriculum type (e.g., full-time or part-time).
- **Attributes**:
  - `Term`: The term or semester of the curriculum.
  - `Subjects`: List of subjects included in the curriculum.
  - `Type`: The type of curriculum (full-time or part-time).
- **Methods**:
  - `getTerm()`: Returns the term of the curriculum.
  - `getType()`: Returns the type of curriculum.
  - `getInfo()`: Generates a formatted string containing information about the curriculum.
  - `getYear()`: Calculates and returns the academic year of the curriculum.
  - `getSubjects()`: Returns the list of subjects in the curriculum.
  - `getLecturers()`: Returns a list of unique professors teaching subjects in the curriculum.
  - `addSubject(subject)`: Adds a subject to the curriculum.
  - `removeSubject(subject)`: Removes a subject from the curriculum.

### Group

- **Description**: Represents a group of students enrolled in a specific curriculum type.
- **Attributes**:
  - `Term`: The current term or semester of the group.
  - `Students`: List of students in the group.
  - `Mayor`: Student elected as the group's mayor.
  - `Curriculum`: The curriculum associated with the group.
- **Methods**:
  - `getYear()`: Calculates and returns the academic year of the group.
  - `getStudents()`: Returns the list of students in the group.
  - `setNewTerm()`: Updates the term of the group and checks if the group has graduated.
  - `setMayor(student)`: Sets the mayor of the group.
  - `setStudents(students)`: Sets the list of students in the group.
  - `setCurriculum(type)`: Sets the curriculum associated with the group.
  - `add(student)`: Adds a student to the group.
  - `remove(student)`: Removes a student from the group.

### Subject

- **Description**: Represents an academic subject taught by a professor.
- **Attributes**:
  - `Name`: The name of the subject.
  - `Hours`: The number of hours dedicated to the subject.
  - `Lecturer`: The professor teaching the subject.
- **Methods**:
  - `getName()`: Returns the name of the subject.
  - `getHours()`: Returns the number of hours dedicated to the subject.
  - `getLecturer()`: Returns the professor teaching the subject.
  - `getInfo()`: Generates a formatted string containing information about the subject.
  - `changeHoursNumber(hours)`: Changes the number of hours dedicated to the subject.
  - `changeLecturer(lecturer)`: Changes the professor teaching the subject.
 
 ### Person

- **Description**: Represents a person associated with the university, including students, professors, and personnel.
- **Attributes**:
  - `Name`: The first name of the person.
  - `Surname`: The last name of the person.
  - `Gender`: The gender of the person.
  - `PersonalCode`: The unique personal identification code of the person.
  - `BirthDate`: The date of birth of the person.
  - `Email`: The email address of the person.
  - `Phone`: The phone number of the person.
  - `Address`: The residential address of the person.
  - `City`: The city of residence of the person.
  - `Country`: The country of residence of the person.
- **Methods**:
  - `getInfo()`: Generates a formatted string containing information about the person.
  - `getName()`: Returns the first name of the person.
  - `getSurname()`: Returns the last name of the person.
  - `getGender()`: Returns the gender of the person.
  - `getPersonalCode()`: Returns the personal identification code of the person.
  - `getBirthDate()`: Returns the date of birth of the person.
  - `getEmail()`: Returns the email address of the person.
  - `getPhone()`: Returns the phone number of the person.
  - `getFullName()`: Returns the full name of the person.
  - `getFullAddress()`: Returns the full address of the person.
  - `getContactInfo()`: Returns the contact information (phone and email) of the person.
  - `changeSurname(surname)`: Updates the last name of the person.
  - `changeEmail(email)`: Updates the email address of the person.
  - `changePhoneNumber(phone)`: Updates the phone number of the person.
  - `changeAddress(address)`: Updates the residential address of the person.
  - `changeCity(city)`: Updates the city of residence of the person.
  - `changeCountry(country)`: Updates the country of residence of the person.

### Student

- **Description**: Represents a student enrolled in the university.
- **Attributes**:
  - `StudentId`: The unique identification number of the student.
- **Methods**:
  - Inherits methods from the `Person` class.
  - `getInfo()`: Generates a formatted string containing information about the student.

### Employee

- **Description**: An interface implemented by classes representing university employees.
- **Methods**:
  - `getSalary()`: Returns the salary of the employee.
  - `changeSalary(amount)`: Updates the salary of the employee.

### Personnel

- **Description**: Represents non-academic personnel working at the university, such as administrative staff.
- **Attributes**:
  - `Field`: The field or department in which the personnel works.
- **Methods**:
  - Inherits methods from the `Person` class.
  - Inherits methods from the `Employee` interface.

### Professor

- **Description**: Represents a professor or academic staff member at the university.
- **Attributes**:
  - `Professorship`: The academic rank or position of the professor.
  - `Degree`: The highest academic degree attained by the professor.
  - `Subjects`: List of subjects taught by the professor.
- **Methods**:
  - Inherits methods from the `Person` class.
  - Inherits methods from the `Employee` interface.
  - `getSubjects()`: Returns the list of subjects taught by the professor.
  - `getProfessorship()`: Returns the academic rank of the professor.
  - `getDegree()`: Returns the highest academic degree of the professor.
  - `addSubject(subject)`: Adds a subject to the list of subjects taught by the professor.
  - `removeSubject(subject)`: Removes a subject from the list of subjects taught by the professor.


### Subject

- **Description**: Represents a subject or course offered by the university.
- **Attributes**:
  - `Name`: The name of the subject.
  - `Hours`: The number of hours dedicated to the subject.
  - `Lecturer`: The professor responsible for teaching the subject.
- **Methods**:
  - `getName()`: Returns the name of the subject.
  - `getHours()`: Returns the number of hours dedicated to the subject.
  - `getLecturer()`: Returns the professor teaching the subject.
  - `getInfo()`: Generates a formatted string containing information about the subject.
  - `changeHoursNumber(hours)`: Updates the number of hours dedicated to the subject.
  - `changeLecturer(lecturer)`: Updates the professor teaching the subject.

### Group

- **Description**: Represents a group of students following a specific curriculum at the university.
- **Attributes**:
  - `Term`: The current term or year of the group.
  - `Students`: List of students belonging to the group.
  - `Mayor`: The student elected as the group mayor.
  - `Curriculum`: The curriculum followed by the group.
- **Methods**:
  - `getInfo()`: Generates a formatted string containing information about the group.
  - `getYear()`: Returns the current academic year of the group.
  - `getStudents()`: Returns the list of students belonging to the group.
  - `setNewTerm()`: Updates the term/year of the group and its curriculum.
  - `setMayor(student)`: Sets the mayor of the group.
  - `setStudents(students)`: Sets the list of students belonging to the group.
  - `setCurriculum(type)`: Sets the curriculum followed by the group.
  - `add(student)`: Adds a student to the group.
  - `remove(student)`: Removes a student from the group.
  - `getTerm()`: Returns the current term/year of the group.

