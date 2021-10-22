import {Injectable} from "@angular/core";
import {Course} from "./course";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  //base endpoint
  private courseUrl: string = 'http://localhost:3100/api/courses';

  constructor(private httpClient: HttpClient) {
  }

  // mostra lista toda
  retrieveAll(): Observable<Course[]> {
    return this.httpClient.get<Course[]>(this.courseUrl,);
  }

  // mostra detalhe de cada item
  retrieveById(id: number): Observable<Course> {
    return this.httpClient.get<Course>(`${this.courseUrl}/${id}`);

  }

  // salvando dados item
  save(course: Course): Observable<Course> {
    if (course.id) {
      // atualizar
      return this.httpClient.put<Course>(`${this.courseUrl}/${course.id}`, course);
    } else {
      // criar
      return this.httpClient.post<Course>(`${this.courseUrl}`, course);
    }
  }

  // mostra detalhe de cada item
  deleteById(id: number): Observable<any> {
    return this.httpClient.delete<any>(`${this.courseUrl}/${id}`);

  }


}

var COURSES: Course[] = [
  {
    id: 1,
    name: ' Angular',
    description: 'curso angular basico com components,',
    imageUrl: '/assets/images/01.png',
    price: 50,
    code: 'xsp-401',
    duration: 120,
    rating: 5.4,
    releaseDate: '12, 10 2021'
  }, {
    id: 2,
    name: ' Java',
    description: 'curso Java   com arrays,',
    imageUrl: '/assets/images/02.png',
    price: 100,
    code: 'xsp-500',
    duration: 50,
    rating: 4.1,
    releaseDate: '01, 22 2021'
  }, {
    id: 3,
    name: ' Ionic',
    description: 'curso Ionic  android, Native',
    imageUrl: '/assets/images/03.png',
    price: 100,
    code: 'xsp-500',
    duration: 110,
    rating: 1.5,
    releaseDate: '06, 22 2021'
  },
]


