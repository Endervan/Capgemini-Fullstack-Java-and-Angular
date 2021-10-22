import {NgModule} from "@angular/core";
import {CourseListComponent} from "./course-list-component";
import {CourseInfoComponent} from "./course-info.component";
import {RouterModule} from "@angular/router";
import {Erro404Component} from "../error-404/erro404.component";
import {FormsModule} from "@angular/forms";
import {StarComponent} from "../star/star-component";
import {ReplacePipe} from "../pipe/replace.pipe";
import {AppComponent} from "../app.component";
import {CommonModule} from "@angular/common";

@NgModule({
  declarations: [
    CourseListComponent,
    CourseInfoComponent,
    StarComponent,
    ReplacePipe,
  ],
  imports: [
    CommonModule,
    FormsModule,
    RouterModule.forRoot([
      {
        path: 'courses', component: CourseListComponent
      },
      {
        path: 'courses/info/:id', component: CourseInfoComponent
      },
    ]),

// pacote rotas
  ]


})
export class CourseModule {

}
