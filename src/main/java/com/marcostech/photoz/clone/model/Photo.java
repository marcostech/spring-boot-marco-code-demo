package com.marcostech.photoz.clone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

//@Entity -> Maps this class to a database table
//Use the @Table annotation because the class uses a different name than our table in the DataBase
//our table name is defined with @Table
@Table("PHOTOZ")
public class Photo {
    @Id
    //@GeneratedValue only if the DataBase don't generate himself the value, in this case it does
    private Integer id;

    @NotEmpty
    private String fileName;

    @JsonIgnore
    private byte[] data;

    private String contentType;


    public Photo(){
    }


    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}
