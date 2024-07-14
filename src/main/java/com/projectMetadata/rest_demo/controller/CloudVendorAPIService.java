package com.projectMetadata.rest_demo.controller;

import com.projectMetadata.rest_demo.model.cloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    cloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public cloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody cloudVendor cloudVendor) {
            this.cloudVendor = cloudVendor;
            return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody cloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String updateCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }

}
