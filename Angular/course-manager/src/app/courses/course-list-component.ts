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

  ngOnInit(): void {
    this._courses = this.courseService.retrieveAll()
    this.filterCourses = this._courses;
  }

  // entrada ngModel
  set filter(value: string) {
    this._filterBy = value;
    // magica filtro
    this.filterCourses = this._courses.filter((course: Course) => course.name.toLocaleLowerCase().indexOf(this._filterBy.toLocaleLowerCase()) > -1);
  }

  // saida ngModel
  get filter() {
    return this._filterBy;
  }

}
