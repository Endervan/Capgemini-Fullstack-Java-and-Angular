import {Injectable} from '@angular/core';
import {AbstractControl} from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class ValidarCamposService {

  constructor() {
  }

  // trata erros gerais
  hasErrorValidate(control: AbstractControl, errName: string) {
    if ((control.touched || control.dirty) && this.hasError(control, errName)) {
      return true;
    }
    return false;
  }

  // tratamento error personalizados
  hasError(control: AbstractControl, errName: string): boolean {
    return control.hasError(errName);
  }

  // tratamento error personalizados
  lenghtValidar(control: AbstractControl, errName: string): number {
    const error = control.errors[errName];
    return error.requiredLenght || error.min || error.max || 0;

  }
}
