package com.bytes.finalAssesment.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytes.finalAssesment.Repository.AssetRepository;
import com.bytes.finalAssesment.models.Asset;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AssetService {
    private final AssetRepository assetRepository;

    @Autowired
    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    public Asset getAssetById(Long id) {
        return assetRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Asset not found"));
    }

    public Asset createAsset(Asset asset) {
        // Additional business logic if needed
        return assetRepository.save(asset);
    }

    public Asset updateAsset(Long id, Asset updatedAsset) {
        Asset existingAsset = assetRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Asset not found"));

        // Update the fields of the existingAsset with the values from updatedAsset
        existingAsset.setAssetType(updatedAsset.getAssetType());
        existingAsset.setSerialNumber(updatedAsset.getSerialNumber());
        existingAsset.setManufacturer(updatedAsset.getManufacturer());
        existingAsset.setModel(updatedAsset.getModel());
        existingAsset.setPurchaseDate(updatedAsset.getPurchaseDate());
        existingAsset.setCurrentLocation(updatedAsset.getCurrentLocation());
        existingAsset.setStatus(updatedAsset.getStatus());

        return assetRepository.save(existingAsset);
    }

    public void deleteAsset(Long id) {
        assetRepository.deleteById(id);
    }
    
    public List<Asset> searchAssets(String searchKeyword) {
        // Assuming searchKeyword can be either asset ID, serial number, manufacturer, or model
        Long assetId = null;
        String serialNumber = null;
        String manufacturer = null;
        String model = null;

        // Try parsing the searchKeyword to an asset ID
        try {
            assetId = Long.parseLong(searchKeyword);
        } catch (NumberFormatException e) {
            // Not a valid asset ID, check other attributes
            // Assuming the searchKeyword should be an exact match for serial number, manufacturer, or model
            serialNumber = searchKeyword;
            manufacturer = searchKeyword;
            model = searchKeyword;
        }

        return assetRepository.findByAssetIdOrSerialNumberOrManufacturerOrModel(assetId, serialNumber, manufacturer, model);
    }

    public void updateAssetLocation(Long assetId, String location) {
        assetRepository.updateAssetLocation(assetId, location);
    }

    public void updateAssetStatus(Long assetId, String status) {
        assetRepository.updateAssetStatus(assetId, status);
    }
    
    
}
