import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { LoginComponent } from './features/login/login/login.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  {
    path: 'd',
    loadChildren: () => import('src/app/features/dashboard/dashboard.module').then(m => m.DashboardModule),
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {
}
