import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { LoggerModule, NgxLoggerLevel } from 'ngx-logger';

import { RoutesModule } from './routes/routes.module';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './routes/login/login.component';
import { SearchParkingComponent } from './routes/search-parking/search-parking.component';
import { AdminHomeComponent } from './routes/admin-home/admin-home.component';

@NgModule({
  declarations: [AppComponent, LoginComponent, SearchParkingComponent, AdminHomeComponent],
  imports: [
    BrowserModule,
    AdminHomeModule,
    BrowserAnimationsModule,
    LoggerModule.forRoot({ level: NgxLoggerLevel.INFO })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
