import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  public name:string;
  public age:string;
  public email:string;
  public registerStatus:string;

  public Register(){
    
    
      this.registerStatus="Registration Successful";
    
  }
}
