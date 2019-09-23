import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';


import { AppComponent } from './app.component';
import { CarsComponent } from './cars/cars.component';
import { HeaderComponent } from './header/header.component';
import { CardetailsComponent } from './cardetails/cardetails.component';
import { HomeComponent } from './home/home.component';


@NgModule({
      declarations: [
        AppComponent,
        HeaderComponent,
        CarsComponent,
        CardetailsComponent,
        HomeComponent,
 ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path:'',component:HomeComponent},
       { path:'header',component:HeaderComponent }, 
      { path:'cars',component:CarsComponent },
    ])
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
