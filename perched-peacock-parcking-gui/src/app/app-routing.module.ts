import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from 'src/app/login/login.component';
import { HomeComponent } from 'src/app/home/home.component';
import { ContactComponent } from 'src/app/contact/contact.component';
import { AboutComponent } from './about/about.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'contact', component: ContactComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],

exports: [RouterModule]
})
export class AppRoutingModule { }
