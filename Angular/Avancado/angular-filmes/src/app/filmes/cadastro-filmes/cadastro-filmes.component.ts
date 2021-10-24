import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {MatDialog} from '@angular/material';

import {ValidarCamposService} from '../../shared/components/campos/validar-campos.service';
import {Filme} from '../../shared/models/filme';
import {FilmesService} from '../../core/filmes.service';
import {AlertaComponent} from '../../shared/components/campos/alerta/alerta.component';
import {Alerta} from '../../shared/models/alerta';

@Component({
  selector: 'app-cadastro-filmes',
  templateUrl: './cadastro-filmes.component.html',
  styleUrls: ['./cadastro-filmes.component.scss']
})
export class CadastroFilmesComponent implements OnInit {

  cadastro: FormGroup;
  generos: Array<string>;

  constructor(public validacao: ValidarCamposService,
              public dialog: MatDialog,
              private fb: FormBuilder,
              private filmesService: FilmesService,
              private router: Router) {
  }

  // retorna todos campos
  get f() {
    return this.cadastro.controls;
  }

  ngOnInit() {
    this.cadastro = this.fb.group({
      titulo: ['', [Validators.required, Validators.minLength(2), Validators.maxLength(256)]],
      urlFoto: ['', [Validators.minLength(10)]],
      dtLacamento: ['', [Validators.required]],
      descricao: [''],
      nota: [0, [Validators.required, Validators.min(0), Validators.max(10)]],
      urlIMDb: ['', [Validators.minLength(10)]],
      genero: ['', [Validators.required]],
    });

    // populando selects
    this.generos = ['Ação', 'Aventura', 'Ficção Científica', 'Romance', 'Terror', 'Comédia', 'Drama'];

  }

  // salvado filme
  submit(): void {
    this.cadastro.markAllAsTouched();
    if (this.cadastro.invalid) {
      return;
    }
    // getRawValue() as filmes=> garantir retorna campos formGroup do cadastro
    const filme = this.cadastro.getRawValue() as Filme;
    this.salvar(filme);
    // alert(JSON.stringify(this.cadastro.value, null, 4));
  }

  reiniciarForm(): void {
    this.cadastro.reset();
  }

  private salvar(filme: Filme): void {
    this.filmesService.salvar(filme).subscribe(() => {
      const config = {
        data: {
          btnSucesso: 'Ir para Listagem',
          btnCancelar: 'Cadastra Novo Filme',
          corBntCancelar: 'primary',
          possuirBtnFechar: true
        } as Alerta
      };
      const dialogRef = this.dialog.open(AlertaComponent, config);

      // acoes depis que fecha modal
      dialogRef.afterClosed().subscribe((opcao: boolean) => {
        if (opcao) {
          this.router.navigateByUrl('filmes');
        } else {
          // limpa formulario atual
          this.reiniciarForm();
        }
      });


    }, () => {
      const config = {
        data: {
          titulo: 'Erro ao salva o registro ',
          descricao: 'Não Conseguimos Salva seu registro! Favor Tenta Novamente Mais Tarde',
          corBntSucesso: 'wan',
          btnSucesso: 'Fechar',
        } as Alerta
      };
      this.dialog.open(AlertaComponent, config);

    });
  }

}
