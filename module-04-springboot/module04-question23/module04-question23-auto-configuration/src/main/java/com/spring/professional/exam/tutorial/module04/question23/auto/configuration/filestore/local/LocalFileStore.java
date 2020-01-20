package com.spring.professional.exam.tutorial.module04.question23.auto.configuration.filestore.local;

import com.spring.professional.exam.tutorial.module04.question23.auto.configuration.filestore.FileStore;

class LocalFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("local filestore");
    }
}
