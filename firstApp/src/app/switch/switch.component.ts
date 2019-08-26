import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-switch',
  templateUrl: './switch.component.html',
  styleUrls: ['./switch.component.css']
})
export class SwitchComponent implements OnInit {

  public operations:string[]=["+","-","*","/"];
  public currentOperator:string="+";

  //for input numbers
  public n1:number=100;
  public n2:number=200;
  constructor() { }

  ngOnInit() {
  }

}
