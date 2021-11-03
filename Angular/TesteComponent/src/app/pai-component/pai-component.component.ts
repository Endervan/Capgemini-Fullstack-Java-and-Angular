import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-pai-component',
  templateUrl: './pai-component.component.html',
  styleUrls: ['./pai-component.component.css']
})
export class PaiComponentComponent implements OnInit {

  grana: number;

  constructor() {
    this.grana = 50.00;
  }

  ngOnInit(): void {
  }

}
