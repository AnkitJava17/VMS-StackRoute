// import { Component, OnInit } from '@angular/core';

// declare function page(): void;

// @Component({
//   selector: 'app-login',
//   templateUrl: './login.component.html',
//   styleUrls: ['./login.component.css']
// })
// export class LoginComponent implements OnInit {

//   constructor() { }

//   ngOnInit(): void {
//     this.page();
//   }

//   page(): void {
//     if (typeof page === 'function') {
//       page();
//     }
//   }

// }


import { Component, OnInit } from '@angular/core';
// import {FormControl, FormGroup } from '@angular/forms';
import { FormBuilder } from '@angular/forms';

declare function page(): void;

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private fb:FormBuilder){}

  signUpForm = this.fb.group({
    name: [''],
    email: [''],
    password: ['']
  });

  // signUpForm = new FormGroup({
  //   name: new FormControl(''),
  //   email: new FormControl(''),
  //   password: new FormControl('')

  // });



  ngOnInit(): void {
    page(); // Call the page() function directly

    
  }
  // signUp(){
  //   console.log(this.signUpForm.value);
    
  // }
}

