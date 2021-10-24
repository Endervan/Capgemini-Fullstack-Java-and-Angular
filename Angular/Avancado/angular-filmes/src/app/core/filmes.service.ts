import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Filme} from '../shared/models/filme';


const url = 'http://localhost:3000/filmes/';

@Injectable({
  providedIn: 'root'
})


export class FilmesService {

  constructor(private httpClient: HttpClient) {
  }

  // salvando filme
  salvar(filme: Filme): Observable<Filme> {
    return this.httpClient.post<any>(url, filme);
  }

  Listar(pagina: number, qtdPagina: number): Observable<Filme[]> {
    let httpParams = new HttpParams();
    httpParams = httpParams.set('_page', pagina.toString());
    httpParams = httpParams.set('_limit', qtdPagina.toString());
    // back aceita == http://localhost:3000/filmes/?_page=1&_limit=1 para fazer [scrool infinite]
    return this.httpClient.get<Filme[]>(url, {params: httpParams});
  }
}
