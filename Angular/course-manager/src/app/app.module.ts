import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {FormsModule} from "@angular/forms";
import {CourseListComponent} from "./courses/course-list-component";
import {StarComponent} from "./star/star-component";

@NgModule({
  declarations: [
    AppComponent,
    CourseListComponent,
    StarComponent
  ],
    imports: [
        BrowserModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
