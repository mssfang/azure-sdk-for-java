// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes a virtual machine scale set data disk.
 */
@Fluent
public final class VirtualMachineScaleSetDataDisk implements JsonSerializable<VirtualMachineScaleSetDataDisk> {
    /*
     * The disk name.
     */
    private String name;

    /*
     * Specifies the logical unit number of the data disk. This value is used to
     * identify data disks within the VM and therefore must be unique for each data
     * disk attached to a VM.
     */
    private int lun;

    /*
     * Specifies the caching requirements. Possible values are: **None,**
     * **ReadOnly,** **ReadWrite.** The default values are: **None for Standard
     * storage. ReadOnly for Premium storage.**
     */
    private CachingTypes caching;

    /*
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     */
    private Boolean writeAcceleratorEnabled;

    /*
     * The create option.
     */
    private DiskCreateOptionTypes createOption;

    /*
     * Specifies the size of an empty data disk in gigabytes. This element can be used
     * to overwrite the size of the disk in a virtual machine image. The property
     * diskSizeGB is the number of bytes x 1024^3 for the disk and the value cannot be
     * larger than 1023.
     */
    private Integer diskSizeGB;

    /*
     * The managed disk parameters.
     */
    private VirtualMachineScaleSetManagedDiskParameters managedDisk;

    /*
     * Specifies the Read-Write IOPS for the managed disk. Should be used only when
     * StorageAccountType is UltraSSD_LRS. If not specified, a default value would be
     * assigned based on diskSizeGB.
     */
    private Long diskIOPSReadWrite;

    /*
     * Specifies the bandwidth in MB per second for the managed disk. Should be used
     * only when StorageAccountType is UltraSSD_LRS. If not specified, a default value
     * would be assigned based on diskSizeGB.
     */
    private Long diskMBpsReadWrite;

    /*
     * Specifies whether data disk should be deleted or detached upon VMSS Flex
     * deletion (This feature is available for VMSS with Flexible OrchestrationMode
     * only).<br><br> Possible values: <br><br> **Delete** If this value is used, the
     * data disk is deleted when the VMSS Flex VM is deleted.<br><br> **Detach** If
     * this value is used, the data disk is retained after VMSS Flex VM is
     * deleted.<br><br> The default value is set to **Delete**.
     */
    private DiskDeleteOptionTypes deleteOption;

    /**
     * Creates an instance of VirtualMachineScaleSetDataDisk class.
     */
    public VirtualMachineScaleSetDataDisk() {
    }

    /**
     * Get the name property: The disk name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The disk name.
     * 
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the lun property: Specifies the logical unit number of the data disk. This value is used to
     * identify data disks within the VM and therefore must be unique for each data
     * disk attached to a VM.
     * 
     * @return the lun value.
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set the lun property: Specifies the logical unit number of the data disk. This value is used to
     * identify data disks within the VM and therefore must be unique for each data
     * disk attached to a VM.
     * 
     * @param lun the lun value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the caching property: Specifies the caching requirements. Possible values are: **None,**
     * **ReadOnly,** **ReadWrite.** The default values are: **None for Standard
     * storage. ReadOnly for Premium storage.**.
     * 
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: Specifies the caching requirements. Possible values are: **None,**
     * **ReadOnly,** **ReadWrite.** The default values are: **None for Standard
     * storage. ReadOnly for Premium storage.**.
     * 
     * @param caching the caching value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     * 
     * @return the writeAcceleratorEnabled value.
     */
    public Boolean writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     * 
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Get the createOption property: The create option.
     * 
     * @return the createOption value.
     */
    public DiskCreateOptionTypes createOption() {
        return this.createOption;
    }

    /**
     * Set the createOption property: The create option.
     * 
     * @param createOption the createOption value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withCreateOption(DiskCreateOptionTypes createOption) {
        this.createOption = createOption;
        return this;
    }

    /**
     * Get the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used
     * to overwrite the size of the disk in a virtual machine image. The property
     * diskSizeGB is the number of bytes x 1024^3 for the disk and the value cannot be
     * larger than 1023.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used
     * to overwrite the size of the disk in a virtual machine image. The property
     * diskSizeGB is the number of bytes x 1024^3 for the disk and the value cannot be
     * larger than 1023.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the managedDisk property: The managed disk parameters.
     * 
     * @return the managedDisk value.
     */
    public VirtualMachineScaleSetManagedDiskParameters managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The managed disk parameters.
     * 
     * @param managedDisk the managedDisk value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withManagedDisk(VirtualMachineScaleSetManagedDiskParameters managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the diskIOPSReadWrite property: Specifies the Read-Write IOPS for the managed disk. Should be used only when
     * StorageAccountType is UltraSSD_LRS. If not specified, a default value would be
     * assigned based on diskSizeGB.
     * 
     * @return the diskIOPSReadWrite value.
     */
    public Long diskIOPSReadWrite() {
        return this.diskIOPSReadWrite;
    }

    /**
     * Set the diskIOPSReadWrite property: Specifies the Read-Write IOPS for the managed disk. Should be used only when
     * StorageAccountType is UltraSSD_LRS. If not specified, a default value would be
     * assigned based on diskSizeGB.
     * 
     * @param diskIOPSReadWrite the diskIOPSReadWrite value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withDiskIOPSReadWrite(Long diskIOPSReadWrite) {
        this.diskIOPSReadWrite = diskIOPSReadWrite;
        return this;
    }

    /**
     * Get the diskMBpsReadWrite property: Specifies the bandwidth in MB per second for the managed disk. Should be used
     * only when StorageAccountType is UltraSSD_LRS. If not specified, a default value
     * would be assigned based on diskSizeGB.
     * 
     * @return the diskMBpsReadWrite value.
     */
    public Long diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }

