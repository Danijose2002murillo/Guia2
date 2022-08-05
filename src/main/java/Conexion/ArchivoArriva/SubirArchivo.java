/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion.ArchivoArriva;

import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author ASUS I5
 */
public class SubirArchivo {
    
  public void uploadObject(
      /*String projectId, String bucketName, String objectName, String filePath*/) throws IOException {
    // The ID of your GCP project
     String projectId = "quiet-vector-356113";

    // The ID of your GCS bucket
     String bucketName = "mi_bucket_jodas2022";

    // The ID of your GCS object
     String objectName = "TrabajoGrupalGuia";

    // The path to your file to upload
     String filePath = "C:\\Users\\ASUS I5\\Pictures\\Camera Roll\\WIN_20220729_07_37_10_Pro.jpg";

    Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();
    BlobId blobId = BlobId.of(bucketName, objectName);
    BlobInfo blobInfo = BlobInfo.newBuilder(blobId).build();
    storage.create(blobInfo, Files.readAllBytes(Paths.get(filePath)));

    System.out.println(
        "File " + filePath + " uploaded to bucket " + bucketName + " as " + objectName);
  }
    
}
