import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'jv-pai-component',
  templateUrl: './pai-component.component.html',
  styleUrls: ['./pai-component.component.scss']
})
export class PaiComponentComponent implements OnInit {

  money: number;

  constructor() {
    this.money = 50.00;
  }

  ngOnInit(): void {
  }

}
