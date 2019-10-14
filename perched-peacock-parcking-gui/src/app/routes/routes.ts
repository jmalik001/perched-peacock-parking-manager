import { Routes } from '@angular/router';

import { LoginComponent } from 'src/app/routes/login/login.component';
import { SearchParkingComponent } from 'src/app/routes/search-parking/search-parking.component';
import { AdminHomeComponent } from 'src/app/routes/admin-home/admin-home.component';

export const appRoutes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'availability', component: SearchParkingComponent },
  { path: 'admin', component: AdminHomeComponent }
];
