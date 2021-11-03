import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';

import { DashboardComponent } from './dashboard/dashboard.component';
import { LastTodosComponent } from './last-todos/last-todos.component';
import { CreateTodoComponent } from './create-todo/create-todo.component';
import { ListComponent } from './list/list.component';
import { ListService } from './services/list.service';

@NgModule({
  imports: [
    CommonModule,
    ReactiveFormsModule,
    RouterModule.forChild([
      {
        path: '',
        component: DashboardComponent,
      },
      {
        path: 'list',
        component: ListComponent,
      },
    ]),
  ],
  declarations: [
    DashboardComponent,
    LastTodosComponent,
    CreateTodoComponent,
    ListComponent,
  ],
  providers: [
    ListService,
  ],
})
export class DashboardModule {
}
