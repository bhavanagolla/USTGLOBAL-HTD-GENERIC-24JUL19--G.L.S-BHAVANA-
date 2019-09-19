import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { RecipesComponent } from './recipes/recipes.component';
import { NewsComponent } from './news/news.component';
import { CarsComponent } from './cars/cars.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { PageNotFoundComponent} from './page-not-found/page-not-found.component';
import { HeaderComponent } from './header/header.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { RecipeDetailsComponent } from './recipe-details/recipe-details.component';
import { NewsDetailsComponent } from './news-details/news-details.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';

@NgModule({
      declarations: [
        AppComponent,
        HeaderComponent,
        HomeComponent,
        NewsComponent,
        CarsComponent,
        MobilesComponent,
        RecipesComponent,
        PageNotFoundComponent,
        CarDetailsComponent,
        RecipeDetailsComponent,
        NewsDetailsComponent,
        MobileDetailsComponent

        
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path:'',component:HomeComponent },
      { path:'header',component:HeaderComponent }, 
      { path:'cars',component:CarsComponent },
      { path:'recipes',component:RecipesComponent },
      { path:'news',component:NewsComponent },
      { path:'mobiles',component:MobilesComponent },
      { path: "**",component:PageNotFoundComponent }
    ])
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
