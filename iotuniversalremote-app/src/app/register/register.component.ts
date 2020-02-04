import { Component, OnInit } from '@angular/core';
import {ApiService} from '../shared/api.services';
import {Router} from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  model: RegisterViewModel = {
    username: '',
    password: '',
    confirmPassword: ''
  };
  constructor(private  apiService: ApiService, private router: Router) { }

  ngOnInit() {
  }

  register(): void {
    this.apiService.postRegister(this.model).subscribe(
      res => {
        this.router.navigate(['login']);
      },
      err => {
        alert('An error has occurred while register user');
      }
    );
  }
}

export interface RegisterViewModel {
  username: string;
  password: string;
  confirmPassword: string;
}
