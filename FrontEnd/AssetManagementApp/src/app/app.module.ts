import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './registration/registration.component';
import { AssetRegistrationComponent } from './registration/asset-registration/asset-registration.component';
import { EmployeeRegistrationComponent } from './registration/employee-registration/employee-registration.component';
import { SearchComponent } from './search/search.component';
import { AssetSearchComponent } from './search/asset-search/asset-search.component';
import { EmployeeSearchComponent } from './search/employee-search/employee-search.component';
import { AssignmentSearchComponent } from './search/assignment-search/assignment-search.component';
import { AssignAssetComponent } from './assignment/assign-asset/assign-asset.component';
import { UnassignAssetComponent } from './assignment/unassign-asset/unassign-asset.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AllAssetsComponent } from './all-assets/all-assets.component';
import { AllEmployeesComponent } from './all-employees/all-employees.component';
import { MatMenuModule } from '@angular/material/menu';


@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    AssetRegistrationComponent,
    EmployeeRegistrationComponent,
    SearchComponent,
    AssetSearchComponent,
    EmployeeSearchComponent,
    AssignmentSearchComponent,
    AssignAssetComponent,
    UnassignAssetComponent,
    AllAssetsComponent,
    AllEmployeesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatFormFieldModule,
    MatIconModule,
    FormsModule,
    HttpClientModule,
    MatMenuModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
