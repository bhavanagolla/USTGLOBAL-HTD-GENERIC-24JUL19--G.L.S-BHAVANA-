import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { UsersComponent } from './users/users.component';
import { TaskmanagerComponent } from './taskmanager/taskmanager.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    UsersComponent,
    TaskmanagerComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      { path:'',component:HomeComponent },
       { path:'header',component:HeaderComponent }, 
      { path:'users',component:UsersComponent },
      { path: 'Taskmanager',component:TaskmanagerComponent}
    
    
    ])
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
