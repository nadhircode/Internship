package WeeklyAssignment1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Assignment1Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String con="n";
		String UpContinue = "n";
		String SearchContinue = "n";
		ArrayList<Employee> EmpList = new ArrayList<Employee>();
		ArrayList<Employee> EmpListCopy = new ArrayList<Employee>();
		ArrayList<Engineer> EmpEngList = new ArrayList<Engineer>();
		ArrayList<Admin> EmpAdmList = new ArrayList<Admin>();
		ArrayList<HRManager> EmpHRList = new ArrayList<HRManager>();
		
		
		do {

			// EMPLOYEE MENU
            System.out.println();
			System.out.println("EMPLOYEE MANAGEMENT SYSTEM:");
			System.out.println();
			System.out.println("1.Add New Employee.");
			System.out.println("2.Update Employee Details.");
			System.out.println("3.Display Employee Details.");
			System.out.println("4.Sort Employee Details.");
			System.out.println("5.Search Employee Details.");
			System.out.print("Enter your Choice(1,2,3,4,5): ");
			int ch = scan.nextInt();
			
			switch (ch) {
			case 1:

				// EMPLOYEE ADDITION

				Employee objEmp = new Employee();
				System.out.println();
				System.out.println("*****ADD EMPLOYEE DETAILS*****");
				System.out.println();
				System.out.print("Enter Employee Id: ");
				int id = scan.nextInt();
				objEmp.setEId(id);
				System.out.print("Enter Employee First Name: ");
				String First = scan.next();
				objEmp.setFirstName(First);
				System.out.print("Enter Employee Second Name: ");
				String Last = scan.next();
				objEmp.setSecondName(Last);
				System.out.print("Enter Date of Birth(dd/MM/yyyy): ");
				String dateOfBirth = scan.next();
				String date = LocalDateFn(dateOfBirth);
				objEmp.setDOB(date);
//				Employee objEmp=new Employee(id, First,Last, date);
				EmpList.add(objEmp);
				EmpListCopy.add(objEmp);
				System.out.print("Enter Employee Department(Engineer,Admin,HR): ");
				String Department = scan.next();
				
//				Department Input 
				
				switch (Department) {
				case "Engineer":
					Engineer objEng = new Engineer();
					objEng.setEId(id);
					objEng.setEngDept(Department);
					EmpEngList.add(objEng);
					break;
				case "Admin":
					Admin objAdm = new Admin();
					objAdm.setEId(id);
					objAdm.setAdDept(Department);
					EmpAdmList.add(objAdm);
					break;
				case "HR":
					HRManager objHR = new HRManager();
					objHR.setEId(id);
					objHR.setHRdept(Department);
					EmpHRList.add(objHR);
					break;
				default:
					System.out.println("Invalid Department!!!!");
				}
				break;
				
			case 2:

				// EMPLOYEE UPDATE

				System.out.println();
				System.out.println("*****UPDATE EMPLOYEE DETAILS*****");
				System.out.println();
				System.out.print("Enter the Employee's Id whose details should be Updated: ");
				int CId = scan.nextInt();
				for (Employee Emp : EmpList) {
					if (Emp.getEId() == CId) {
						do {

							// EMPLOYEE MENU

							System.out.println("****UPDATION MENU****");
							System.out.println("1.Update First Name.");
							System.out.println("2.Update Second Name.");
							System.out.println("3.Update DOB.");
							System.out.println("Enter your choice: ");
							int Updationch = scan.nextInt();

							switch (Updationch) {
							case 1:
								System.out.print("Enter the new First Name: ");
								String NewFirstName = scan.next();
								Emp.setFirstName(NewFirstName);
								break;
							case 2:
								System.out.print("Enter the new Second Name: ");
								String NewSecName = scan.next();
								Emp.setSecondName(NewSecName);
								break;
							case 3:
								System.out.print("Enter the new DOB: ");
								String NewDOB = scan.next();
								String NewOriginalDOB = LocalDateFn(NewDOB);
								Emp.setDOB(NewOriginalDOB);
								break;
							default:
								System.out.println("Invalid choice!!!!");
							}
							System.out.print("Do you want to update any other details of the current employee(y/n): ");
							UpContinue = scan.next();
						} while (UpContinue.equals("y"));
					}
				}
				break;
			case 3:

				// EMPLOYEE DISPLAY

				System.out.println();
				System.out.println("*****DISPLAY EMPLOYEE DETAILS*****");

				int i = 0;
				for (Employee emp : EmpList) {
					System.out.println();
					System.out.println("Employee " + (i + 1));
					System.out.println();
					System.out.println("Employee ID: " + emp.getEId());
					System.out.println("Employee First Name: " + emp.getFirstName());
					System.out.println("Employee Second Name: " + emp.getSecondName());
					System.out.println("Employee DOB: " + emp.getDOB());
					for (Engineer EmpEng : EmpEngList) {
						if (emp.getEId() == EmpEng.getEId()) {
							System.out.println("Employee Department: " + EmpEng.getEngDept());
						}
					}
					for (Admin EmpAdm : EmpAdmList) {
						if (emp.getEId() == EmpAdm.getEId()) {
							System.out.println("Employee Department: " + EmpAdm.getAdDept());
						}
					}
					for (HRManager EmpHR : EmpHRList) {
						if (emp.getEId() == EmpHR.getEId()) {
							System.out.println("Employee Department: " + EmpHR.getHRdept());
						}
					}

					i++;
				}
				break;
			case 4:

				// EMPLOYEE SORTING USING LAST NAME

				System.out.println();
				System.out.println("*****SORTING EMPLOYEE DETAILS BASED OF LAST NAME*****");
				System.out.println();
				Collections.sort(EmpListCopy, new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						// TODO Auto-generated method stub
						return o1.getSecondName().compareTo(o2.getSecondName());
					}
				});
				for (Employee emp : EmpListCopy) {
					System.out.println();
					System.out.println();
					System.out.println("Employee ID: " + emp.getEId());
					System.out.println("Employee First Name: " + emp.getFirstName());
					System.out.println("Employee Second Name: " + emp.getSecondName());
					System.out.println("Employee DOB: " + emp.getDOB());
					for (Engineer EmpEng : EmpEngList) {
						if (emp.getEId() == EmpEng.getEId()) {
							System.out.println("Employee Department: " + EmpEng.getEngDept());
						}
					}
					for (Admin EmpAdm : EmpAdmList) {
						if (emp.getEId() == EmpAdm.getEId()) {
							System.out.println("Employee Department: " + EmpAdm.getAdDept());
						}
					}
					for (HRManager EmpHR : EmpHRList) {
						if (emp.getEId() == EmpHR.getEId()) {
							System.out.println("Employee Department: " + EmpHR.getHRdept());
						}
					}

				}
				break;
			case 5:

				// EMPLOYEE SEARCH

				System.out.println();
				System.out.println("*****EMPLOYEE SEARCH*****");
				System.out.println();
				do {

					// SEARCH MENU

					System.out.println("****SEARCH MENU****");
					System.out.println("1.Search using First Name.");
					System.out.println("2.Search using Second Name.");
					System.out.println("3.Search using Employee ID.");
					System.out.println("Enter your choice: ");
					int Searchch = scan.nextInt();

					switch (Searchch) {
					case 1:
						System.out.print("Enter the First Name: ");
						String SearchFName = scan.next();
						for (Employee Emp : EmpList) {
							if (Emp.getFirstName().equals(SearchFName)) {
								System.out.println("EMPLOYEE WITH FIRST NAME " + SearchFName + " : ");
								System.out.println("Employee ID: " + Emp.getEId());
								System.out.println("Employee Second Name: " + Emp.getSecondName());
								System.out.println("Employee DOB: " + Emp.getDOB());
								for (Engineer EmpEng : EmpEngList) {
									if (Emp.getEId() == EmpEng.getEId()) {
										System.out.println("Employee Department: " + EmpEng.getEngDept());
									}
								}
								for (Admin EmpAdm : EmpAdmList) {
									if (Emp.getEId() == EmpAdm.getEId()) {
										System.out.println("Employee Department: " + EmpAdm.getAdDept());
									}
								}
								for (HRManager EmpHR : EmpHRList) {
									if (Emp.getEId() == EmpHR.getEId()) {
										System.out.println("Employee Department: " + EmpHR.getHRdept());
									}
								}

							}
						}
						break;
					case 2:
						System.out.print("Enter the Second Name: ");
						String SearchSName = scan.next();
						for (Employee Emp : EmpList) {
							if (Emp.getSecondName().equals(SearchSName)) {
								System.out.println("EMPLOYEE WITH SECOND NAME " + SearchSName + " : ");
								System.out.println("Employee ID: " + Emp.getEId());
								System.out.println("Employee First Name: " + Emp.getFirstName());
								System.out.println("Employee DOB: " + Emp.getDOB());
								for (Engineer EmpEng : EmpEngList) {
									if (Emp.getEId() == EmpEng.getEId()) {
										System.out.println("Employee Department: " + EmpEng.getEngDept());
									}
								}
								for (Admin EmpAdm : EmpAdmList) {
									if (Emp.getEId() == EmpAdm.getEId()) {
										System.out.println("Employee Department: " + EmpAdm.getAdDept());
									}
								}
								for (HRManager EmpHR : EmpHRList) {
									if (Emp.getEId() == EmpHR.getEId()) {
										System.out.println("Employee Department: " + EmpHR.getHRdept());
									}
								}

							}
						}
						break;
					case 3:
						System.out.print("Enter the Employee ID: ");
						int SearchEID = scan.nextInt();
						for (Employee Emp : EmpList) {
							if (Emp.getEId() == SearchEID) {
								System.out.println("EMPLOYEE WITH EMPLOYEE ID " + SearchEID + " : ");
								System.out.println("Employee First Name: " + Emp.getFirstName());
								System.out.println("Employee Second Name: " + Emp.getSecondName());
								System.out.println("Employee DOB: " + Emp.getDOB());
								for (Engineer EmpEng : EmpEngList) {
									if (Emp.getEId() == EmpEng.getEId()) {
										System.out.println("Employee Department: " + EmpEng.getEngDept());
									}
								}
								for (Admin EmpAdm : EmpAdmList) {
									if (Emp.getEId() == EmpAdm.getEId()) {
										System.out.println("Employee Department: " + EmpAdm.getAdDept());
									}
								}
								for (HRManager EmpHR : EmpHRList) {
									if (Emp.getEId() == EmpHR.getEId()) {
										System.out.println("Employee Department: " + EmpHR.getHRdept());
									}
								}

							}
						}
						break;
					default:
						System.out.println("Invalid choice!!!!");
					}
					System.out.print("Do you want to Search using any other details of the employees(y/n): ");
					SearchContinue = scan.next(); 
				} while (SearchContinue.equals("y"));
				break;
			default:
				System.out.println("Invalid choice!!!!");
			}
			System.out.print("Do want to do any other operation(y/n): ");
			con = scan.next();
		} while (con.equals("y"));
		scan.close();
	}
	
	public static String LocalDateFn(String DOB) {
		DateTimeFormatter IPFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate firstDate = LocalDate.parse(DOB, IPFormat);
		DateTimeFormatter OPFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String Output = firstDate.format(OPFormat);
		return Output;

	}

}
