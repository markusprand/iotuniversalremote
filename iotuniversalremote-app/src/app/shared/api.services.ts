import {Injectable} from '@angular/core';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {Observable, observable} from 'rxjs';
import {LoginViewModel} from '../login/login.component';
import {RegisterViewModel} from '../register/register.component';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private BASE_URL = 'http://localhost:8080' + '/api';
  private SEND_LOGIN_URL = `${this.BASE_URL}/login`;
  private SEND_REGISTER_URL = `${this.BASE_URL}/register`;

  constructor(private http: HttpClient) {

  }

  postLogin(loginData: LoginViewModel): Observable<any> {
    return this.http.post(this.SEND_LOGIN_URL, loginData);
  }

  postRegister(registerData: RegisterViewModel): Observable<any> {
    return this.http.post(this.SEND_REGISTER_URL, registerData);
  }
/*
  postAddWidgetButtonOnOff(registerData: RegisterViewModel): Observable<any> {
    return this.http.post(this.SEND_REGISTER_URL, registerData);
  }*/
}
