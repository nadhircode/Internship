import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private baseUrl = 'http://localhost:8080/employees'; // Adjust the URL accordingly

  constructor(private http: HttpClient) { }

  registerEmployee(employeeData: any): Observable<any> {
    const url = `${this.baseUrl}/create`; // Adjust the URL accordingly
    return this.http.post(url, employeeData);
  }
}
