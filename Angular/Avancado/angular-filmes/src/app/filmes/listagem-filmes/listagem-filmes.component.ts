import {Component, OnInit} from '@angular/core';
import {FilmesService} from '../../core/filmes.service';
import {Filme} from '../../shared/models/filme';

@Component({
  selector: 'app-dio-listagem-filmes',
  templateUrl: './listagem-filmes.component.html',
  styleUrls: ['./listagem-filmes.component.scss']
})
export class ListagemFilmesComponent implements OnInit {

  filmes: Filme[];

  constructor(private filmesService: FilmesService) {
  }

  ngOnInit() {
    this.filmesService.Listar().subscribe((filmes: Filme[]) => this.filmes = filmes);
  }


}
