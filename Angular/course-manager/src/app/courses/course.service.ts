import {Injectable} from "@angular/core";
import {Course} from "./course";

@Injectable({
  providedIn: 'root'
})
export class CourseService {


  retrieveAll(): Course[] {
    return COURSES;
  }

}

var COURSES: Course[] = [
  {
    id: 1,
    name: 'teste angular',
    description: 'curso angular basico com directives,',
    imgUrl: '/assets/images/01.png',
    price: 50,
    code: 'xsp-401',
    duration: 120,
    rating: 5.4,
    releaseDate: 'dezembro, 10 2021'
  }, {
    id: 2,
    name: 'teste java',
    description: 'curso Java destinado a  basico com arrays,',
    imgUrl: '/assets/images/02.png',
    price: 100,
    code: 'xsp-500',
    duration: 50,
    rating: 4.1,
    releaseDate: 'janeiro, 22 2021'
  },
]


