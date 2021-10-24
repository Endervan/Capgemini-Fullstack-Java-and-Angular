import {Component, Input} from '@angular/core';
import {ValidarCamposService} from '../validar-campos.service';
import {AbstractControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-input-textarea',
  templateUrl: './input-textarea.component.html',
  styleUrls: ['./input-textarea.component.scss']
})
export class InputTextareaComponent {

  @Input() descricao: string;
  @Input() formGroup: FormGroup;
  @Input() controlName: string;

  constructor(public validacao: ValidarCamposService) {
  }

  get formControl(): AbstractControl {
    return this.formGroup.controls[this.controlName];
  }
}
