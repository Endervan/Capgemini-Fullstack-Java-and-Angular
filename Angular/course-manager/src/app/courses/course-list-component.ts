import {Component, OnInit} from "@angular/core";
import {Course} from "./course";
import {CourseService} from "./course.service";

@Component({
  // selector: 'app-course-list',
  templateUrl: 'course-list-component.html'
})
export class CourseListComponent implements OnInit {
  filterCourses: Course[] = [];

  _courses: Course[] = [];
  _filterBy: string;

  constructor(private courseService: CourseService) {
  }

  // saida ngModel
  get filter() {
    return this._filterBy;
  }

  // entrada ngModel
  set filter(value: string) {
    this._filterBy = value;
    // magica filtro
    this.filterCourses = this._courses.filter((course: Course) => course.name.toLocaleLowerCase().indexOf(this._filterBy.toLocaleLowerCase()) > -1);
  }

  ngOnInit(): void {
    this.retrieveAll();
  }

  retrieveAll(): void {
    this.courseService.retrieveAll().subscribe({
      next: courses => {
        this._courses = courses;
        this.filterCourses = this._courses;
      }, error: err => console.log('Erro back ==> ', err)
    })
  }

  deleteById(courseById:number):void{
    this.courseService.deleteById(courseById).subscribe({
      next: () => {
       console.log('Course deletado com sucesso');
       this.retrieveAll();// atualizar lista novamente dps do delete
      }, error: err => console.log('Erro ao deleta Back ==> ', err)
    })
  }

}
