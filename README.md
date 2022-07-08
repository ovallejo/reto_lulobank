[![CircleCI](https://dl.circleci.com/status-badge/img/gh/ovallejo/reto_lulobank/tree/main.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/ovallejo/reto_lulobank/tree/main)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=ovallejo_reto_lulobank&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=ovallejo_reto_lulobank)
# Dummy Rest API Example Automation

## Beginning With 🚀
 _These instructions will allow you to run the Dummy Rest API Example automation._
  * _Get all employee data_
  * _Get employee data_
  * _Create a new employee_
  * _Update an employee record_
  * _Delete an employee record_

## Prerequisites 🌎

  * _JDK 8_
  * _Gradle 7+_

## Execution of Tests⛷️

### Execution Get All Employee Data Test Set
```
gradlew clean test --tests *AllEmployeesDataTest -i

```

### Execution Get Employee Data Test Set
```
gradlew clean test --tests *EmployeeDataTest -i

```

### Execution Create a New Employee Test Set
```
gradlew clean test --tests *CreateEmployeeTest -i

```

### Execution Update Employee Record Test Set
```
gradlew clean test --tests *UpdateEmployeeDataTest -i

```

### Execution Delete an Employee Record Test Set
```
gradlew clean test --tests *DeleteEmployeeRecordTest -i

```


## Built with 🛠

_Tools used to create the project_
* [Gradle](https://maven.apache.org/) - Gradle is an open source build automation tool that is designed to be flexible enough to build almost any type of software.
* [Serenity-BDD](http://www.thucydides.info/) - It is an open source library that helps to write automated acceptance tests of higher quality and faster. Its main features are: Writing flexible and easy-to-maintain tests.


## Versioned 📌
We are using [GitHub](https://github.com/ovallejo/reto_lulobank)