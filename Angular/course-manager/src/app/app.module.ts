import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {FormsModule} from "@angular/forms";
import {CourseListComponent} from "./courses/course-list-component";
import {StarComponent} from "./star/star-component";
import {ReplacePipe} from "./pipe/replace.pipe";
import {NavBarComponent} from "./nav-bar/nav-bar-component";
import {RouterModule} from "@angular/router";
import {Erro404Component} from "./error-404/erro404.component";
import {CourseInfoComponent} from "./courses/course-info.component";

@NgModule({
  declarations: [
    AppComponent,
    CourseListComponent,
    StarComponent,
    ReplacePipe,
    NavBarComponent,
    Erro404Component,
    CourseInfoComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {
        path: 'courses',component:CourseListComponent
      },
      {
        path: 'courses/info/:id',component:CourseInfoComponent
      },
      {
        path: '', redirectTo: 'courses', pathMatch: 'full'
      },{
        path: '**',component:Erro404Component
      },
    ]),// pacote rotas
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
