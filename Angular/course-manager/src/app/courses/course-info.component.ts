import {Component, OnInit} from "@angular/core";
import {ActivatedRoute} from "@angular/router";


@Component({
  templateUrl: './course-info.component.html'
})
export class CourseInfoComponent implements OnInit {

  courseId: number;

  constructor(private activedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    // qnd retorno for string  coloca ==(+)== retorna number
    this.courseId = +this.activedRoute.snapshot.paramMap.get('id');
  }

}
