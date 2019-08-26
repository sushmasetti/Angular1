import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-built-in-pipes',
  templateUrl: './built-in-pipes.component.html',
  styleUrls: ['./built-in-pipes.component.css']
})
export class BuiltInPipesComponent implements OnInit {
  title:string="Pipes"
public person:Person;
  constructor() { }

  ngOnInit() {
    this.person=new Person();
    this.person.name="sushma";
    this.person.age=21;
    this.person.aadhar="ASDJ24578SDFH"
  }

}
class Person{
  name:string;
  age:number;
  aadhar:string;
}