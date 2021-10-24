import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material';

@Component({
  selector: 'app-alerta',
  templateUrl: './alerta.component.html',
  styleUrls: ['./alerta.component.scss']
})
export class AlertaComponent implements OnInit {
  titulo = 'Sucesso';
  descricao = 'Registro Salvo com Sucesso';
  btnSucesso = 'OK';
  btnCancelar = 'Cancelar';
  corBnt = 'primary';
  possuirBtnFechar = false;

  constructor(public dialogRef: MatDialogRef<AlertaComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any) {
  }

  ngOnInit(): void {
    if (this.data){
      this.titulo = this.data.titulo || this.titulo;
      this.descricao = this.data.descricao || this.descricao;
      this.btnSucesso = this.data.btnSucesso || this.btnSucesso;
      this.btnCancelar = this.data.btnCancelar || this.btnCancelar;
      this.corBnt = this.data.corBnt || this.corBnt;
      this.possuirBtnFechar = this.data.possuirBtnFechar || this.possuirBtnFechar;
    }
  }

}
