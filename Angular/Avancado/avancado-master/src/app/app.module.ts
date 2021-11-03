import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginModule } from './features/login/login.module';
import { PaiComponentComponent } from './testeComponent/pai-component/pai-component.component';
import { FilhoComponentComponent } from './testeComponent/filho-component/filho-component.component';

@NgModule({
  imports: [
    BrowserModule,
    AppRoutingModule,
    LoginModule,
  ],
  declarations: [
    AppComponent,
    PaiComponentComponent,
    FilhoComponentComponent,
  ],
  providers: [],
  bootstrap: [AppComponent],
  exports: [
    FilhoComponentComponent,
    PaiComponentComponent
  ]
})
export class AppModule {
}
