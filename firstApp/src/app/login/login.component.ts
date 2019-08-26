import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  public un:string;
  public pwd:string;
  public buttonDisabled:boolean=false;
  public loginStatus:string;

  public Login(pStatus:any ,pImageStatus:any){
    // pStatus.disabled=true;
    if(this.un == "u" && this.pwd =="p"){
      this.buttonDisabled=true;
      this.loginStatus="Login Succesfull";
      // pStatus.style="color:blue";
      pImageStatus.src="/assets/sushma.jpg"
      
    }
    else{
      this.loginStatus="Login Failed";
      pStatus.style="color:red";
    }
  }

}
