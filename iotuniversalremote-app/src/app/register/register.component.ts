import { Component, OnInit } from '@angular/core';
import {ApiService} from '../shared/api.services';
import {LoginViewModel} from '../login/login.component';

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
  constructor(private  apiService: ApiService) { }

  ngOnInit() {
  }

  register(): void {
    this.apiService.postRegister(this.model).subscribe(
      res => {
        location.reload();
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
