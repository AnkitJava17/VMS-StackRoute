import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Note } from './note';

@Component({
  selector: 'app-tdcards',
  templateUrl: './tdcards.component.html',
  styleUrls: ['./tdcards.component.css']
})
export class TdcardsComponent {

  
  noteObj:Note;

  noteForm:FormGroup;

  constructor(private fb:FormBuilder)
  {
    this.noteObj=new Note();

    this.noteForm =  fb.group({

      noteTitle:['',Validators.required],
      noteDesc:['',Validators.compose([Validators.required,Validators.minLength(6)])]

    })

  }

  addNote(noteForm:FormGroup)
  {
    this.noteObj = noteForm.value;

    if(noteForm.valid)
    {
      console.log(this.noteObj.noteTitle);
      console.log(this.noteObj.noteDesc);
    }
  }



}
