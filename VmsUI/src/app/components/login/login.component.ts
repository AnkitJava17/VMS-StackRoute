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
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

declare function page(): void;

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  

  signUpForm!: FormGroup;
  signInForm!: FormGroup;
  
  constructor(private fb:FormBuilder){}

  
  // signUpForm = new FormGroup({
  //   name: new FormControl(''),
  //   email: new FormControl(''),
  //   password: new FormControl('')

  // });


  ngOnInit(): void {
    page(); 

    this.signUpForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      password: ['', Validators.required]
    });
  
    this.signInForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', Validators.required]
    });
    
  }
  signUp(){
    console.log(this.signUpForm.value); 
  }
  
  signIn(){
    console.log(this.signInForm.value); 
  }
}

