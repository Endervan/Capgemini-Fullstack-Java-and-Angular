import {NgModule} from "@angular/core";
import {NavBarComponent} from "./nav-bar/nav-bar-component";
import {RouterModule} from "@angular/router";
import {Erro404Component} from "./error-404/erro404.component";


@NgModule({
  declarations: [
    NavBarComponent,
    Erro404Component
  ],imports:[
    RouterModule.forRoot([
      {
        path: '**', component: Erro404Component
      },
    ])
  ], exports: [
    NavBarComponent
  ]
})
export class CoreModule {

}
