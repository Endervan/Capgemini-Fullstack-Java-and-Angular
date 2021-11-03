import { Injectable } from "@angular/core";

import { BehaviorSubject, Observable } from 'rxjs';

import { Todo } from 'src/app/shared/models/todo.model';
import { TodosService } from 'src/app/shared/services/todos.service';

@Injectable()
export class ListService {

  page = 0;
  private listSubject = new BehaviorSubject<Todo[]>([]);

  constructor(private todosService: TodosService) {
  }

  get list$(): Observable<Todo[]> {
    return this.listSubject.asObservable();
  }

  set list(value: Todo[]) {
    this.listSubject.next(value);
  }

  create(title: string) {
    this.todosService.create({ title })
      .subscribe(todo => this.list = [todo, ...this.listSubject.value]);
  }

  getList(page: number) {
    this.todosService.getList(page)
      .subscribe(list => {
        if (page === 0) {
          this.list = list;
        } else {
          this.list = [...this.listSubject.value, ...list];
        }
      });
  }

  toggleDone(id: number) {
    this.todosService.toggleDone(id)
      .subscribe(todo =>
        this.list = this.listSubject.value
          .map(item => item.id === todo.id ? todo : item),
      );
  }

  remove(id: number) {
    this.todosService.remove(id)
      .subscribe(() =>
        this.list = this.listSubject.value.filter(item => item.id !== id),
      );
  }
}
