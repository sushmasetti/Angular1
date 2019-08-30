import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

// import { url } from 'inspector';

@Component({
  selector: 'app-http-promise',
  templateUrl: './http-promise.component.html',
  styleUrls: ['./http-promise.component.css']
})
export class HttpPromiseComponent  {
  public myProperty:Object;
  constructor(public http:HttpClient) { }

  getCall() {
    //syntax to connect to Rest API's
    // this.http.get(url,Headers)
    //           .toPromise()
    //           .then(()=>{}, ()=>{})
    //           .catch(()=>{})
    //           .finally(()=>{})


    this.http.get("http://jsonplaceholder.typicode.com/posts")
    // this.http.get("http://172.20.4.100:8075/rest/employees/1")
              .toPromise()
              .then(
                // (data)=>{console.log(data);},   
                (data)=>{this.myProperty=data;},    //onsuccess
                (error)=>{console.error(error);}  //onfailure
              )
              .catch((err)=>{console.log("In catch block :");      //onerror
                              console.error(err);
                            }
                    )     
               .finally(()=>{console.log("In finally block");});
  }

}
