import {Injectable} from '@angular/core';
import {AbstractControl} from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class ValidarCamposService {

  constructor() {
  }

  hasErrorValidate(control: AbstractControl, errName: string){
    if ((control.touched || control.dirty) && this.hasError(control,errName)){
      return true;
    }
    return  false;
  }

  // tratamento error personalizados
  hasError(control: AbstractControl, errName: string): boolean {
    return control.hasError(errName);
  }
}
