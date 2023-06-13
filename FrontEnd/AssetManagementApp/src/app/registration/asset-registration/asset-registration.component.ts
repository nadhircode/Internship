import { Component } from '@angular/core';
import { Asset } from 'src/app/asset'; // Import the Asset model
import { AssetService } from 'src/app/asset.service';

@Component({
  selector: 'app-asset-registration',
  templateUrl: './asset-registration.component.html',
  styleUrls: ['./asset-registration.component.css']
})
export class AssetRegistrationComponent {

  assetData: any = {};
  constructor(private assetService: AssetService) {}

  //asset: Asset = new Asset(); // Create an instance of the Asset model

  asset: any = {
    assetType: '',
    serialNumber: '',
    manufacturer: '',
    model: '',
    purchaseDate: '',
    status: ''
  };
  




  registerAsset() {
    // Logic to handle asset registration
  }

  onSubmit(): void {
    console.log(this.asset);
    this.assetService.registerAsset(this.asset).subscribe(
        response => {
          // Handle success response
          console.log('Asset registration successful:', response);
          // Reset the form
          this.assetData = {};
        },
        error => {
          // Handle error response
          console.error('Asset registration failed:', error);
        }
      );
  }

}
