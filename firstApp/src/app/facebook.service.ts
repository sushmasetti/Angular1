import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FacebookService {

  constructor() { 
    // this._fbPostsObj.insertPosts;
  }

  private _fbPostsObj:fbPosts=new fbPosts();
  GetAllPosts(pUser:string){
    var allPosts:fbPosts[] = this._fbPostsObj.getAllPosts();
    var _userPosts=[];
    allPosts.forEach(item =>{
      if(item.username == pUser){
                  _userPosts.push(item);
      }
    });
    return _userPosts;
  }

  GetAdDuration(pPostTitle:string,pUser:string){

  }
}

class fbPosts{
  username:string;
  postTitle:string;
  postDescription:string;

  private _posts:fbPosts[]=[];
  

  // insertPosts(){
    getAllPosts():fbPosts[]{
      if(this._posts.length==0){
    var _post1=new fbPosts();
    _post1.username="sushma";
    _post1.postTitle="First Post";
    _post1.postDescription="It is First Post";

    var _post2=new fbPosts();
    _post2.username="hari";
    _post2.postTitle="Second Post";
    _post2.postDescription="It is Second Post";

    this._posts.push(_post1);
    this._posts.push(_post2);
      }
    return this._posts;
   

  }
  // getAllPosts(){
  //   return this._posts;
  // }
}

class fbAds{
  postTitle:string;
  AdCost:number;
  AdDuration:number;
}