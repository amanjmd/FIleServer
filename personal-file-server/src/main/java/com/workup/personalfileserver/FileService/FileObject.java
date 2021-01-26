package com.workup.personalfileserver.FileService;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileObject {

    private String fileNname;

    private String downloadLink;
    
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}
