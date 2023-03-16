# BPP-experiments
The project focuses on learning about the function or workings of the BeanPostProcessor interface.

In the project a user enters his/her details in a JSP form which is provided.

However, he/she is not required to enter the current date as the system creates this date automatically on the DTO beans by using the BeanPostProcessor interface.

Through this interface, the EmployeeDTO and StudentDTO beans acquire the current date property and pass it on to the EmployeeBO and StudentBO beans that is in the service class.

Copying of the DTO bean values to the BO beans is done by the use of the BeanUtils interface which works by using accessor functions of the said beans.

