import { Injectable } from "@angular/core";

import { Observable, of } from 'rxjs';
import { delay } from 'rxjs/operators';

import { User } from '../models/user.model';

@Injectable({ providedIn: 'root' })
export class LoginService {

  login(name: string, email: string): Observable<User> {
    return of({ name, email })
      .pipe(delay(2000));
  }
}
