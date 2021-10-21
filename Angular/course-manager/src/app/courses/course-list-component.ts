import {Component, OnInit} from "@angular/core";
import {Course} from "./course";

@Component({
  selector: 'app-course-list',
  templateUrl: 'course-list-component.html'
})
export class CourseListComponent implements OnInit {

  courses: Course[] = []

  ngOnInit(): void {
    this.courses = [
      {
        id: 1,
        name: 'teste angular',
        imgUrl: '',
        price: 50,
        code: 'xsp-401',
        duration: 120,
        rating: 5.4,
        releaseDate:'dezembro, 10 2021'
      }, {
        id: 2,
        name: 'teste java',
        imgUrl: '',
        price: 100,
        code: 'xsp-500',
        duration: 50,
        rating: 4.1,
        releaseDate:'janeiro, 22 2021'
      },
    ]

  }


}
