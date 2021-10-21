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
    name: ' Angular',
    description: 'curso angular basico com components,',
    imgUrl: '/assets/images/01.png',
    price: 50,
    code: 'xsp-401',
    duration: 120,
    rating: 5.4,
    releaseDate: '12, 10 2021'
  }, {
    id: 2,
    name: ' Java',
    description: 'curso Java   com arrays,',
    imgUrl: '/assets/images/02.png',
    price: 100,
    code: 'xsp-500',
    duration: 50,
    rating: 4.1,
    releaseDate: '01, 22 2021'
  }, {
    id: 3,
    name: ' Ionic',
    description: 'curso Ionic  android, Native',
    imgUrl: '/assets/images/03.png',
    price: 100,
    code: 'xsp-500',
    duration: 110,
    rating: 1.5,
    releaseDate: '06, 22 2021'
  },
]


