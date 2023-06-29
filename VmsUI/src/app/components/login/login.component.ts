import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from 'app/services/user.service';
import Swal from 'sweetalert2';

declare function page(): void;

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  signUpForm!: FormGroup;
  signInForm!: FormGroup;
  
  constructor(private fb:FormBuilder, private snack: MatSnackBar, private userService: UserService ){}

  public user = {
    name: '',
    email: '',
    password: '',
    mobile: ''
  };

  ngOnInit(): void {
    page(); 

    this.signUpForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      password: ['', Validators.required],
      mobile:['',Validators.required]
    });
  
    this.signInForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', Validators.required]
    });
    
  }
  signUp(){
    // console.log(this.signUpForm.value); 
    this.userService.addUser(this.user).subscribe(
      (data:any)=>{
        console.log(data);
        Swal.fire("User Registered! Login!")
      },
      (error:any)=>{
          console.log(error);
          this.snack.open(error.error.text,'',{
            duration:3000,
          });
      }
    );
  }
  
  signIn(){
    console.log(this.signInForm.value); 
  }
}

