import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-b',
  templateUrl: './b.component.html',
  styleUrls: ['./b.component.css']
})
export class BComponent implements OnInit {
public b:string="abc";
  constructor() { }

  ngOnInit() {
  }
public b1(){
  this.b="new value";
}
}
