package bam.jun.xiang.test;

import bam.jun.xiang.spi.IRepository;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainTest {

    public static void main(String[] args) {
        //通过ServiceLoader 加载类通过类加载(懒加载)
        ServiceLoader<IRepository> serviceLoader = ServiceLoader.load(IRepository.class);

        Iterator<IRepository> it = serviceLoader.iterator();
        while (it != null && it.hasNext()){
            IRepository repositoryService = it.next();
            System.out.println("class:" + repositoryService.getClass().getName());
            repositoryService.connect("172.0.0.1:3306");
        }
    }
}
