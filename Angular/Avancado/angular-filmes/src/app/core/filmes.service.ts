import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Filme} from '../shared/models/filme';


const url = 'http://localhost:3000/filmes/';

@Injectable({
  providedIn: 'root'
})



export class FilmesService {

  constructor(private httpClient: HttpClient) {
  }

  salvar(filme: Filme): Observable<Filme> {
    return this.httpClient.post<any>(url, filme);
  }
}
