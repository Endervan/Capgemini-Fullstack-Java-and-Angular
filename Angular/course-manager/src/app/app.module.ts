import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {RouterModule} from "@angular/router";
import {HttpClientModule} from "@angular/common/http";
import {CourseModule} from "./courses/course.module";
import {CoreModule} from "./core/component/core.module";

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    CourseModule,
    CoreModule,
    RouterModule.forRoot([
      {
        path: '', redirectTo: 'courses', pathMatch: 'full'
      }
    ]),// pacote rotas
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
