import { NgModule } from "@angular/core";
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';

import { LoginComponent } from './login/login.component';
import {AppModule} from '../../app.module';

@NgModule({
    imports: [
        CommonModule,
        ReactiveFormsModule,
        AppModule,
    ],
  declarations: [
    LoginComponent,
  ],
})
export class LoginModule {
}
