import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InputTextComponent } from './input-text/input-text.component';
import { InputNumberComponent } from './input-number/input-number.component';
import { InputTextareaComponent } from './input-textarea/input-textarea.component';
import { InputSelectComponent } from './input-select/input-select.component';
import { InputDateComponent } from './input-date/input-date.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MaterialModule} from '../../material/material.module';
import { AlertaComponent } from './alerta/alerta.component';



@NgModule({
  declarations: [
    InputTextComponent,
    InputNumberComponent,
    InputTextareaComponent,
    InputSelectComponent,
    InputDateComponent,
    AlertaComponent
  ],
  imports: [
    CommonModule,
    MaterialModule,
    ReactiveFormsModule,
    FormsModule
  ],
  exports: [
    InputTextComponent,
    InputNumberComponent,
    InputTextareaComponent,
    InputSelectComponent,
    InputDateComponent
  ],
})
export class CamposModule { }
