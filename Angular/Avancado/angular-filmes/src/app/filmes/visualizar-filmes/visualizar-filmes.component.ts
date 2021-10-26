import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {FilmesService} from '../../core/filmes.service';
import {Filme} from '../../shared/models/filme';

@Component({
  selector: 'app-visualizar-filmes',
  templateUrl: './visualizar-filmes.component.html',
  styleUrls: ['./visualizar-filmes.component.scss']
})
export class VisualizarFilmesComponent implements OnInit {
  // foto padrao caso nao exista
  readonly semFoto = 'https://www.termoparts.com.br/wp-content/uploads/2017/10/no-image.jpg';

  filme: Filme;

  constructor(private activedRouter: ActivatedRoute, private filmesService: FilmesService, public router: Router) {
  }

  ngOnInit() {
    this.visualizar(this.activedRouter.snapshot.params['id']);
  }

  private visualizar(id: number): void {
    this.filmesService.visualizar(id).subscribe((filme: Filme) => this.filme = filme);
  }

}
