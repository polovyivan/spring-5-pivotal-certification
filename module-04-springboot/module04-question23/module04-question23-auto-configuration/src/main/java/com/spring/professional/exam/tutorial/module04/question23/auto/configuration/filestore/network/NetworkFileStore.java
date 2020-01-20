package com.spring.professional.exam.tutorial.module04.question23.auto.configuration.filestore.network;

import com.spring.professional.exam.tutorial.module04.question23.auto.configuration.filestore.FileStore;

class NetworkFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("network filestore");
    }
}
