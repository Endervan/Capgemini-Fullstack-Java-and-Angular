import { Component, OnInit } from '@angular/core';

import { Todo } from '../../../shared/models/todo.model';
import { ListService } from '../services/list.service';

@Component({
  selector: 'jv-last-todos',
  templateUrl: './last-todos.component.html',
  styleUrls: ['./last-todos.component.scss']
})
export class LastTodosComponent implements OnInit {

  list: Todo[];

  constructor(private listService: ListService) {
  }

  ngOnInit() {
    this.listService.getList(0);

    this.listService.list$
      .subscribe(list => this.list = list.slice(0, 10));
  }

  markAsDone(id: number) {
    this.listService.toggleDone(id);
  }
}
