import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { AdminService } from 'app/services/admin.service';
import { Car } from './admin';

@Component({
  selector: 'app-admin-ride-share',
  templateUrl: './admin-ride-share.component.html',
  styleUrls: ['./admin-ride-share.component.css']
})
export class AdminRideShareComponent {
  car: Car = {
    carModel: '',
    carBrand: '',
    carYear: 0,
    available: false,
    carCapacity: 0,
    carImage: '',
    carDriver: ''
  };

  constructor(private adminService: AdminService, private http: HttpClient) { }

  saveCar() {
    this.adminService.saveCarDetails(this.car).subscribe(
      (response) => {
        console.log('Car details saved successfully', response);
        // Reset the form or perform any other actions
      },
      (error) => {
        console.error('Error saving car details', error);
        // Handle the error appropriately
      }
    );
  }

  selectedFile: File | null = null;
  handleFileInput(event: Event) {
    const target = event.target as HTMLInputElement;
    const files: FileList | null = target.files;
    if (files && files.length > 0) {
      this.selectedFile = files.item(0);
    }
  }

  uploadImage() {
    if (this.selectedFile) {
      const formData = new FormData();
      formData.append('image', this.selectedFile);

      this.http.post('/api/upload', formData).subscribe(
        (response) => {
          console.log('Image uploaded successfully');
          // Perform any additional actions after the image upload
        },
        (error) => {
          console.error('Error uploading image:', error);
          // Handle the error appropriately
        }
      );
    }
  }
}
