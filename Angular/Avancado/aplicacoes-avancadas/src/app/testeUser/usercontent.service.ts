import {Injectable} from '@angular/core';
@Injectable({
  providedIn: 'root'
})
export class UsercontentService {
  private _user: User;

  get user(): User {
    return this._user;
  }
  set user(value: User) {
    this._user = value;
  }

  login(){

  }
}

export class User {
  name: string;
  email: string;
}


