import { Component, OnInit } from '@angular/core';
import {ApiService} from '../shared/api.services';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  model: LoginViewModel = {
    username: '',
    password: ''
  };

  constructor(private  apiService: ApiService) {

  }

  ngOnInit() {
  }

  login(): void {
    this.apiService.postLogin(this.model).subscribe(
      res => {
        location.reload();
      },
      err => {
        alert('An error has occurred while login');
      }
    );
  }
}

export interface LoginViewModel {
  username: string;
  password: string;
}
