import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {FormsModule} from "@angular/forms";
import {NavBarComponent} from "./nav-bar/nav-bar-component";
import {RouterModule} from "@angular/router";
import {Erro404Component} from "./error-404/erro404.component";
import {HttpClientModule} from "@angular/common/http";
import {CourseModule} from "./courses/course.module";

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    Erro404Component,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    CourseModule,
    RouterModule.forRoot([
      {
        path: '', redirectTo: 'courses', pathMatch: 'full'
      }, {
        path: '**', component: Erro404Component
      },
    ]),// pacote rotas
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
