import { Component } from "@angular/core";
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/shared/services/login.service';
import { UserContextService } from 'src/app/shared/services/user-context.service';

@Component({
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent {

  form = new FormGroup({
    name: new FormControl(''),
    email: new FormControl(''),
  });

  constructor(private router: Router,
              private loginService: LoginService,
              private userContext: UserContextService) {
  }

  login() {
    this.loginService.login(this.form.value.name, this.form.value.email)
      .subscribe(user => {
        this.userContext.user = user;
        this.router.navigate(['d']);
      });
  }
}
