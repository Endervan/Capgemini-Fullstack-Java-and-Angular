import {Component, OnInit} from "@angular/core";
import {ActivatedRoute} from "@angular/router";
import {Course} from "./course";
import {CourseService} from "./course.service";
import {log} from "util";


@Component({
  templateUrl: './course-info.component.html'
})
export class CourseInfoComponent implements OnInit {

  course: Course;

  constructor(private activedRoute: ActivatedRoute, private courseService: CourseService) {
  }

  ngOnInit(): void {
    // qnd retorno for string  coloca ==(+)== retorna number
    this.courseService.retrieveById(+this.activedRoute.snapshot.paramMap.get('id')).subscribe({
      next: course => this.course = course,
      error: err => console.log('Error back =>', err)
    });
  }

  save(): void {
    this.courseService.save(this.course).subscribe({
      next:course=>console.log('salvo com sucesso ',course),
      error: err => console.log('Error back =>', err)
    });
  }

}
