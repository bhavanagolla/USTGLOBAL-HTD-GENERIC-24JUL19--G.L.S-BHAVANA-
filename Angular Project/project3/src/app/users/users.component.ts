import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor(private firebaseService: FirebaseService,
    private router: Router) { }
  updateUser(user) {
    this.firebaseService.selectedUser = user;
    this.router.navigateByUrl('/firebase');
    }
    deleteUser(user) {
      this.firebaseService.deleteUser(user).subscribe(resData =>{
        console.log(resData);
        this.firebaseService.getData();
      }, err=>{
        console.log(err);
      
      })
    }

  ngOnInit() {
    this.firebaseService.getData();
    console.log(this.firebaseService.users);
    
  }

}
