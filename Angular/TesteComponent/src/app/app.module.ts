import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FilhoComponentComponent } from './filho-component/filho-component.component';
import { PaiComponentComponent } from './pai-component/pai-component.component';

@NgModule({
  declarations: [
    AppComponent,
    FilhoComponentComponent,
    PaiComponentComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
