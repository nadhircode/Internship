import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';
import { AssetRegistrationComponent } from './registration/asset-registration/asset-registration.component';
import { EmployeeRegistrationComponent } from './registration/employee-registration/employee-registration.component';
import { SearchComponent } from './search/search.component';
import { AssetSearchComponent } from './search/asset-search/asset-search.component';
import { EmployeeSearchComponent } from './search/employee-search/employee-search.component';
import { AssignmentSearchComponent } from './search/assignment-search/assignment-search.component';
import { AssignAssetComponent } from './assignment/assign-asset/assign-asset.component';
import { UnassignAssetComponent } from './assignment/unassign-asset/unassign-asset.component';

const routes: Routes = [
  { path: 'registration', component: RegistrationComponent, children: [
      { path: 'asset', component: AssetRegistrationComponent },
      { path: 'employee', component: EmployeeRegistrationComponent }
    ]
  },
  { path: 'search', component: SearchComponent, children: [
      { path: 'asset', component: AssetSearchComponent },
      { path: 'employee', component: EmployeeSearchComponent },
      { path: 'assignment', component: AssignmentSearchComponent }
    ]
  },
  { path: 'assignment', component: AssignAssetComponent },
  { path: 'unassignment', component: UnassignAssetComponent },
  { path: '', redirectTo: '/registration', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
