import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './nav/nav.component';
import { HomeComponent } from './home/home.component';

import { SearchComponent } from './search/search.component';
import { BookParkingComponent } from './book-parking/book-parking.component';
import { BookingDetailsComponent } from './booking-details/booking-details.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { LoginComponent } from './login/login.component';


@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    HomeComponent,
    SearchComponent,
    BookParkingComponent,
    BookingDetailsComponent,
    ContactComponent,
    AboutComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
