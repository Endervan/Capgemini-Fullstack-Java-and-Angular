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

  // lista todos filme usando tambem pesquisar de acordo documentação desse backend
  // ex:_page,_limit,_sort(id'),_order(desc),q(texto),genero(genero)
  Listar(pagina: number, qtdPagina: number, texto: string, genero: string): Observable<Filme[]> {
    let httpParams = new HttpParams();
    httpParams = httpParams.set('_page', pagina.toString());
    httpParams = httpParams.set('_limit', qtdPagina.toString());
    httpParams = httpParams.set('_sort', 'id');
    httpParams = httpParams.set('_order', 'desc'); // faz exibição ordem desc com requisito usa _sort(id)
    if (texto) {
      httpParams = httpParams.set('q', texto);
    }
    if (genero) {
      httpParams = httpParams.set('genero', genero);
    }
    // back aceita == http://localhost:3000/filmes/?_page=1&_limit=1 para fazer [scrool infinite]
    return this.httpClient.get<Filme[]>(url, {params: httpParams});
  }


}
