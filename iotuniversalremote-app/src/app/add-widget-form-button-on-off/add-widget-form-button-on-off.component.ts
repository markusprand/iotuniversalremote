import { Component, OnInit } from '@angular/core';
import {MatDialog} from '@angular/material';
import { MatInputModule} from '@angular/material/input';
import {Router} from '@angular/router';
import {ApiService} from '../shared/api.services';

@Component({
  selector: 'app-add-widget-form-button-on-off',
  templateUrl: './add-widget-form-button-on-off.component.html',
  styleUrls: ['./add-widget-form-button-on-off.component.css']
})
export class AddWidgetFormButtonOnOffComponent implements OnInit {
  model: AddWidgetFormButtonOnOffViewModel = {
    label: '',
    gateway: '',
    function: ''
  };
  gateway: Gateway[] = [
    {value: 'gateway-0', viewValue: 'Philips Hui'},
    {value: 'gateway-1', viewValue: 'Bluetooth'},
    {value: 'gateway-2', viewValue: 'Digital Contact'}
  ];
  function: SelectedFunction[] = [
    {value: 'function-0', viewValue: 'Lampe Badezimmer EIN'},
    {value: 'function-1', viewValue: 'Lampe Badezimmer AUS'},
    {value: 'function-2', viewValue: 'Toggle Steckdose Wohnzimmer'}
  ];

  constructor(private  apiService: ApiService, private router: Router) { }

  ngOnInit() {
    }

  addWidget(): void {
    this.router.navigate(['dashboard']);
    /*this.apiService.postRegister(this.model).subscribe(
      res => {
        this.router.navigate(['login']);
      },
      err => {
        alert('An error has occurred while register user');
      }
    );*/
  }

}
export interface AddWidgetFormButtonOnOffViewModel {
  label: string;
  gateway: string;
  function: string;
}

export interface Gateway {
  value: string;
  viewValue: string;
}

export interface SelectedFunction {
  value: string;
  viewValue: string;
}
