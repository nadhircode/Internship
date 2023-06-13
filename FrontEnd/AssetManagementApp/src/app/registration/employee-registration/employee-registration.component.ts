import { Component } from '@angular/core';
import { Employee } from 'src/app/employee'; // Import the Employee model
import { EmployeeService } from 'src/app/employee.service';

@Component({
  selector: 'app-employee-registration',
  templateUrl: './employee-registration.component.html',
  styleUrls: ['./employee-registration.component.css']
})
export class EmployeeRegistrationComponent {

  constructor(private employeeService: EmployeeService) { }


  //employee: Employee = new Employee(); // Create an instance of the Employee model

  employee: any = {
    employeeId: '',
    name: '',
    age:  '',
    department:  '',
    role:  ''
  };
  




  registerEmployee() {
    // Logic to handle employee registration
  }

  onSubmit(employeeData: any): void {
    console.log(this.employee);

    this.employeeService.registerEmployee(employeeData)
      .subscribe(
        response => {
          // Handle success response
          console.log('Employee registration successful:', response);
        },
        error => {
          // Handle error response
          console.error('Employee registration failed:', error);
        }
      );
  }
  

}
