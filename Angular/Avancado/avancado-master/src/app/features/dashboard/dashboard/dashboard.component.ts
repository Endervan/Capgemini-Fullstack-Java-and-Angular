import { Component } from '@angular/core';

import { UserContextService } from 'src/app/shared/services/user-context.service';

@Component({
  selector: 'jv-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss'],
})
export class DashboardComponent {

  constructor(public userContext: UserContextService) {
  }
}