    /**
     * Set the diskMBpsReadWrite property: Specifies the bandwidth in MB per second for the managed disk. Should be used
     * only when StorageAccountType is UltraSSD_LRS. If not specified, a default value
     * would be assigned based on diskSizeGB.
     * 
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withDiskMBpsReadWrite(Long diskMBpsReadWrite) {
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        return this;
    }

    /**
     * Get the deleteOption property: Specifies whether data disk should be deleted or detached upon VMSS Flex
     * deletion (This feature is available for VMSS with Flexible OrchestrationMode
     * only).&lt;br&gt;&lt;br&gt; Possible values: &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the
     * data disk is deleted when the VMSS Flex VM is deleted.&lt;br&gt;&lt;br&gt; **Detach** If
     * this value is used, the data disk is retained after VMSS Flex VM is
     * deleted.&lt;br&gt;&lt;br&gt; The default value is set to **Delete**.
     * 
     * @return the deleteOption value.
     */
    public DiskDeleteOptionTypes deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: Specifies whether data disk should be deleted or detached upon VMSS Flex
     * deletion (This feature is available for VMSS with Flexible OrchestrationMode
     * only).&lt;br&gt;&lt;br&gt; Possible values: &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the
     * data disk is deleted when the VMSS Flex VM is deleted.&lt;br&gt;&lt;br&gt; **Detach** If
     * this value is used, the data disk is retained after VMSS Flex VM is
     * deleted.&lt;br&gt;&lt;br&gt; The default value is set to **Delete**.
     * 
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withDeleteOption(DiskDeleteOptionTypes deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (createOption() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property createOption in model VirtualMachineScaleSetDataDisk"));
        }
        if (managedDisk() != null) {
            managedDisk().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineScaleSetDataDisk.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("lun", this.lun);
        jsonWriter.writeStringField("createOption", this.createOption == null ? null : this.createOption.toString());
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("caching", this.caching == null ? null : this.caching.toString());
        jsonWriter.writeBooleanField("writeAcceleratorEnabled", this.writeAcceleratorEnabled);
        jsonWriter.writeNumberField("diskSizeGB", this.diskSizeGB);
        jsonWriter.writeJsonField("managedDisk", this.managedDisk);
        jsonWriter.writeNumberField("diskIOPSReadWrite", this.diskIOPSReadWrite);
        jsonWriter.writeNumberField("diskMBpsReadWrite", this.diskMBpsReadWrite);
        jsonWriter.writeStringField("deleteOption", this.deleteOption == null ? null : this.deleteOption.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetDataDisk from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetDataDisk if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetDataDisk.
     */
    public static VirtualMachineScaleSetDataDisk fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetDataDisk deserializedVirtualMachineScaleSetDataDisk
                = new VirtualMachineScaleSetDataDisk();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("lun".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetDataDisk.lun = reader.getInt();
                } else if ("createOption".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetDataDisk.createOption
                        = DiskCreateOptionTypes.fromString(reader.getString());
                } else if ("name".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetDataDisk.name = reader.getString();
                } else if ("caching".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetDataDisk.caching = CachingTypes.fromString(reader.getString());
                } else if ("writeAcceleratorEnabled".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetDataDisk.writeAcceleratorEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("diskSizeGB".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetDataDisk.diskSizeGB = reader.getNullable(JsonReader::getInt);
                } else if ("managedDisk".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetDataDisk.managedDisk
                        = VirtualMachineScaleSetManagedDiskParameters.fromJson(reader);
                } else if ("diskIOPSReadWrite".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetDataDisk.diskIOPSReadWrite
                        = reader.getNullable(JsonReader::getLong);
                } else if ("diskMBpsReadWrite".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetDataDisk.diskMBpsReadWrite
                        = reader.getNullable(JsonReader::getLong);
                } else if ("deleteOption".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetDataDisk.deleteOption
                        = DiskDeleteOptionTypes.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetDataDisk;
        });
    }
}
